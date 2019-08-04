package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteParser;
import org.antlr.v4.runtime.RuleContext;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Insert extends Statement {
    //Todo: baue eingabe ohne name(...)values(...)
    public static String nf2ToNf1(String sql) throws SQLException {
        sql = prepareSQL(sql);
        String result = sql;
        Map<String, List<RuleContext>> map = SQL_Parser.getParsedMap(sql);
        String tablename = map.get("table_name").get(0).getText();
        List<String> subtables = getNF2TableNames(tablename);
        List<String> queries = new ArrayList<>();
        if (!subtables.isEmpty()) {
            result = "";
            List<RuleContext> children = SQL_Parser.getChildList(map.get("insert_stmt").get(0));
            Map<String, Integer> tableName_NextID = getNextSubIDs(subtables);
            if (map.containsKey("column_name") || map.containsKey("nf2_point_Noation")) {
                Map<String, String> name_table = findWrightTablename(map, subtables);
                Map<RuleContext, RuleContext> keyValue = getKeyValue(children);
                for (Map.Entry<RuleContext, RuleContext> entry : keyValue.entrySet()) {
                    System.out.println(entry.getKey().getText() + ": " + entry.getValue().getText());
                }
                    queries = createQuerys(tablename, keyValue, tableName_NextID, name_table, map);
            } else {
                //queries = getQuerysWhitoutColumns(tablename, map.get("expr"), tableName_NextID);
            }
        }
        for (String query : queries) {
            result += query;
        }
        return result;
    }

    private static List<String> createQuerys(String tablename, Map<RuleContext, RuleContext> keyValue,
                                             Map<String, Integer> tableName_NextID, Map<String, String> name_table,
                                             Map<String, List<RuleContext>> map) {
        List<String> querys = new ArrayList<>();
        querys.add(getQuery(tablename, keyValue, tableName_NextID, name_table, true));
        querys.addAll(createSubQuerys(keyValue, tableName_NextID, name_table, map));
        return querys;
    }

    private static List<String> createSubQuerys(Map<RuleContext, RuleContext> keyValue, Map<String,
            Integer> tableName_NextID, Map<String, String> name_table, Map<String, List<RuleContext>> map) {
        List<String> querys = new ArrayList<>();
        Map<String, Map<RuleContext, RuleContext>> tableName_Query = new HashMap<>();
        for (Map.Entry<RuleContext, RuleContext> entry : keyValue.entrySet()) {
            String tablename = name_table.get(entry.getKey().getText().split("\\.")[0]);
            String s2 = (entry.getKey().getText());
            List<RuleContext> columns = map.get("subtable_column_name");
            for (RuleContext column : columns) {
                String s1 = column.getParent().getText();
                if(s1.equals(s2)){
                    Map<RuleContext, RuleContext> ruleC = new HashMap<>();
                    ruleC.put(column, entry.getValue());
                    if(!tableName_Query.containsKey(tablename)){
                        tableName_Query.put(tablename, ruleC);
                    }else tableName_Query.get(tablename).put(column, entry.getValue());

                }
            }
        }
        for (Map.Entry<String, Map<RuleContext, RuleContext>> entry : tableName_Query.entrySet()) {
            querys.add(getQuery(entry.getKey(), entry.getValue(), tableName_NextID, name_table, false));
        }
        return querys;
    }

    //Funktioniert kein stück
    private static String getQuery(String tablename, Map<RuleContext, RuleContext> keyValue,
                                          Map<String,Integer> tableName_NextID, Map<String, String> name_table, Boolean firstround){
        String query = "INSERT INTO " + tablename + "(";
        String values = "VALUES (";
        Map<RuleContext, RuleContext> removable = new HashMap<>();
        int i = 0;
        for (Map.Entry<RuleContext, RuleContext> entry : keyValue.entrySet()) {
            if (SQLiteParser.ruleNames[entry.getKey().getRuleIndex()].equals("column_name")
            || SQLiteParser.ruleNames[entry.getKey().getRuleIndex()].equals("subtable_column_name")) {
                if (i != 0) {
                    query += ",";
                    values += ",";
                }
                i++;
                removable.put(entry.getKey(), entry.getValue());
                query += entry.getKey().getText();
                values += entry.getValue().getText();
            }
        }
        if(firstround) {
            for (Map.Entry<RuleContext, RuleContext> entry : removable.entrySet()) {
                keyValue.remove(entry.getKey(), entry.getValue());
            }
        }
        List<String> idList = idErstellen(tablename, name_table);
        if(!idList.isEmpty()){
            for (String id : idList) {
                String[] ids = id.split(".");
                if (i != 0) {
                    query += ",";
                    values += ",";
                }
                i++;
                if(ids.length > 1){
                query += "," + ids[ids.length-1] + "ID";
                }else query += id + "ID";
                values += tableName_NextID.get(name_table.get(id));
            }
        }
        if(tableName_NextID.containsKey(tablename)){
            if (i != 0) {
                query += ",";
                values += ",";
            }
            i++;
            query += tablename + "ID";
            values += tableName_NextID.get(tablename);
        }
        query += ")" + values + ");";
        return query;
    }

    //Todo: value
    private static List<String> idErstellen(String tablename, Map<String, String> name_table){
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, String> entry : name_table.entrySet()) {
            if(entry.getValue().contains("__" + tablename + "_") && !entry.getValue().equals("__" + tablename + "_")){
                list.add(entry.getKey());
            }
        }
        return list;
    }

    private static Map<String, String> findWrightTablename(Map<String, List<RuleContext>> map, List<String> subtables){
        Map<String, String> name_table = new HashMap<>();
        for (RuleContext nameInQuery : map.get("name_of_subtable")) {
            String name = "";
            String[] words = nameInQuery.getText().split(".");
            if(words.length < 0) {
                for (int i = 0; i < words.length - 1; i++) {
                    name += "_" + words[i];
                }
            }else name += "_" + nameInQuery.getText();
            for (String subtable : subtables) {
                if(subtable.contains(name)){
                    name_table.put(nameInQuery.getText(), subtable);

                }
            }
        }
        return name_table;
    }
    public static List<String> getQuerysWhitoutColumns(String tablename, List<RuleContext> werte, Map<String, Integer> nextID){
        List<String> queries = new ArrayList<>();
        try {
            Map<String, List<String>> tableN_Values = getColumnsPlaces(tablename, werte, nextID);
            for (Map.Entry<String, List<String>> table : tableN_Values.entrySet()) {
                String query = "INSERT INTO " + table.getKey() + " VALUES(";
                int i = 0;
                for (String value : table.getValue()) {
                    if(i!=0)query += ",";
                    i++;
                    query += value;
                }
                queries.add(query + ");");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return queries;
    }

    public static Map<RuleContext, RuleContext> getKeyValue(List<RuleContext> children){
        Map<RuleContext, RuleContext> map = new HashMap<>();
        int stelle = 0;
        for (RuleContext child : children) {
            int i = 0;
            String ruleName = SQLiteParser.ruleNames[child.getRuleIndex()];
            if (ruleName.equals("column_name") || ruleName.equals("nf2_point_Noation")) {
                for (RuleContext child1 : children) {
                    String ruleName1 = SQLiteParser.ruleNames[child1.getRuleIndex()];
                    if (ruleName1.equals("expr") && stelle==i){
                        map.put(child, child1);
                        i++;
                    }else if(ruleName1.equals("expr")){
                        i++;
                    }
                }
                stelle++;
            }
        }
        return map;
    }
}
