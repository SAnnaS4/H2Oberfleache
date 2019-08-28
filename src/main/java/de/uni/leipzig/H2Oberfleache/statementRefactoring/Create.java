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

public class Create extends Statement {
    String sql;

    public Create(String sql){
        this.sql = sql;
    }

    public String nf2ToNf1() {
        sql = prepareSQL(sql);
        SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(sql));
        SQLiteParser parser = new SQLiteParser(new CommonTokenStream(lexer));
        RuleContext stmt = parser.create_table_stmt();
        StringBuilder result;
        if(sql.contains("CREATE TABLE") && sql.contains("SET(ROW")){
            List<String> queries;
            queries = getQueries(stmt, null);
            result = new StringBuilder("CREATE TABLE IF NOT EXISTS " + nf2TabName + "(NAME VARCHAR(60), OBERTABELLE VARCHAR(60));");
            for (String query : queries) {
                result.append(query);
            }
        }else{
            result = new StringBuilder(sql);
        }
        return result.toString();
    }

    private List<String> getQueries(RuleContext stmt, String higherTablename){
        List<String> queries = new ArrayList<>();
        List<RuleContext> childList = SQL_Parser.getChildList(stmt);
        Map<String, String> columname_type = new HashMap<>();
        boolean containsSubTable = false;
        String tablename = "";
        for (RuleContext context : childList) {
            String contexttype = SQLiteParser.ruleNames[context.getRuleIndex()];
            if(contexttype.equals("table_name") || contexttype.equals("subtable_name")){
                if(contexttype.equals("subtable_name")) {
                    tablename = "__" + higherTablename + "_" + context.getText();
                }else tablename = context.getText();
            }
            if(contexttype.equals("set_row_create")){
                queries.addAll(getQueries(context, tablename));
                containsSubTable = true;
            }
            if(contexttype.equals("column_def")){
                List<RuleContext> column = SQL_Parser.getChildList(context);
                String columnName = "";
                String columntype = "";
                for (RuleContext ruleContext : column) {
                    contexttype = SQLiteParser.ruleNames[ruleContext.getRuleIndex()];
                    if(contexttype.equals("column_name"))columnName = ruleContext.getText();
                    if(contexttype.equals("type_name"))columntype = ruleContext.getText();
                }
                columname_type.put(columnName, columntype);
            }
        }
        String newNF2Tables= "INSERT INTO " + nf2TabName + "(NAME, OBERTABELLE) VALUES(" + "'" + tablename + "', '"
                + higherTablename + "');";
        StringBuilder query = new StringBuilder("CREATE TABLE " + tablename + "(");
        for (Map.Entry<String, String> column : columname_type.entrySet()) {
            query.append(column.getKey()).append(" ").append(column.getValue()).append(", ");
        }
        if(containsSubTable || !(higherTablename == null)) {
            newNF2Tables= "INSERT INTO " + nf2TabName + "(NAME, OBERTABELLE) VALUES(" + "'" + tablename + "', '"
                    + higherTablename + "');";
            query.append("__").append(tablename).append("ID INT");
            try {
                if (!(higherTablename.isEmpty())) query.append(", " + "__").append(higherTablename).append("ID INT");
            } catch (NullPointerException e) {
            }
        }
        query.append(");");
        queries.add(newNF2Tables);
        queries.add(query.toString());
        return queries;
    }
}