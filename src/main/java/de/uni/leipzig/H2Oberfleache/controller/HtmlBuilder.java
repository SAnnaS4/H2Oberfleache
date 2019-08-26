package de.uni.leipzig.H2Oberfleache.controller;

import de.uni.leipzig.H2Oberfleache.jdbc.DbInfo;
import de.uni.leipzig.H2Oberfleache.statementRefactoring.Statement;
import de.uni.leipzig.H2Oberfleache.tables.Table;

import java.sql.SQLException;
import java.util.*;

public class HtmlBuilder {
    String html = "";
    String css = BaseController.css;
    Map<Integer, List<Table.Attribute>> hirarchie_attributes = new HashMap<>();
    List<String> highestTablename = new ArrayList<>();
    List<Integer> ids = new ArrayList<>();

    public HtmlBuilder(Table table) {
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
        Map<String, List<Table.Attribute>> alletabelname_Attribute = new HashMap<>(tabelname_Attribute);
        String head = addHead(table.attributes, tabelname_Attribute);
        html = makeFinalHtml(table.inhalt, head, table.attributes, alletabelname_Attribute);
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
            if (!isNF2Table(table.getKey())) {
                newtabelname_Inhalte.put(table.getKey(), table.getValue());
            } else {
                int schluessel = 0;
                List<List<Table.Inhalt>> newInhalt = new ArrayList<>();
                for (Table.Attribute attribute : tabelname_Attribute.get(table.getKey())) {
                    if (attribute.getWert().equals("__" + table.getKey() + "ID")) schluessel = attribute.getNummer();
                }
                List<String> schluesselList = new ArrayList<>();
                for (List<Table.Inhalt> tupel : table.getValue()) {
                    String wert = "";
                    for (Table.Inhalt inhalt1 : tupel) {
                        if (inhalt1.getAttribute().getWert().equals("__" + table.getKey() + "ID"))
                            wert = inhalt1.getWert();
                    }
                    if (!schluesselList.contains(wert)) {
                        newInhalt.add(tupel);
                        schluesselList.add(wert);
                    }
                }
                newtabelname_Inhalte.put(table.getKey(), newInhalt);
            }
        }
        return newtabelname_Inhalte;
    }

    private Map<List<String>, Integer> getHoechsteSchachtelung(Map<String, List<Table.Attribute>> tabelname_Attribute, List<Table.Attribute> attribute){
        List<String> tables = new ArrayList<>();
        Integer tiefe = 0;
        List<String> highestTable = new ArrayList<>();
        for (Table.Attribute attribut : attribute) {
            if(!tables.contains(attribut.getTable())) {
                Integer neu = tiefe(tabelname_Attribute, attribut.getTable(), "");
                if (neu==tiefe){if(!highestTable.contains(attribut.getTable()))highestTable.add(attribut.getTable());}
                if(neu > tiefe){
                    highestTable = new ArrayList<>();
                    highestTable.add(attribut.getTable());
                    tiefe=neu;
                }
                tables.add(attribut.getTable());
            }
        }
        Map<List<String>, Integer> result = new HashMap<>();
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
        if(!isNF2Table(tablename))return 0;
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
        Map<List<String>, Integer> highestTable_hoehe = getHoechsteSchachtelung(tabelname_Attribute, attributes);
        Integer groessteHoehe = 0;
        for (Map.Entry<List<String>, Integer> entry : highestTable_hoehe.entrySet()) {
            highestTablename.addAll(entry.getKey());
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
                    Integer tiefe = tiefe(tabelname_Attribute, highestTablename.get(0), attribute.getTable());
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

    private String addBody(List<List<Table.Inhalt>> inhalt, List<Table.Attribute> attributes, Map<String, List<Table.Attribute>> tabelname_Attribute){
        Map<List<String>, Integer> highestTable_hoehe = getHoechsteSchachtelung(tabelname_Attribute, attributes);
        List<String> tables = new ArrayList<>();
        for (Map.Entry<List<String>, Integer> entry : highestTable_hoehe.entrySet()) {
            tables.addAll(entry.getKey());
        }
        Map<String, List<List<Table.Inhalt>>> tablename_inhalt = getTablename_Inhalt(inhalt, tabelname_Attribute);
        Html_TD html_td = new Html_TD(attributes);
        return html_td.makeHTML(tables, tablename_inhalt);
    }

    private String makeFinalHtml(List<List<Table.Inhalt>> inhalt, String head, List<Table.Attribute> attributes, Map<String, List<Table.Attribute>> tabelname_Attribute){
        return css +
                "<table border=\"1\">\n" +
                head +
                "\n" +
                addBody(inhalt, attributes, tabelname_Attribute) +
                "</table>";
    }

    private Boolean isNF2Table(String tablename){
        DbInfo dbInfo = new DbInfo();
        Map<String, String> columns = new HashMap<>();
        try {
            columns = dbInfo.getColums(false,BaseController.dbName,tablename, BaseController.user, BaseController.password);
        } catch (SQLException | IllegalAccessException e) {
            e.printStackTrace();
        }
        for (Map.Entry<String, String> entry : columns.entrySet()) {
            if(entry.getKey().equals("__" + tablename + "ID"))return true;
        }
        return false;
    }
}
