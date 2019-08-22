package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.sql.SQLException;
import java.util.*;


public class Update extends Update_Delete {
    String sql;
    static String hauptSQL;
    private Map<String, List<Map<String, RuleContext>>> table_set_value = new HashMap<>();
    private Map<String, RuleContext> table_tableInsert = new HashMap<>();

    public Update(String sql){
        this.sql = sql;
        makeMap(sql);
    }
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
        System.out.println(result);
        return result;
    }

    private void getAllTablenames(RuleContext set, List<String> subtables, RuleContext value){
        String name = "";
        String[] words = set.getText().split("\\.");
        List<String> genutzeWords = new ArrayList<>();
        Integer leangeTablename = words.length;
        if(words.length > 0) {
            genutzeWords.add(words[0]);
            for (int i = 0; i < leangeTablename; i++) {
                if(words[i].contains("(")){
                    name += "_" + words[i].split("\\(")[0];
                 }else name += "_" + words[i];
                String column = "";
                Boolean punkt = false;
                for (String word : words) {
                    if(punkt)column += ".";
                    if(!genutzeWords.contains(word) || word.contains("(")){
                        if(punkt)column += ".";
                        column += word;
                        punkt = true;
                    }
                }
                genutzeWords.add(words[i]);
                Map<String, RuleContext> map = new HashMap<>();
                map.put(column ,value);
                for (String subtable : subtables) {
                    if(subtable.contains(name)){
                        if(table_set_value.containsKey(subtable)){
                            List<Map<String, RuleContext>> list = table_set_value.get(subtable);
                            list.add(map);
                            table_set_value.put(subtable, list);
                        }else {
                            List<Map<String, RuleContext>> list = new ArrayList<>();
                            list.add(map);
                            table_set_value.put(subtable, list);
                        }
                        if(!column.contains("\\.") && !SQLiteParser.ruleNames[value.getRuleIndex()].equals("expr")){
                            table_tableInsert.put(subtable, getTableInsert(set));
                        }
                    }
                }
            }
        }
    }

    private RuleContext getTableInsert(RuleContext set){
        return SQL_Parser.getChildMap(set).get("table_insert").get(0);
    }


    private void getTable_set_value(String mainTablename, List<RuleContext> set_stmts, List<String> subtables){
        for (RuleContext set_stmt : set_stmts) {
            RuleContext set = (RuleContext) set_stmt.getChild(0);
            String tablename = mainTablename;
            RuleContext ctx = null;
            ParseTree element = set_stmt.getChild(set_stmt.getChildCount()-1);
            if (element instanceof RuleContext) {
                ctx = (RuleContext) element;
            }
            if (set.getText().contains("\\.") || set.getText().contains("(")) {
                getAllTablenames(set, subtables, ctx);
            }
            Map<String, RuleContext> set_value = new HashMap<>();
            set_value.put(set.getText(), ctx);
            if (table_set_value.containsKey(tablename)) {
                List<Map<String, RuleContext>> list = table_set_value.get(tablename);
                list.add(set_value);
                table_set_value.put(tablename, list);
            } else {
                List<Map<String, RuleContext>> list = new ArrayList<>();
                list.add(set_value);
                table_set_value.put(tablename, list);
            }
        }
    }

    public List<String> makeQuerys(String where, String tablename) throws SQLException {
        List<String> querys = new ArrayList<>();
            if(table_set_value.containsKey(tablename)) {
                String newQuery = "UPDATE " + tablename + " SET " + gernerateQuery(true, tablename, where).get(0);
                List<String> set = gernerateQuery(false, tablename, where);
                newQuery += " " + where + "; ";
                List<String> subtables = getNF2TableNames(tablename);
                if (!subtables.isEmpty()) querys.addAll(newQuerys(newQuery, tablename, subtables, this::makeQuerys));
                if (!set.get(0).equals("")) {
                    if (set.size() == 1) {
                        String update = "UPDATE " + tablename + " SET " + set.get(0) + " " + where + "; ";
                        querys.add(update);
                    } else querys.addAll(set);
                }
            }
        return querys;
    }

    private List<String> gernerateQuery(Boolean allTables, String tablename, String where) throws SQLException {
        List<String> queries = new ArrayList<>();
        String update = "";
        Boolean komma = false;
        String remove = "";
        for (Map<String, RuleContext> table : table_set_value.get(tablename)) {
            for (Map.Entry<String, RuleContext> entry : table.entrySet()) {
                if(allTables) {
                    if(komma)update += ", ";
                    komma = true;
                    update += entry.getKey() + " = " + cutFromSQL(entry.getValue(),hauptSQL);
                }else if(!entry.getKey().contains("\\.")){
                    if(SQLiteParser.ruleNames[entry.getValue().getRuleIndex()].equals("expr")) {
                        if (komma) update += ", ";
                        komma = true;
                        update += entry.getKey() + " = " + cutFromSQL(entry.getValue(), hauptSQL);
                    }else {
                        String subtablename = "__" + tablename + "_" + entry.getKey().split("\\(")[0];
                        queries.addAll(getNewInsert(tablename, subtablename, entry.getValue(), where));
                        remove = subtablename;
                    }
                }
            }
            if(queries.size() == 0)queries.add(update);
        }
        if(!remove.equals(""))table_set_value.remove(remove);
        return queries;
    }

    private List<String> getNewInsert(String oberTabName, String tablename, RuleContext value, String where) throws SQLException {
        RuleContext set = table_tableInsert.get(tablename);
        //List<RuleContext> valueList = new ArrayList<>(SQL_Parser.getChildMap(value).get("value_insert"));
        List<String> inserts = new ArrayList<>();
        String[] names = tablename.split("_");
        String pointTable = "";
        boolean point = false;
        for (String name : names) {
            if(!name.equals("")){
                if (point)pointTable += ".";
                point = true;
                pointTable += name;
            }
        }
        String delete_stmt = "DELETE FROM " + pointTable + " " + where + "; ";
        Delete delete = new Delete(delete_stmt);
        delete_stmt = delete.nf2ToNf1();
        inserts.add(delete_stmt);
        List<String> otIds = tablename_ID.get(oberTabName);
        List<String> Id = tablename_ID.get(tablename);
        Insert insert1 = new Insert();
        Map<String, List<RuleContext>> childMap = SQL_Parser.getChildMap(value);
        List<RuleContext> valueList = new ArrayList<>();
        RuleContext valueInsert = childMap.get("value_insert").get(0);
        if(SQLiteParser.ruleNames[value.getRuleIndex()].equals("set_expr")){
            valueList = insert1.getRows(valueInsert);
        }else {
            valueList.add(valueInsert);
        }
        for (String otId : otIds) {
            inserts.addAll(insert1.createQuerys(oberTabName, otId, set, valueList, this::getNextID));
        }
        return inserts;
    }

    private Map<String, Integer> table_IdPosition = new HashMap<>();
    private Map<String, Integer> tablename_nextID = new HashMap<>();

    private String getNextID(String tablename){
        String id;
        List<String> ids = tablename_ID.get(tablename);
        Integer position = 0;
        position = table_IdPosition.getOrDefault(tablename, 0);
        if(ids.size() > position) {
            id = ids.get(position);
            table_IdPosition.put(tablename, position + 1);
        }else {
            Integer intID;
            if(tablename_nextID.containsKey(tablename)){
                intID = tablename_nextID.get(tablename) + 1;
            }else intID = getNextSubID(tablename);
            tablename_nextID.put(tablename, intID);
            id = intID.toString();
        }
        return id;
    }
}
