/*
package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import org.antlr.v4.runtime.RuleContext;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Select1 extends Statement{
    public static String nf2ToNf1(String sql) throws SQLException {
        sql = prepareSQL(sql);
        Map<String, List<RuleContext>> map = SQL_Parser.getParsedMap(sql);
        List<RuleContext> tablenames = map.get("table_name");
        String result = sql;
        List<String> subtables = new ArrayList<>();
        for (RuleContext tablename : tablenames) {
            subtables.addAll(getNF2TableNames(tablename.getText()));
        }
        if (!subtables.isEmpty()) {
            result = insertSelectQuerys(subtables, sql, map);
        }
        return result;
    }

    private static String createNewSelect(String subtablename){
        return "(SELECT * FROM " + subtablename + " )";
    }

    private static String createNewSelect(String tablealias, String subtablename, String subtabid){
            return "(SELECT s.* FROM " + subtablename + " s WHERE s." + subtablename + "ID = " + tablealias + "." + subtabid + " )";
    }

    private static String insertSelectQuerys(List<String> subtables, String query, Map<String, List<RuleContext>> map){
        Map<String, String> column_newselect = getNewSelectStatsFrom(subtables, map);
        Map<String, String> column_newselectSelect = getNewSelectStatsSelect(subtables, map);
        for (Map.Entry<String, String> entry : column_newselectSelect.entrySet()) {
            String[] selects = query.split("SELECT");
            for(int i = 0; i<selects.length; i++){
                if(selects[i].contains(entry.getKey())) {
                    String[] teile = selects[i].split("FROM");
                    selects[i] = teile[0] + " FROM " + entry.getName();
                    for (int j = 1; j < teile.length; j++) selects[i] += teile[j];
                }
            }
            query = "";
            for(int i = 0; i<selects.length; i++){
                if(selects[i].length() > 1)query += "SELECT" + selects[i];
            }
        }
        for (Map.Entry<String, String> entry : column_newselect.entrySet()) {
            if(query.contains(entry.getKey())) {
                query = query.replace(entry.getKey(), entry.getName());
            }
        }
        return query;
    }

    private static Map<String, String> getNewSelectStatsFrom(List<String> subtables, Map<String, List<RuleContext>> map){
        Map<String, String> column_newselect = new HashMap<>();
        List<RuleContext> list = new ArrayList<>();
        if(map.containsKey("table_or_subquery")) list = map.get("table_or_subquery");
        for (RuleContext context : list) {
            Map<String, List<RuleContext>> childs = SQL_Parser.getCildren(context);
            String subtable = "";
            String column = "";
            String table_name = childs.get("table_name").get(0).getText();
            if(childs.containsKey("column_name")){
                for (RuleContext column_name : map.get("column_name")) {
                    if(!isSubtable(column_name.getText(), subtables).isEmpty()){
                        subtable = isSubtable(column_name.getText(), subtables);
                        column = column_name.getText();
                        String newSelect = createNewSelect(subtable);
                        if(map.containsKey("table_alias")) {
                            if (isAlias(map.get("table_alias"), table_name)) {
                                newSelect = createNewSelect(table_name, subtable, column_name.getText() + "ID");
                            }
                        }
                        column_newselect.put(table_name + "." + column, newSelect);
                        break;
                    }
                }
            }
        }
        return column_newselect;
    }

    private static Boolean isAlias(List<RuleContext> alias, String name){
        for (RuleContext context : alias) {
            if(context.getText().equals(name)) return true;
        }
    return false;
    }

    private static Map<String, String> getNewSelectStatsSelect (List<String> subtables, Map<String, List<RuleContext>> map) {
        List<RuleContext> list = new ArrayList<>();
        Map<String, String> result = new HashMap<>();
        if (map.containsKey("result_column")) list = map.get("result_column");
        for (RuleContext context : list) {
            Map<String, List<RuleContext>> childs = SQL_Parser.getCildren(context);
            List<RuleContext> subtable_names = new ArrayList<>();
            String table_name = "";
            if (childs.containsKey("table_name")) subtable_names = childs.get("table_name");
            if (childs.containsKey("column_name")) {
                table_name = subtable_names.get(subtable_names.size()-1).toString();
                subtable_names.addAll(childs.get("column_name"));
            }
            for (RuleContext name : subtable_names) {
                if(!isSubtable(name.getText(), subtables).isEmpty()){
                    String subtable_name = isSubtable(name.getText(), subtables);
                    String query = createNewSelect(subtable_name);
                    if(map.containsKey("table_alias")) {
                        if (isAlias(map.get("table_alias"), table_name)) {
                            query = createNewSelect(table_name, subtable_name, name.getText() + "ID");
                        }
                    }
                    result.put(context.getText(),query + " as " + name.getText() + " , ");
                }
            }
        }
        return result;
    }

    public static String isSubtable(String columnname, List<String> subtables){
        for (String s : subtables) {
            if(s.contains("_" + columnname)) return s;
        }
        return "";
    }
}
*/
