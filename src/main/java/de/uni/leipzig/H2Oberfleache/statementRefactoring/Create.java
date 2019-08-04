package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteLexer;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Create extends Statement {
    public static String nf2ToNf1(String sql) {
        sql = prepareSQL(sql);
        SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(sql));
        SQLiteParser parser = new SQLiteParser(new CommonTokenStream(lexer));
        RuleContext stmt = parser.create_table_stmt();
        String result;
        if(sql.contains("CREATE TABLE") && sql.contains("SET(ROW")){
            List<String> querys = new ArrayList<>();
            querys = getQuerys(querys, stmt, null);
            result = "CREATE TABLE IF NOT EXISTS " + nf2TabName + "(NAME VARCHAR(60), OBERTABELLE VARCHAR(60));";
            for (String query : querys) {
                result += query;
            }
        }else{
            result = sql;
        }
        return result;
    }

    private static List<String> getQuerys(List<String> querys, RuleContext stmt, String higherTablename){
        List<RuleContext> childList = SQL_Parser.getChildList(stmt);
        Map<String, String> columname_type = new HashMap<>();
        Boolean containsSubTable = false;
        String tablename = "";
        for (RuleContext context : childList) {
            String contextTyp = SQLiteParser.ruleNames[context.getRuleIndex()];
            if(contextTyp.equals("table_name") || contextTyp.equals("subtable_name")){
                if(contextTyp.equals("subtable_name")) {
                    tablename = "__" + higherTablename + "_" + context.getText();
                }else tablename = context.getText();
            }
            if(contextTyp.equals("set_row_create")){
                querys = (getQuerys(querys, context, tablename));
                containsSubTable = true;
            }
            if(contextTyp.equals("column_def")){
                List<RuleContext> column = SQL_Parser.getChildList(context);
                String columnName = "";
                String columnTyp = "";
                for (RuleContext ruleContext : column) {
                    contextTyp = SQLiteParser.ruleNames[ruleContext.getRuleIndex()];
                    if(contextTyp.equals("column_name"))columnName = ruleContext.getText();
                    if(contextTyp.equals("type_name"))columnTyp = ruleContext.getText();
                }
                columname_type.put(columnName, columnTyp);
            }
        }
        String newNF2Tables= "INSERT INTO " + nf2TabName + "(NAME, OBERTABELLE) VALUES(" + "'" + tablename + "', '"
                + higherTablename + "');";
        String query = "CREATE TABLE " + tablename + "(";
        for (Map.Entry<String, String> column : columname_type.entrySet()) {
            query += column.getKey() + " " + column.getValue() + ", ";
        }
        if(containsSubTable || !(higherTablename == null)) {
            newNF2Tables= "INSERT INTO " + nf2TabName + "(NAME, OBERTABELLE) VALUES(" + "'" + tablename + "', '"
                    + higherTablename + "');";
            if (containsSubTable) query += "__" + tablename + "ID INT";
            try {
                if (containsSubTable && !(higherTablename.isEmpty())) query += " ,";
                if (!(higherTablename.isEmpty())) query += "__" + higherTablename + "ID INT";
            } catch (NullPointerException e) {
            }
        }
        query += ");";
        querys.add(newNF2Tables);
        querys.add(query);
        return querys;
    }


}