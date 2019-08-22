package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteLexer;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Insert extends Statement {
    Map<String, Integer> tablename_nextID = new HashMap<>();

    public String nf2ToNf1(String sql){
        sql = prepareSQL(sql);
        String result = sql;
        SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(sql));
        SQLiteParser parser = new SQLiteParser(new CommonTokenStream(lexer));
        RuleContext context = parser.insert_stmt();
        Map<String, List<RuleContext>> childMap = SQL_Parser.getChildMap(context);
        if(childMap.containsKey("table_insert")){
            result = "";
            RuleContext tableInsert = childMap.get("table_insert").get(0);
            List<RuleContext> valueList = childMap.get("value_insert");
            List<String> queries = createQuerys("", "0" , tableInsert, valueList, this::getNextID);
            for (String query : queries) {
                result += query;
            }
        }
        return result;
    }

    public List<String> createQuerys(String obertab, String nextOTID, RuleContext tableInsert, List<RuleContext> valueList, Getter getter){
        Map<String, List<RuleContext>> tableInsertchilds = SQL_Parser.getChildMap(tableInsert);
        String tablename = tableInsertchilds.get("table_name").get(0).getText();
        List<String> querys = new ArrayList<>();
        List<String> table = new ArrayList<>();
        List<List<String>> tupelList = new ArrayList<>();
        if(obertab != ""){
            tablename = "__" + obertab + "_" + tablename;
        }
        boolean tableIsSetted = false;
        String ID;
        String IDName = "__" + tablename + "ID";
        for (RuleContext value : valueList) {
            ID = getter.getNextID(tablename);

            Map<RuleContext, RuleContext> element_value = new HashMap<>();
            List<String> values = new ArrayList<>();
            if(SQLiteParser.ruleNames[value.getRuleIndex()].equals("expr")){
                List<RuleContext> tableChild = SQL_Parser.getChildList(tableInsert);
                element_value.put(tableChild.get(1), value);
            }else {
                List<RuleContext> valueChild = SQL_Parser.getChildList(value);
                List<RuleContext> tableChild = SQL_Parser.getChildList(tableInsert);
                for (int i = 0; i < valueChild.size(); i++) {
                    element_value.put(SQL_Parser.parseTreeToRuleContext(tableChild.get(i + 1)),
                            SQL_Parser.parseTreeToRuleContext(valueChild.get(i)));
                }
            }
            for (Map.Entry<RuleContext, RuleContext> entry : element_value.entrySet()) {
                if(SQLiteParser.ruleNames[entry.getValue().getRuleIndex()].equals("expr")){
                    if(!tableIsSetted) table.add(entry.getKey().getText());
                    values.add(entry.getValue().getText());
                }else {
                    Map<String, List<RuleContext>> childMap = SQL_Parser.getChildMap(entry.getValue());
                    List<RuleContext> row = new ArrayList<>();
                    RuleContext valueInsert = childMap.get("value_insert").get(0);
                    if(SQLiteParser.ruleNames[entry.getValue().getRuleIndex()].equals("set_expr")){
                        row = getRows(valueInsert);
                    }else {
                        row.add(valueInsert);
                    }
                    querys.addAll(createQuerys(tablename, ID, entry.getKey(), row, getter));
                }
            }
            values.add(ID);
            if(obertab != "")values.add(nextOTID);
            tupelList.add(values);
            tableIsSetted = true;
        }
        table.add(IDName);
        if(obertab != "")table.add("__" + obertab + "ID");
        querys.addAll(makeInsertQuery(tablename, table, tupelList));
        return querys;
    }

    public List<RuleContext> getRows(RuleContext value_insert){
        List<RuleContext> rows = new ArrayList<>();
        List<RuleContext> childs = SQL_Parser.getChildList(value_insert);
        if(SQLiteParser.ruleNames[childs.get(0).getRuleIndex()].equals("row_expr")) {
            for (RuleContext child : childs) {
                rows.addAll(SQL_Parser.getChildList(child));
            }
        }else rows = childs;
        return rows;
    }

    private List<String> makeInsertQuery(String tablename, List<String> table, List<List<String>> tupel){
        List<String> insertsQuerys = new ArrayList<>();
        for (List<String> strings : tupel) {
            String insert = "INSERT INTO " + tablename + "( ";
            boolean komma = false;
            for (String s : table) {
                if(komma) insert += ",";
                komma = true;
                insert += s;
            }
            insert += ") VALUES( ";
            komma = false;
            for (String s : strings) {
                if(komma) insert += ",";
                komma = true;
                insert += s;
            }
            insert += ");";
            insertsQuerys.add(insert);
        }
        return insertsQuerys;
    }

    public String getNextID(String tablename){
        Integer ID;
        if(tablename_nextID.containsKey(tablename)){
            ID = tablename_nextID.get(tablename) + 1;
        }else ID = getNextSubID(tablename);
        tablename_nextID.put(tablename, ID);
        return ID.toString();
    }

    @FunctionalInterface
    public interface Getter {
        String getNextID(String tablename);
    }
}
