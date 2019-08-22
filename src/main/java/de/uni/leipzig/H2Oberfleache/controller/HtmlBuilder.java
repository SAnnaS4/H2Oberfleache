package de.uni.leipzig.H2Oberfleache.controller;

import de.uni.leipzig.H2Oberfleache.statementRefactoring.Statement;
import de.uni.leipzig.H2Oberfleache.tables.Table;

import java.util.*;

public class HtmlBuilder {
    String html = "";
    String css = BaseController.css;
    Map<Integer, List<Table.Attribute>> hirarchie_attributes = new HashMap<>();
    String highestTablename = "";
    List<Integer> ids = new ArrayList<>();

    public HtmlBuilder(Table table, String sql) {
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
       // List<List<Table.Inhalt>> inhalt = updateInhalt(table.inhalt, tabelname_Attribute);
        html = makeFinalHtml(table.inhalt, head, table.attributes, tabelname_Attribute);
    }

    private Map<String, List<List<Table.Inhalt>>> getTablename_Inhalt(List<List<Table.Inhalt>> inhalt, Map<String, List<Table.Attribute>> tabelname_Attribute){
        Map<String, List<List<Table.Inhalt>>> tabelname_Inhalte = new HashMap<>();
        for (Map.Entry<String, List<Table.Attribute>> entry : tabelname_Attribute.entrySet()) {
            String tablename = entry.getKey();
            List<List<Table.Inhalt>> tupelList = new ArrayList<>();
            for (List<Table.Inhalt> list : inhalt) {
                List<Table.Inhalt> tupel = new ArrayList<>();
                for (Table.Attribute attribute : entry.getValue()) {
                    tupel.add(list.get(attribute.getNummer()));
                }
                tupelList.add(tupel);
            }
            tabelname_Inhalte.put(tablename, tupelList);
        }
        Map<String, List<List<Table.Inhalt>>> newtabelname_Inhalte = new HashMap<>();
        for (Map.Entry<String, List<List<Table.Inhalt>>> table : tabelname_Inhalte.entrySet()) {
            int schluessel = 0;
            List<List<Table.Inhalt>> newInhalt = new ArrayList<>();
            for (Table.Attribute attribute : tabelname_Attribute.get(table.getKey())) {
                if(attribute.getWert().equals("__" + table.getKey() + "ID"))schluessel=attribute.getNummer();
            }
            List<String> schluesselList = new ArrayList<>();
            for (List<Table.Inhalt> tupel : table.getValue()) {
                String wert = "";
                for (Table.Inhalt inhalt1 : tupel) {
                    if(inhalt1.getAttribute().getWert().equals("__" + table.getKey() + "ID"))wert=inhalt1.getWert();
                }
                if(!schluesselList.contains(wert)){
                    newInhalt.add(tupel);
                    schluesselList.add(wert);
                }
            }
            newtabelname_Inhalte.put(table.getKey(), newInhalt);
        }
        return newtabelname_Inhalte;
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

    private List<Map<Integer, String>> getPosition_value(List<List<Table.Inhalt>> inhalt, Map<String, List<Table.Attribute>> tabelname_Attribute){
        Map<String, List<List<Table.Inhalt>>> tablename_inhalt = getTablename_Inhalt(inhalt, tabelname_Attribute);
        List<String> tablenames = new ArrayList<>();
        tablenames.add(highestTablename);
        return getTds("", tablenames, "", tablename_inhalt);
    }

    private List<Map<Integer, String>> getTds(String OTschluesselValue, List<String> tablenames, String OTSchluessel,
                                              Map<String, List<List<Table.Inhalt>>> tablename_inhalt){
        List<Map<Integer, String>> position_value = new ArrayList<>();
        Map<String, Map<List<Table.Inhalt>, List<Map<Integer, String>>>> tablename_listInhalt_subValue = new HashMap<>();
        for (String tablename : tablenames) {
            String mySchluessel = "__" + tablename + "ID";
            Map<List<Table.Inhalt>, List<Map<Integer, String>>> listInhalt_subValue = new HashMap<>();
            for (List<Table.Inhalt> inhaltList : tablename_inhalt.get(tablename)) {
                List<String> subtables = Statement.getNF2TableNames(tablename);
                String mySchluesselValue = "";
                for (Table.Inhalt inhalt : inhaltList) {
                    if((inhalt.getAttribute().getWert().equals(OTSchluessel) && inhalt.getWert().equals(OTschluesselValue)) || OTSchluessel.equals("")){
                        for (Table.Inhalt inhalt1 : inhaltList) {
                            if (inhalt1.getAttribute().getWert().equals(mySchluessel))
                                mySchluesselValue = inhalt1.getWert();
                        }
                    }
                }
                List<Map<Integer, String>> subValues = new ArrayList<>();
                if(!subtables.isEmpty()){
                    subValues = getTds(mySchluesselValue, subtables, mySchluessel, tablename_inhalt);
                }
                listInhalt_subValue.put(inhaltList, subValues);
            }
            tablename_listInhalt_subValue.put(tablename, listInhalt_subValue);
        }
        Map<Integer, String> map = new HashMap<>();
        Integer rowspan = 1;
        for (Table.Inhalt inhalt1 : inhaltList) {
            String html = "<td rowspan=" + rowspan + ">" + inhalt1.getWert() + "</td>\n";
            map.put(inhalt1.getAttribute().getNummer(), html);
            if(!subValues.isEmpty())map.putAll(subValues.get(0));
        }
        position_value.add(map);
        for(int i = 1; i< subValues.size(); i++){
            Map<Integer, String> map1 = subValues.get(i);
            position_value.add(map1);
        }
        return position_value;
    }

    private String addBody(List<List<Table.Inhalt>> inhalt, List<Table.Attribute> attributes, Map<String, List<Table.Attribute>> tabelname_Attribute){
        String body = "<tbody>\n";
        List<Map<Integer, String>> trList = getPosition_value(inhalt, tabelname_Attribute);
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

    private String makeFinalHtml(List<List<Table.Inhalt>> inhalt, String head, List<Table.Attribute> attributes, Map<String, List<Table.Attribute>> tabelname_Attribute){
        return css +
                "<table border=\"1\">\n" +
                head +
                "\n" +
                addBody(inhalt, attributes, tabelname_Attribute) +
                "</table>";
    }
}
