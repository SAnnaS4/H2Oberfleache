package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteParser;
import org.antlr.v4.runtime.RuleContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Insert extends Statement {
    //Todo: baue eingabe ohne name(...)values(...)
    private static Map<String, List<Map<String, String>>> table_key_value = new HashMap<>();

    public static String nf2ToNf1(String sql){
        sql = prepareSQL(sql);
        String result = sql;
        Map<String, List<RuleContext>> map = SQL_Parser.getParsedMap(sql);
        String tablename = map.get("table_name").get(0).getText();
        List<String> subtables = getNF2TableNames(tablename);
        List<String> queries = new ArrayList<>();
        if (!subtables.isEmpty()) {
            result = "";
            List<RuleContext> children = SQL_Parser.getChildList(map.get("insert_stmt").get(0));
            if (map.containsKey("column_name") || map.containsKey("nf2_point_Noation"))
                    queries = generateQuerys(children, map, tablename);
            } else {
                //queries = getQuerysWhitoutColumns(tablename, map.get("expr"), tableName_NextID);
            }
        for (String query : queries) {
            result += query;
        }
        return result;
    }

    private static List<String> generateQuerys(List<RuleContext> children, Map<String, List<RuleContext>> map, String tablename) {
        List<String> allSubtables = new ArrayList<>();
        allSubtables = getAllSubtables(tablename, allSubtables);
        Map<String, String> name_table = findWrightTablename(map, allSubtables);
        table_key_value = getKey_Value_forTabels(children, name_table);
        List<Map<String, String>> key_value = table_key_value.get("main");
        List<String> queries = createQuerys(tablename, key_value);
        return queries;
    }

    private static List<String> getAllSubtables(String tablename, List<String> subtables){
        List<String> tableSubtables = getNF2TableNames(tablename);
        for (String subtable : tableSubtables) {
            subtables.addAll(getAllSubtables(subtable, subtables));
            subtables.add(subtable);
        }
        return subtables;
    }

    private static List<String> createQuerys(String tablename, List<Map<String, String>> key_value){
        List<String> querys = new ArrayList<>();
        List<String> subtables = getNF2TableNames(tablename);
        if(!subtables.isEmpty()){
            Integer nextTableID = getNextSubID(tablename);
            String IDName = "__" + tablename + "ID";
            Map<String, String> newMap = new HashMap<>();
            newMap.put(IDName, nextTableID.toString());
            for (String subtable : subtables) {
                List<Map<String, String>> sub_key_value = new ArrayList<>();
                if(table_key_value.containsKey(subtable)) sub_key_value = (table_key_value.get(subtable));
                sub_key_value.add(newMap);
                querys.addAll(createQuerys(subtable, sub_key_value));
            }
            key_value.add(newMap);
        }
        String query = "INSERT INTO " + tablename + "(";
        String values = " VALUES (";
        int i = 0;
        for (Map<String, String> stringStringMap : key_value) {
            for (Map.Entry<String, String> kv : stringStringMap.entrySet()) {
                if (i != 0) {
                    query += ",";
                    values += ",";
                }
                i++;
                query += kv.getKey();
                values += kv.getValue();
            }
        }
        query = query + " )" + values + " );";
        querys.add(query);
        return querys;
    }


    //Todo: für rekusive
    private static Map<String, List<Map<String, String>>> getKey_Value_forTabels(List<RuleContext> children, Map<String, String> name_table){
        Map<String, List<Map<String, String>>> table_key_vale = new HashMap<>();
        int stelle = 0;
        for (RuleContext child : children) {
            String tableName = "main";
            int i = 0;
            String ruleName = SQLiteParser.ruleNames[child.getRuleIndex()];
            if (ruleName.equals("column_name") || ruleName.equals("nf2_point_Noation")) {
                Map<String, String> map = new HashMap<>();
                if(ruleName.equals("nf2_point_Noation")){
                    tableName = name_table.get(getPointNotationPartAt(child, false));
                }
                for (RuleContext child1 : children) {
                    String ruleName1 = SQLiteParser.ruleNames[child1.getRuleIndex()];
                    if (ruleName1.equals("expr") && stelle==i){
                        map.put(getPointNotationPartAt(child, true), child1.getText());
                        if(table_key_vale.containsKey(tableName)){
                            List<Map<String, String>> liste = table_key_vale.get(tableName);
                            liste.add(map);
                            table_key_vale.put(tableName, liste);
                        }else {
                            List<Map<String, String>> liste = new ArrayList<>();
                            liste.add(map);
                            table_key_vale.put(tableName, liste);
                        }

                        i++;
                    }else if(ruleName1.equals("expr")){
                        i++;
                    }
                }
                stelle++;
            }
        }
        return table_key_vale;
    }

    private static String getPointNotationPartAt(RuleContext pointNotation, Boolean column){
        String[] tabellen = pointNotation.getText().split("\\.");
        String tableNotation = tabellen[tabellen.length-1];
        boolean ersteZeile = true;
        if(!column) {
            tableNotation = "";
            for (int i = 0; i < tabellen.length - 1; i++) {
                if (!ersteZeile) tableNotation += ".";
                ersteZeile = false;
                tableNotation += tabellen[i];
            }
        }
        return tableNotation;
    }

    private static Map<String, String> findWrightTablename(Map<String, List<RuleContext>> map, List<String> subtables){
        Map<String, String> name_table = new HashMap<>();
        for (RuleContext nameInQuery : map.get("name_of_subtable")) {
            String name = "";
            String[] words = nameInQuery.getText().split("\\.");
            if(words.length > 0) {
                for (int i = 0; i < words.length; i++) {
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
}
