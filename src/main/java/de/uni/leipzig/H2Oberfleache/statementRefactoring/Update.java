package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Update extends Update_Delete {
    String sql;

    public Update(String sql){
        this.sql = sql;
        makeMap(sql);
    }
    private Map<String, List<Map<String, String>>> table_set_value = new HashMap<>();
    public String nf2ToNf1() throws SQLException {
        sql = prepareSQL(sql);
        whichStmt = "update_stmt";
        Map<String, List<RuleContext>> map = SQL_Parser.getParsedMap(sql);
        String tablename = getTablename(map.get("qualified_table_name").get(0), false);
        List<String> subtables = getNF2TableNamesRec(tablename);
        List<String> table = new ArrayList<>();
        table.add(tablename);
        getTable_set_value(tablename, map.get("set_stmt"), subtables);
        List<String> querys = createQuerys(table, map.get("update_stmt").get(0), tablename, sql, this::makeQuerys);
        String result = "";
        for (String query : querys) {
            result += query;
        }
        return result;
    }

    private void getAllTablenames(RuleContext context, List<String> subtables, String value){
        String name = "";
        List<String> tablename = new ArrayList<>();
        String[] words = context.getText().split("\\.");
        List<String> genutzeWords = new ArrayList<>();
        Integer leangeTablename = words.length -1;
        if(words.length > 0) {
            genutzeWords.add(words[0]);
            for (int i = 0; i < leangeTablename; i++) {
                name += "_" + words[i];
                String column = "";
                Boolean punkt = false;
                for (String word : words) {
                    if(punkt)column += ".";
                    if(!genutzeWords.contains(word)){
                        if(punkt)column += ".";
                        column += word;
                        punkt = true;
                    }
                }
                genutzeWords.add(words[i]);
                Map<String, String> map = new HashMap<>();
                map.put(column ,value);
                for (String subtable : subtables) {
                    if(subtable.contains(name)){
                        tablename.add(subtable);
                        if(table_set_value.containsKey(subtable)){
                            List<Map<String, String>> list = table_set_value.get(subtable);
                            list.add(map);
                            table_set_value.put(subtable, list);
                        }else {
                            List<Map<String, String>> list = new ArrayList<>();
                            list.add(map);
                            table_set_value.put(subtable, list);
                        }
                    }
                }
            }
        }
    }


    private void getTable_set_value(String mainTablename, List<RuleContext> set_stmts, List<String> subtables){
        for (RuleContext set_stmt : set_stmts) {
            RuleContext set = (RuleContext) set_stmt.getChild(0);
            String tablename = mainTablename;
            String columnname = set.getText();
            RuleContext ctx = null;
            ParseTree element = set_stmt.getChild(2);
            if (element instanceof RuleContext) {
                ctx = (RuleContext) element;
            }
            String value = cutFromSQL(ctx, sql);
            if(SQLiteParser.ruleNames[set.getRuleIndex()].equals("nf2_point_Notation")){
                getAllTablenames(set, subtables, value);
            }
            Map<String, String> set_value = new HashMap<>();
            set_value.put(columnname, value);
            if(table_set_value.containsKey(tablename)){
                List<Map<String, String>> list = table_set_value.get(tablename);
                list.add(set_value);
                table_set_value.put(tablename, list);
            }else {
                List<Map<String, String>> list = new ArrayList<>();
                list.add(set_value);
                table_set_value.put(tablename, list);
            }
        }
    }

    //Todo: richtiges Updatestatement und weiterzu verarebeitendes
    public List<String> makeQuerys(List<String> values, List<String> tablenames, String id) throws SQLException {
        String where = "WHERE " + id + " IN( ";
        Boolean komma = false;
        for (String value : values) {
            if(komma)where += ", ";
            komma = true;
            where += value;
        }
        where += ")";
        List<String> querys = new ArrayList<>();
        for (String tablename : tablenames) {
            if(table_set_value.containsKey(tablename)) {
                String newQuery = "UPDATE " + tablename + " SET " + gernerateQuery(true, tablename);
                String set = gernerateQuery(false, tablename);
                newQuery += " " + where + "; ";
                List<String> subtables = getNF2TableNames(tablename);
                if (!subtables.isEmpty()) querys.addAll(newQuerys(newQuery, tablename, subtables, this::makeQuerys));
                else if (!set.equals("")) {
                    String update = "UPDATE " + tablename + " SET " + set + " " + where + "; ";
                    querys.add(update);
                }
            }
        }
        return querys;
    }

    private String gernerateQuery(Boolean allTables, String tablename){
        String update = "";
        Boolean komma = false;
        for (Map<String, String> table : table_set_value.get(tablename)) {
            for (Map.Entry<String, String> entry : table.entrySet()) {
                if(allTables) {
                    if(komma)update += ", ";
                    komma = true;
                    update += entry.getKey() + " = " + entry.getValue();
                }else if(!entry.getKey().contains("\\.")){
                    if(komma)update += ", ";
                    komma = true;
                    update += entry.getKey() + " = " + entry.getValue();
                }
            }
        }
        return update;
    }
}
