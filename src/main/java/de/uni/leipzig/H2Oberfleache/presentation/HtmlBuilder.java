package de.uni.leipzig.H2Oberfleache.presentation;

import de.uni.leipzig.H2Oberfleache.controller.BaseController;
import de.uni.leipzig.H2Oberfleache.jdbc.DbInfo;
import de.uni.leipzig.H2Oberfleache.statementRefactoring.Statement;
import de.uni.leipzig.H2Oberfleache.tables.Table;
import lombok.Getter;
import lombok.Setter;

import java.sql.SQLException;
import java.util.*;

@Getter
@Setter
public class HtmlBuilder {
    String html = "";
    Map<Integer, List<Table.Attribute>> hierarchy_attributes = new HashMap<>();
    List<String> highestTablenames = new ArrayList<>();
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
        Map<String, List<Table.Attribute>> allTabelname_Attribute = new HashMap<>(tabelname_Attribute);
        String head = addHead(table.attributes, tabelname_Attribute);
        html = makeFinalHtml(table.content, head, table.attributes, allTabelname_Attribute);
    }

    private Map<String, List<List<Table.Content>>> getTablename_Content(List<List<Table.Content>> inhalt, Map<String, List<Table.Attribute>> tabelname_Attribute){
        Map<String, List<List<Table.Content>>> tabelname_Inhalte = new HashMap<>();
        for (Map.Entry<String, List<Table.Attribute>> entry : tabelname_Attribute.entrySet()) {
            String tablename = entry.getKey();
            List<List<Table.Content>> tupelList = new ArrayList<>();
            for (List<Table.Content> list : inhalt) {
                List<Table.Content> tupel = new ArrayList<>();
                for (Table.Attribute attribute : entry.getValue()) {
                    tupel.add(list.get(attribute.getNumber()));
                }
                tupelList.add(tupel);
            }
            tabelname_Inhalte.put(tablename, tupelList);
        }
        Map<String, List<List<Table.Content>>> newtabelname_content = new HashMap<>();
        for (Map.Entry<String, List<List<Table.Content>>> table : tabelname_Inhalte.entrySet()) {
            if (!isNF2Table(table.getKey())) {
                newtabelname_content.put(table.getKey(), table.getValue());
            } else {
                List<List<Table.Content>> newContent = new ArrayList<>();
                List<String> keyList = new ArrayList<>();
                for (List<Table.Content> tupel : table.getValue()) {
                    String value = "";
                    for (Table.Content content1 : tupel) {
                        if (content1.getAttribute().getName().equals("__" + table.getKey() + "ID"))
                            value = content1.getValue();
                    }
                    if (!keyList.contains(value)) {
                        newContent.add(tupel);
                        keyList.add(value);
                    }
                }
                newtabelname_content.put(table.getKey(), newContent);
            }
        }
        return newtabelname_content;
    }

    private Map<List<String>, Integer> getHighestNesting(Map<String, List<Table.Attribute>> tabelname_Attribute, List<Table.Attribute> attribute){
        List<String> tables = new ArrayList<>();
        Integer depth = 0;
        List<String> highestTable = new ArrayList<>();
        for (Table.Attribute attribut : attribute) {
            if(!tables.contains(attribut.getTable())) {
                Integer next = depth(tabelname_Attribute, attribut.getTable(), "");
                if (next==depth){if(!highestTable.contains(attribut.getTable()))highestTable.add(attribut.getTable());}
                if(next > depth){
                    highestTable = new ArrayList<>();
                    highestTable.add(attribut.getTable());
                    depth=next;
                }
                tables.add(attribut.getTable());
            }
        }
        Map<List<String>, Integer> result = new HashMap<>();
        result.put(highestTable, depth);
        return result;
    }

    private Integer getColspan(Map<String, List<Table.Attribute>> tabelname_Attribute, String tablename){
        Integer colspan = 0;
        for (Table.Attribute attribute : tabelname_Attribute.get(tablename)) {
            if(!ids.contains(attribute.getNumber()))++colspan;
        }
        List<String> subtables = Statement.getNF2TableNamesRec(tablename);
        for (String subtable : subtables) {
            if(tabelname_Attribute.containsKey(subtable)){
                for (Table.Attribute attribute : tabelname_Attribute.get(subtable)) {
                    if(!ids.contains(attribute.getNumber()))++colspan;
                }
            }
        }
        return colspan;
    }

    private Integer depth(Map<String, List<Table.Attribute>> tabelname_Attribute, String tablename, String targetTable){
        List<String> subtables = Statement.getNF2TableNames(tablename);
        Integer highestSubtable = 0;
        boolean isNested = false;
        if(!isNF2Table(tablename))return 0;
        if(tablename.equals(targetTable))return 0;
        for (String subtable : subtables) {
            if(subtable.equals(targetTable))return 1;
            if(tabelname_Attribute.containsKey(subtable)){
                Integer next = depth(tabelname_Attribute, subtable, targetTable);
                if(next > highestSubtable) highestSubtable = next;
                isNested = true;
            }
        }
        if(isNested)highestSubtable += 1;
        return highestSubtable;
    }

    private String addHead(List<Table.Attribute> attributes, Map<String, List<Table.Attribute>> tabelname_Attribute){
        StringBuilder head = new StringBuilder("<thead>\n");
        for (Table.Attribute attribute : attributes) {
            if (attribute.getName().startsWith("__") && attribute.getName().endsWith("ID")) {
                ids.add(attribute.getNumber());
            }
        }
        for(Iterator<Map.Entry<String, List<Table.Attribute>>> it = tabelname_Attribute.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, List<Table.Attribute>> entry = it.next();
            boolean justIDs = true;
            for (Table.Attribute attribute : entry.getValue()) {
                if(!ids.contains(attribute.getNumber()))justIDs = false;
            }
            if (justIDs)it.remove();
        }
        Map<List<String>, Integer> highestTable_height = getHighestNesting(tabelname_Attribute, attributes);
        Integer highest = 0;
        for (Map.Entry<List<String>, Integer> entry : highestTable_height.entrySet()) {
            highestTablenames.addAll(entry.getKey());
            highest = entry.getValue();
        }
        int attributCounter = 0;
        Integer hierarchy = 0;
        Integer height = 0;
        List<String> includedTables = new ArrayList<>();
        while (attributCounter < attributes.size()-ids.size()) {
            List<Table.Attribute> newAttributList = new ArrayList<>();
            head.append("    <tr>\n");
            for (Table.Attribute attribute : attributes) {
                if (tabelname_Attribute.containsKey(attribute.getTable())) {
                    Integer depth = depth(tabelname_Attribute, highestTablenames.get(0), attribute.getTable());
                    if (Objects.equals(depth, height)) {
                        if (!ids.contains(attribute.getNumber())) {
                            head.append("<th rowspan=\"").append(highest - height + 1).append("\">").append(attribute.getName()).append("</th>\n");
                            attributCounter++;
                        }
                        newAttributList.add(attribute);
                    }
                    if (depth == height + 1 && !includedTables.contains(attribute.getTable())) {
                        head.append("<th colspan=\"").append(getColspan(tabelname_Attribute, attribute.getTable())).append("\">").append(getTablename(attribute.getTable())).append("</th>");
                        includedTables.add(attribute.getTable());
                    }
                }
            }
            hierarchy_attributes.put(hierarchy, newAttributList);
            head.append("    </tr>\n");
            height++;
            hierarchy++;
        }
        head.append("  </thead>\n ");
        return head.toString();
    }

    private String getTablename(String tablename){
        String[] names = tablename.split("_");
        return names[names.length-1];
    }

    private String addBody(List<List<Table.Content>> inhalt, List<Table.Attribute> attributes, Map<String, List<Table.Attribute>> tabelname_Attribute){
        Map<List<String>, Integer> highestTable = getHighestNesting(tabelname_Attribute, attributes);
        List<String> tables = new ArrayList<>();
        for (Map.Entry<List<String>, Integer> entry : highestTable.entrySet()) {
            tables.addAll(entry.getKey());
        }
        Map<String, List<List<Table.Content>>> tablename_content = getTablename_Content(inhalt, tabelname_Attribute);
        HtmlBody htmlBody = new HtmlBody(attributes);
        return htmlBody.makeHTML(tables, tablename_content);
    }

    private String makeFinalHtml(List<List<Table.Content>> inhalt, String head, List<Table.Attribute> attributes, Map<String, List<Table.Attribute>> tabelname_Attribute){
        return "<style>\n" +
                "table, td, th {border: 2px solid black;" +
                "  text-align: center;}\n" +
                "table {border-collapse: collapse;\n" +
                "  width: 70%;}\n" +
                "\n" +
                "th, td {padding: 5px;}\n" +
                "th {background-color: #f2f2f2;}\n" +
                "</style>" +
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
