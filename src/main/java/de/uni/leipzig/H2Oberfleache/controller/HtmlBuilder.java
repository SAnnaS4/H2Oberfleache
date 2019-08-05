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

    private Integer tiefe(Integer tiefe, String tabellenname){
        String obertabelle;
        for (String attribute : Tables.getAllAttributes(tabellenname)) {
            if(attribute.startsWith("__") && attribute.endsWith("ID") && !attribute.equals("__" + tabellenname + "ID")){
                tiefe++;
                obertabelle = attribute.substring(2, attribute.length()-2);
                tiefe = tiefe(tiefe, obertabelle);
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
                Integer tiefe = tiefe(0, attribut.getTable());
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
        Integer hoehe = 0;
        List<String> schonEnthalten = new ArrayList<>();
        while (attributCounter < table.attributes.size()) {
            head += "    <tr>\n";
            for (Table.Attribute attribute : table.attributes) {
                Integer tiefe = tiefe(0, attribute.getTable());
                if (tiefe == hoehe) {
                    head += "<th rowspan=\"" + (groessteHoehe-hoehe) + "\">" + attribute.getWert() + "</th>\n";
                    attributCounter++;
                }
                if (tiefe == hoehe + 1 && !schonEnthalten.contains(attribute.getTable())) {
                    head += "<th colspan=\"" + tabelname_Attribute.get(attribute.getTable()).size() + "\">" +
                            attribute.getTable() + "</th>";
                    schonEnthalten.add(attribute.getTable());
                }
            }
            head += "    </tr>\n";
            hoehe++;
        }
        head += "  </thead>\n ";
        return head;
    }

    private Integer getTable_rowspan(Map<String, Map<Integer, List<Table.Inhalt>>> attribut_value_inhalte, String tablename, Integer value){
        String attributname = "__" + tablename + "ID";
        return attribut_value_inhalte.get(attributname).get(value).size();
    }

//    private String addBody(Table table, Map<String, Map<Integer, List<Table.Inhalt>>> attribut_value_inhalte){
//        String body = "<tbody>\n";
//        Integer attributCounter = 0;
//        Map<String, Integer> table_rowspan = new HashMap<>();
//        Integer hoehe = 0;
//        List<String> schonEnthalten = new ArrayList<>();
//        for (List<Table.Inhalt> inhalt : table.inhalt) {
//            while (attributCounter < table.attributes.size()) {
//                body += "    <tr>\n";
//                for (Table.Attribute attribute : table.attributes) {
//                    if (tiefe == hoehe) {
//                        body += "<th rowspan=\"" +
//                                getTable_rowspan(attribut_value_inhalte, attribute.getTable(), 5) +
//                                "\">" + attribute.getWert() + "</th>\n";
//                        attributCounter++;
//                    }
//                    if (tiefe == hoehe + 1 && !schonEnthalten.contains(attribute.getTable())) {
//                        body += "<th colspan=\"" + tabelname_Attribute.get(attribute.getTable()).size() + "\">" +
//                                attribute.getTable() + "</th>";
//                        schonEnthalten.add(attribute.getTable());
//                    }
//                }
//                body += "    </tr>\n";
//                hoehe++;
//            }
//        }
//        body += "  </thead>\n ";
//        return body;
//    }

    private String makeFinalHtml(Table table, Map<String, List<Table.Attribute>> tabelname_Attribute){
        return css +
                "<table border=\"1\">\n" +
                addHead(table, tabelname_Attribute) +
                //"\n" +
               // addBody(table, seperatedSubTable) +
                "</table>";
    }
}
