package de.uni.leipzig.H2Oberfleache.controller;

import de.uni.leipzig.H2Oberfleache.tables.Table;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HtmlBuilder {
    String html = "";
    String css = BaseController.css;
    Map<Integer, List<Table.Attribute>> hirarchie_attributes = new HashMap<>();

    public HtmlBuilder(Table table, String sql) throws SQLException {
        Map<String, List<String>> table_subtable = Tables.getTable_Subtable();
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
        for (List<Table.Inhalt> inhaltList : table.inhalt) {
            for (Table.Attribute attribute : table.attributes) {

            }
        }
        html = makeFinalHtml(table, tabelname_Attribute);
    }

    private Integer tiefe(Integer tiefe, String tabellenname, List<Table.Attribute> attributes){
        String obertabelle;
        for (String attribute : Tables.getAllAttributes(tabellenname)) {
            if(attribute.startsWith("__") && attribute.endsWith("ID") && !attribute.equals("__" + tabellenname + "ID")){
                obertabelle = attribute.substring(2, attribute.length()-2);
                for (Table.Attribute attribute1 : attributes) {
                    if(attribute1.getTable().equals(obertabelle)){
                        tiefe++;
                        tiefe = tiefe(tiefe, obertabelle, attributes);
                        break;
                    }
                }
            }
        }
        return tiefe;
    }

    //Todo: optimieren
    private Integer getHoechsteSchachtelung(List<Table.Attribute> attribute){
        Integer attributCounter = 0;
        Integer hoehe = 0;
        while (attributCounter < attribute.size()) {
            for (Table.Attribute attribut : attribute) {
                Integer tiefe = tiefe(0, attribut.getTable(), attribute);
                if (tiefe == hoehe) {
                    attributCounter++;
                }
            }
            hoehe++;
        }
        return hoehe;
    }

    private String addHead(Table table, Map<String, List<Table.Attribute>> tabelname_Attribute){
        String head = "<thead>\n";
        Integer groessteHoehe = getHoechsteSchachtelung(table.attributes);
        Integer attributCounter = 0;
        Integer hirarchie = 0;
        Integer hoehe = 0;
        List<String> schonEnthalten = new ArrayList<>();
        while (attributCounter < table.attributes.size()) {
            List<Table.Attribute> attributes = new ArrayList<>();
            head += "    <tr>\n";
            for (Table.Attribute attribute : table.attributes) {
                Integer tiefe = tiefe(0, attribute.getTable(), table.attributes);
                if (tiefe == hoehe) {
                    head += "<th rowspan=\"" + (groessteHoehe-hoehe) + "\">" + attribute.getWert() + "</th>\n";
                    attributCounter++;
                    attributes.add(attribute);
                }
                if (tiefe == hoehe + 1 && !schonEnthalten.contains(attribute.getTable())) {
                    head += "<th colspan=\"" + tabelname_Attribute.get(attribute.getTable()).size() + "\">" +
                            attribute.getTable() + "</th>";
                    schonEnthalten.add(attribute.getTable());
                }
            }
            head += "    </tr>\n";
            hoehe++;
            hirarchie_attributes.put(hirarchie, attributes);
            hirarchie++;
        }
        head += "  </thead>\n ";
        return head;
    }

    private Integer getTable_rowspan(Map<String, Map<Integer, List<Table.Inhalt>>> attribut_value_inhalte, String tablename, Integer value){
        String attributname = "__" + tablename + "ID";
        return attribut_value_inhalte.get(attributname).get(value).size();
    }

    private String addBody(Table table){
        String body = "<tbody>\n";
        List<String> IDs = new ArrayList<>();
        List<List<Map<Integer, String>>> trList = getNewTubleList(IDs, table.attributes, table.inhalt, 0);
        for (List<Map<Integer, String>> maps : trList) {
            Integer counter = 0;
            Integer position = 0;
            for (Map<Integer, String> map : maps) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    if(position >= entry.getKey()){
                        if(counter != 0) body += "    </tr><tr>\n";
                        else body += "    <tr>\n";
                        counter++;
                    }
                    position = entry.getKey();
                    body += entry.getValue();
                }
            }
        }

        body += "  </tbody>\n ";
        return body;
    }

    private List<List<Map<Integer, String>>> getNewTubleList(List<String> IDs, List<Table.Attribute> attributes, List<List<Table.Inhalt>> zeilen, Integer ebende){
        List<Map<Integer, String>> schonGenutzteIDs = new ArrayList<>();
        List<List<List<Table.Inhalt>>> newTubleList = new ArrayList<>();
        List<List<Map<Integer, String>>> trs = new ArrayList<>();
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
                for (Table.Attribute hauptID : highestAttributes) {
                    String html = "";
                    if(rowspan <= 1)  html = "      <td>" + inhalt.get(hauptID.getNummer()).getWert() + "</td>\n";
                    else html = "      <td rowspan=\" " + rowspan + "\">" + inhalt.get(hauptID.getNummer()).getWert() + "</td>\n";
                    Map<Integer, String> helper = new HashMap<>();
                    helper.put(hauptID.getNummer(), html);
                    attribut_tds.add(helper);
                }
                if(hirarchie_attributes.containsKey(ebende+1)) {
                    List<List<Map<Integer, String>>> neu = getNewTubleList(IDs, attributes, newTuble, (ebende+1));
                    for (List<Map<Integer, String>> maps : neu) {
                        attribut_tds.addAll(maps);
                    }
                }
                //erzeuge HTML Zeilen
                trs.add(attribut_tds);
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

    private String makeFinalHtml(Table table, Map<String, List<Table.Attribute>> tabelname_Attribute){
        return css +
                "<table border=\"1\">\n" +
                addHead(table, tabelname_Attribute) +
                "\n" +
                addBody(table) +
                "</table>";
    }
}
