package de.uni.leipzig.H2Oberfleache.presentation;

import de.uni.leipzig.H2Oberfleache.controller.BaseController;
import de.uni.leipzig.H2Oberfleache.jdbc.DbInfo;
import de.uni.leipzig.H2Oberfleache.statementRefactoring.Statement;
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
    UserDetails userDetails;

    public HtmlBuilder(Table table, UserDetails userDetails) {
        this.userDetails = userDetails;
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

    private Map<String, List<List<Table.Content>>> getTablename_Content(List<List<Table.Content>> inhalt, Map<String, List<Table.Attribute>> tabelname_Attribute, List<String> mainTables){
        Map<String, List<List<Table.Content>>> tabelname_Content = new HashMap<>();
        for (Map.Entry<String, List<Table.Attribute>> entry : tabelname_Attribute.entrySet()) {
            String tabelname = entry.getKey();
            List<List<Table.Content>> tupleList = new ArrayList<>();
            for (List<Table.Content> list : inhalt) {
                List<Table.Content> tuple = new ArrayList<>();
                for (Table.Attribute attribute : entry.getValue()) {
                    tuple.add(list.get(attribute.getNumber()));
                }
                tupleList.add(tuple);
            }
            tabelname_Content.put(tabelname, tupleList);
        }
        Map<String, List<List<Table.Content>>> newtabelname_content = new HashMap<>();
        for (Map.Entry<String, List<List<Table.Content>>> table : tabelname_Content.entrySet()) {
            if (!isNF2Table(table.getKey(), mainTables) || !hasNF2Schluessel(tabelname_Attribute.get(table.getKey()), table.getKey(), mainTables)) {
                newtabelname_content.put(table.getKey(), table.getValue());
            } else {
                List<List<Table.Content>> newContent = new ArrayList<>();
                List<List<String>> keyList = new ArrayList<>();
                for (List<Table.Content> tuple : table.getValue()) {
                    List<String> values = new ArrayList<>();
                    for (Table.Content content1 : tuple) {
                        if(table.getKey().equals("main")){
                            for (String mainTable : mainTables) {
                                if (content1.getAttribute().getName().equals("__" + mainTable + "ID"))
                                    values.add(content1.getValue());
                            }
                        }else {
                            if (content1.getAttribute().getName().equals("__" + table.getKey() + "ID"))
                                values.add(content1.getValue());
                            if (content1.getAttribute().getName().equals("__" + Statement.getObertabelle(table.getKey(), userDetails) + "ID"))
                                values.add(content1.getValue());
                        }
                    }
                    if (!keyList.contains(values)) {
                        newContent.add(tuple);
                        keyList.add(values);
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
                if (next.equals(depth)){if(!highestTable.contains(attribut.getTable()))highestTable.add(attribut.getTable());}
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
        List<String> subtables = Statement.getNF2TableNamesRec(tablename, userDetails);
        if(userDetails.ober_untertabelle.containsKey(tablename))subtables.add(userDetails.ober_untertabelle.get(tablename));
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
        List<String> subtables = Statement.getNF2TableNames(tablename, userDetails);
        String subbtable = userDetails.ober_untertabelle.getOrDefault(tablename, "");
        if(!subbtable.equals(""))subtables.add(subbtable);
        Integer highestSubtable = 0;
        boolean isNested = false;
        if(!isNF2Table(tablename, new ArrayList<>()))return 0;
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
        Map<List<String>, Integer> highestTable_height = getHighestNesting(tabelname_Attribute, attributes);
        Integer highest = 0;
        for (Map.Entry<List<String>, Integer> entry : highestTable_height.entrySet()) {
            highestTablenames.addAll(entry.getKey());
            highest = entry.getValue();
        }
        Map<String, List<Table.Attribute>> oldtabelname_Attribute = new HashMap<>(tabelname_Attribute);
        for(Iterator<Map.Entry<String, List<Table.Attribute>>> it = tabelname_Attribute.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, List<Table.Attribute>> entry = it.next();
            boolean justIDs = true;
            for (Table.Attribute attribute : entry.getValue()) {
                if(!ids.contains(attribute.getNumber()))justIDs = false;
            }
            if (justIDs)it.remove();
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
                    Integer depth = 100;
                    for (String highestTablename : highestTablenames) {
                        Integer depth1 = depth(oldtabelname_Attribute, highestTablename, attribute.getTable());
                        if(depth1 < depth)depth = depth1;
                    }
                    if (!ids.contains(attribute.getNumber())) {
                        if (Objects.equals(depth, height)) {
                            head.append("<th rowspan=\"").append(highest - height + 1).append("\">").append(attribute.getName()).append("</th>\n");
                            attributCounter++;
                            newAttributList.add(attribute);
                        }
                        if (depth == height + 1 && !includedTables.contains(attribute.getTable())) {
                            head.append("<th colspan=\"").append(getColspan(tabelname_Attribute, attribute.getTable())).append("\">").append(getTablename(attribute.getTable())).append("</th>");
                            includedTables.add(attribute.getTable());
                        }
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
        List<Table.Attribute> mainAttributes = new ArrayList<>();
        for (Map.Entry<List<String>, Integer> entry : highestTable.entrySet()) {
            tables.addAll(entry.getKey());
            for (String mainTable : entry.getKey()) {
                mainAttributes.addAll(tabelname_Attribute.get(mainTable));
                tabelname_Attribute.remove(mainTable);
            }
            tabelname_Attribute.put("main", mainAttributes);
        }
        Map<String, List<List<Table.Content>>> tablename_content = getTablename_Content(inhalt, tabelname_Attribute, tables);
        HtmlBody htmlBody = new HtmlBody(attributes, tabelname_Attribute, userDetails);
        return htmlBody.makeHTML(tables, tablename_content, attributes);
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

    private Boolean isNF2Table(String tablename, List<String> maintabs){
        if(tablename.equals("main")){
            for (String maintab : maintabs) {
                if(isNF2Table(maintab, new ArrayList<>())) return true;
            }
        }
        List<String> columns = new ArrayList<>();
        try {
            columns = DbInfo.getColumnList(tablename, userDetails);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return columns.contains("__" + tablename + "ID");
    }

    private Boolean hasNF2Schluessel(List<Table.Attribute> attributes, String tablename, List<String> mainTabs){
        if(tablename.equals("main")){
            for (String mainTab : mainTabs) {
                if(hasNF2Schluessel(attributes, mainTab, new ArrayList<>())) return true;
            }
        }
        String schluessel = "__" + tablename + "ID";
        boolean hasSchluessel = false;
        for (Table.Attribute attribute : attributes) {
            if(attribute.getName().equals(schluessel))hasSchluessel = true;
        }
        return hasSchluessel;
    }
}
