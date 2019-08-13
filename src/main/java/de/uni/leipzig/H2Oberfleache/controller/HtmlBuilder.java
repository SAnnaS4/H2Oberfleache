package de.uni.leipzig.H2Oberfleache.controller;

import de.uni.leipzig.H2Oberfleache.statementRefactoring.Statement;
import de.uni.leipzig.H2Oberfleache.tables.Table;

import java.sql.SQLException;
import java.util.*;

public class HtmlBuilder {
    String html = "";
    String css = BaseController.css;
    Map<Integer, List<Table.Attribute>> hirarchie_attributes = new HashMap<>();
    String highestTablename = "";
    List<Integer> ids = new ArrayList<>();

    public HtmlBuilder(Table table, String sql) throws SQLException {
        Map<String, List<Table.Attribute>> tabelname_Attribute = new HashMap<>();
        for (Table.Attribute attribute : table.attributes) {
            if(!tabelname_Attribute.containsKey(attribute.getTable())){
                List<Table.Attribute> attributes = new ArrayList<>();
                attributes.add(attribute);
                tabelname_Attribute.put(attribute.getTable(), attributes);
            }else {
                List<Table.Attribute> attributes = tabelname_Attribute.get(attribute.getTable());
                attributes.add(attribute);
                tabelname_Attribute.put(attribute.getTable(), attributes);
            }
        }
        String head = addHead(table.attributes, tabelname_Attribute);
        List<List<Table.Inhalt>> inhalt = updateInhalt(table.inhalt, tabelname_Attribute);
        List<Table.Attribute> attributes = table.attributes;
        html = makeFinalHtml(inhalt, head, attributes);
    }

    //todo: suche alle attributekombinationen einer untertabelle mit der selben obertabID
    //todo: lösche alle anderen tuple und lösche sie + setzte überflüssige Inhalte = null
    private List<List<Table.Inhalt>> updateInhalt(List<List<Table.Inhalt>> inhalt, Map<String, List<Table.Attribute>> tabelname_Attribute){
        List<Integer> untertabAttribute = new ArrayList<>();
        for (Map.Entry<String, List<Table.Attribute>> entry : tabelname_Attribute.entrySet()) {
            if(!entry.getKey().equals(highestTablename)) {
                List<List<String>> neueInhalte = new ArrayList<>();
                for (List<Table.Inhalt> inhaltList : inhalt) {
                    List<String> inhalte = new ArrayList<>();
                    for (Table.Attribute attribute : entry.getValue()) {
                        inhalte.add(inhaltList.get(attribute.getNummer()).getWert());
                        if(!untertabAttribute.contains(attribute.getNummer()))untertabAttribute.add(attribute.getNummer());
                    }
                    if(!neueInhalte.contains(inhalte))neueInhalte.add(inhalte);
                    else {
                        for (Table.Attribute attribute : entry.getValue()) {
                            inhaltList.get(attribute.getNummer()).setWert("");
                        }
                    }
                }
            }
        }
        for (Iterator<List<Table.Inhalt>> iter = inhalt.iterator(); iter.hasNext(); ) {
            List<Table.Inhalt> element = iter.next();
            Boolean nurLeer = true;
            for (Integer integer : untertabAttribute) {
                if(!element.get(integer).getWert().equals(""))nurLeer = false;
            }
            if(nurLeer)iter.remove();
        }
        return inhalt;
    }

    private Map<String, Integer> getHoechsteSchachtelung(Map<String, List<Table.Attribute>> tabelname_Attribute, List<Table.Attribute> attribute){
        List<String> tables = new ArrayList<>();
        Integer tiefe = 0;
        String highestTable = "";
        for (Table.Attribute attribut : attribute) {
            if(!tables.contains(attribut.getTable())) {
                Integer neu = tiefe(tabelname_Attribute, attribut.getTable(), "");
                if(neu > tiefe){
                    highestTable = attribut.getTable();
                    tiefe=neu;
                }
                tables.add(attribut.getTable());
            }
        }
        Map<String, Integer> result = new HashMap<>();
        result.put(highestTable, tiefe);
        return result;
    }

    private Integer getColspan(Map<String, List<Table.Attribute>> tabelname_Attribute, String tablename){
        Integer colspan = 0;
        for (Table.Attribute attribute : tabelname_Attribute.get(tablename)) {
            if(!ids.contains(attribute.getNummer()))++colspan;
        }
        List<String> subtables = Statement.getNF2TableNamesRec(tablename);
        for (String subtable : subtables) {
            if(tabelname_Attribute.containsKey(subtable)){
                for (Table.Attribute attribute : tabelname_Attribute.get(subtable)) {
                    if(!ids.contains(attribute.getNummer()))++colspan;
                }
            }
        }
        return colspan;
    }

    private Integer tiefe(Map<String, List<Table.Attribute>> tabelname_Attribute, String tablename, String zielTabelle){
        List<String> subtables = Statement.getNF2TableNames(tablename);
        Integer highestSubtable = 0;
        Boolean isNested = false;
        if(tablename.equals(zielTabelle))return 0;
        for (String subtable : subtables) {
            if(subtable.equals(zielTabelle))return 1;
            if(tabelname_Attribute.containsKey(subtable)){
                Integer neu = tiefe(tabelname_Attribute, subtable, zielTabelle);
                if(neu > highestSubtable) highestSubtable = neu;
                isNested = true;
            }
        }
        if(isNested)highestSubtable += 1;
        return highestSubtable;
    }

    private String addHead(List<Table.Attribute> attributes, Map<String, List<Table.Attribute>> tabelname_Attribute){
        String head = "<thead>\n";
        for (Table.Attribute attribute : attributes) {
            if (attribute.getWert().startsWith("__") && attribute.getWert().endsWith("ID")) {
                ids.add(attribute.getNummer());
            }
        }
        for(Iterator<Map.Entry<String, List<Table.Attribute>>> it = tabelname_Attribute.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, List<Table.Attribute>> entry = it.next();
            Boolean nurIDs = true;
            for (Table.Attribute attribute : entry.getValue()) {
                if(!ids.contains(attribute.getNummer()))nurIDs = false;
            }
            if (nurIDs)it.remove();
        }
        Map<String, Integer> highestTable_hoehe = getHoechsteSchachtelung(tabelname_Attribute, attributes);
        Integer groessteHoehe = 0;
        for (Map.Entry<String, Integer> entry : highestTable_hoehe.entrySet()) {
            highestTablename = entry.getKey();
            groessteHoehe = entry.getValue();
        }
        Integer attributCounter = 0;
        Integer hirarchie = 0;
        Integer hoehe = 0;
        List<String> schonEnthalten = new ArrayList<>();
        while (attributCounter < attributes.size()-ids.size()) {
            List<Table.Attribute> neueListe = new ArrayList<>();
            head += "    <tr>\n";
            for (Table.Attribute attribute : attributes) {
                if (tabelname_Attribute.containsKey(attribute.getTable())) {
                    Integer tiefe = tiefe(tabelname_Attribute, highestTablename, attribute.getTable());
                    if (tiefe == hoehe) {
                        if (!ids.contains(attribute.getNummer())) {
                            head += "<th rowspan=\"" + (groessteHoehe - hoehe + 1) + "\">" + attribute.getWert() + "</th>\n";
                            attributCounter++;
                        }
                        neueListe.add(attribute);
                    }
                    if (tiefe == hoehe + 1 && !schonEnthalten.contains(attribute.getTable())) {
                        head += "<th colspan=\"" + getColspan(tabelname_Attribute, attribute.getTable()) + "\">" +
                                getTablename(attribute.getTable()) + "</th>";
                        schonEnthalten.add(attribute.getTable());
                    }
                }
            }
            hirarchie_attributes.put(hirarchie, neueListe);
            head += "    </tr>\n";
            hoehe++;
            hirarchie++;
        }
        head += "  </thead>\n ";
        return head;
    }

    private String getTablename(String tablename){
        String[] names = tablename.split("_");
        return names[names.length-1];
    }

    private Integer getTable_rowspan(Map<String, Map<Integer, List<Table.Inhalt>>> attribut_value_inhalte, String tablename, Integer value){
        String attributname = "__" + tablename + "ID";
        return attribut_value_inhalte.get(attributname).get(value).size();
    }

    private String addBody(List<List<Table.Inhalt>> inhalt, List<Table.Attribute> attributes){
        String body = "<tbody>\n";
        List<String> IDs = new ArrayList<>();
        List<Map<Integer, String>> trList = getNewTubleList(IDs, attributes, inhalt, 0);
        Integer counter = 0;
        Integer position = 0;
       for (Map<Integer, String> map : trList) {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if(position >= entry.getKey()){
                    if(counter != 0) body += "    </tr><tr>\n";
                    else body += "    <tr>\n";
                    counter++;
                }
                position = entry.getKey();
                if(!ids.contains(position)) {
                    body += entry.getValue();
                }
            }
        }

        body += "  </tbody>\n ";
        return body;
    }

    private List<Map<Integer, String>> getNewTubleList(List<String> IDs, List<Table.Attribute> attributes, List<List<Table.Inhalt>> zeilen, Integer ebende){
        List<Map<Integer, String>> schonGenutzteIDs = new ArrayList<>();
        List<List<List<Table.Inhalt>>> newTubleList = new ArrayList<>();
        List<Map<Integer, String>> trs = new ArrayList<>();
        List<Integer> hauptIDs = new ArrayList<>();
        List<Table.Attribute> highestAttributes = hirarchie_attributes.get(ebende);
        for (Table.Attribute attribute : attributes) {
            if (attribute.isIn(highestAttributes)) {
                String idName = "__" + attribute.getTable() + "ID";
                if (attribute.getWert().equals(idName)) {
                    hauptIDs.add(attribute.getNummer());
                    IDs.add(attribute.getWert());
                }
            }
        }
        for (List<Table.Inhalt> inhalt : zeilen) {
            List<List<Table.Inhalt>> newTuble = new ArrayList<>();
            Map<Integer, String> id_value = new HashMap<>();
            for (Integer hauptID : hauptIDs) {
                id_value.put(hauptID, inhalt.get(hauptID).getWert());
            }
            if(!schonGenutzteIDs.contains(id_value) || id_value.isEmpty()) {
                schonGenutzteIDs.add(id_value);
                for (List<Table.Inhalt> tuple : zeilen) {
                    Boolean partOfTuple = true;
                    for (Map.Entry<Integer, String> entry : id_value.entrySet()) {
                        if (!tuple.get(entry.getKey()).getWert().equals(entry.getValue())) partOfTuple = false;
                    }
                    if (partOfTuple)newTuble.add(tuple);
                }
                List<Map<Integer, String>> attribut_tds = new ArrayList<>();
                Integer rowspan = newTuble.size();
                if(!hirarchie_attributes.containsKey(ebende+1))rowspan = 1;
                List<Map<Integer, String>> nextLine = new ArrayList<>();
                for (Table.Attribute hauptAtt : highestAttributes) {
                    String html = "";
                        if (rowspan <= 1) html = "      <td>" + inhalt.get(hauptAtt.getNummer()).getWert() + "</td>\n";
                        else
                            html = "      <td rowspan=\" " + rowspan + "\">" + inhalt.get(hauptAtt.getNummer()).getWert() + "</td>\n";
                        Map<Integer, String> helper = new HashMap<>();
                        helper.put(hauptAtt.getNummer(), html);
                        nextLine.add(helper);
                }
                if(hirarchie_attributes.containsKey(ebende+1)) {
                    List<Map<Integer, String>> neu = getNewTubleList(IDs, attributes, newTuble, (ebende+1));
                    Integer anzahl = 0;
                    for (Table.Attribute attribute : attributes) {
                        for (Map<Integer, String> map : neu) {
                            Integer nummer = 0;
                            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                                nummer = entry.getKey();
                            }
                            if(nummer == attribute.getNummer()){
                                attribut_tds.add(map);
                                anzahl++;
                                break;
                            }
                        }
                        for (Map<Integer, String> map : nextLine) {
                            Integer nummer = 0;
                            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                                nummer = entry.getKey();
                            }
                            if(nummer == attribute.getNummer()){
                                attribut_tds.add(map);
                                break;
                            }
                        }
                    }
                    for (int i = anzahl; i< neu.size(); i++) {
                        attribut_tds.add(neu.get(i));
                    }
                }else attribut_tds = nextLine;
                //erzeuge HTML Zeilen
                trs.addAll(attribut_tds);
                newTubleList.add(newTuble);
            }
        }
        return trs;
    }

    private List<String> InhaltToString(List<Table.Inhalt> inhalt){
        List<String> asString = new ArrayList<>();
        for (Table.Inhalt inhalt1 : inhalt) {
            asString.add(inhalt1.getWert());
        }
        return asString;
    }

    private String makeFinalHtml(List<List<Table.Inhalt>> inhalt, String head, List<Table.Attribute> attributes){
        return css +
                "<table border=\"1\">\n" +
                head +
                "\n" +
                addBody(inhalt, attributes) +
                "</table>";
    }
}
