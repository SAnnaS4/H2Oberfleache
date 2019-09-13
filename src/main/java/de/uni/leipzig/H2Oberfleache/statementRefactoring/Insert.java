package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteLexer;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteParser;
import de.uni.leipzig.H2Oberfleache.presentation.UserDetails;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Insert extends Statement {
    private Map<String, Integer> tablename_nextID = new HashMap<>();

    public Insert(UserDetails userDetails) {
        super(userDetails);
    }

    public String nf2To1Nf(String sql){
        StringBuilder result = new StringBuilder(sql);
        SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(sql));
        SQLiteParser parser = new SQLiteParser(new CommonTokenStream(lexer));
        RuleContext context = parser.insert_stmt();
        Map<String, List<RuleContext>> childMap = SQL_Parser.getChildMap(context);
        if(childMap.containsKey("table_insert")){
            result = new StringBuilder();
            RuleContext tableInsert = childMap.get("table_insert").get(0);
            List<RuleContext> valueList = childMap.get("value_insert");
            List<String> queries = createQueries("", "0" , tableInsert, valueList, this::getNextID);
            for (String query : queries) {
                result.append(query);
            }
        }
        System.out.println(result.toString());
        return result.toString();
    }

    public List<String> createQueries(String obertab, String nextOTID, RuleContext tableInsert, List<RuleContext> valueList, Getter getter){
        Map<String, List<RuleContext>> tableInsertchilds = SQL_Parser.getChildMap(tableInsert);
        String tablename = tableInsertchilds.get("table_name").get(0).getText();
        List<String> queries = new ArrayList<>();
        List<String> table = new ArrayList<>();
        List<List<String>> tupleList = new ArrayList<>();
        if(!obertab.equals("")){
            tablename = "__" + obertab + "_" + tablename;
        }
        boolean tableIsSetted = false;
        String ID;
        String IDName = "__" + tablename + "ID";
        for (RuleContext value : valueList) {
            ID = getter.getNextID(tablename);

            Map<RuleContext, RuleContext> element_value = new HashMap<>();
            List<String> values = new ArrayList<>();
            List<RuleContext> tableChild = SQL_Parser.getChildList(tableInsert);
            if(SQLiteParser.ruleNames[value.getRuleIndex()].equals("expr")){
                element_value.put(tableChild.get(1), value);
            }else {
                List<RuleContext> valueChild = SQL_Parser.getChildList(value);
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
                    queries.addAll(createQueries(tablename, ID, entry.getKey(), row, getter));
                }
            }
            values.add(ID);
            if(!obertab.equals(""))values.add(nextOTID);
            tupleList.add(values);
            tableIsSetted = true;
        }
        table.add(IDName);
        if(!obertab.equals(""))table.add("__" + obertab + "ID");
        queries.addAll(makeInsertQuery(tablename, table, tupleList));
        return queries;
    }

    public List<RuleContext> getRows(RuleContext value_insert){
        List<RuleContext> rows = new ArrayList<>();
        List<RuleContext> children = SQL_Parser.getChildList(value_insert);
        if(SQLiteParser.ruleNames[children.get(0).getRuleIndex()].equals("row_expr")) {
            for (RuleContext child : children) {
                rows.addAll(SQL_Parser.getChildList(child));
            }
        }else rows = children;
        return rows;
    }

    private List<String> makeInsertQuery(String tablename, List<String> table, List<List<String>> tupel){
        List<String> insertsQueries = new ArrayList<>();
        for (List<String> strings : tupel) {
            StringBuilder insert = new StringBuilder("INSERT INTO " + tablename + "( ");
            boolean comma = false;
            for (String s : table) {
                if(comma) insert.append(",");
                comma = true;
                insert.append(s);
            }
            insert.append(") VALUES( ");
            comma = false;
            for (String s : strings) {
                if(comma) insert.append(",");
                comma = true;
                insert.append(s);
            }
            insert.append(");");
            insertsQueries.add(insert.toString());
        }
        return insertsQueries;
    }

    private String getNextID(String tablename){
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
