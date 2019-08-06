package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteLexer;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;

import java.util.List;
import java.util.Map;

public class Select extends Statement{
    static Integer aliasCounter = 0;

    public static String nf2ToNf1(String sql) {
        sql = prepareSQL(sql);
        SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(sql));
        SQLiteParser parser = new SQLiteParser(new CommonTokenStream(lexer));
        RuleContext select_stmt = parser.select_stmt();
        Map<String, List<RuleContext>> map = SQL_Parser.getParsedMap(sql);
        return changeSQL(sql, map, select_stmt);
    }

    private static String changeSQL(String sql, Map<String, List<RuleContext>> map, RuleContext select_stmt){
        List<RuleContext> tablenames = map.get("table_name");
        for (RuleContext tablename : tablenames) {
            List<String> subtables = getNF2TableNames(tablename.getText());
            if (!subtables.isEmpty()) {
                sql = insertJoins(subtables,tablename, sql);
                sql = updateWhereExpr(select_stmt, sql);
            }
        }
        return sql;
    }

    public static String nf2ToNf1(String sql, RuleContext context){
        Map<String, List<RuleContext>> map = SQL_Parser.getParsedMap(context);
        return changeSQL(sql, map, context);
    }

    private static String insertJoins(List<String> subtables, RuleContext tablename, String sql){
        String alias = "_A_" + ++aliasCounter;
        String tablename_mit_Joins = tablename.getText() + " as " + alias;
        for (String subtable : subtables) {
            String IDName = "__" + tablename.getText() + "ID";
            tablename_mit_Joins += generateJoins(subtable, alias, IDName);
        }
        return replaceRuleContext(sql, tablename, tablename_mit_Joins);
    }



    private static String generateJoins(String subtablename, String tablename_or_alias, String IDName){
        String result = " LEFT JOIN ";
        String[] helper = subtablename.split("_");
        String alias = subtablename;
        if(helper.length > 0)alias = helper[helper.length-1];
        return result + subtablename + " " + alias + " ON " + tablename_or_alias + "." + IDName + " = " + alias + "." + IDName;
    }

    public static String updateWhereExpr(RuleContext stmt, String sql){
        for (RuleContext context : SQL_Parser.getChildList(stmt)) {
            if(SQLiteParser.ruleNames[context.getRuleIndex()].equals("ordering_term")){
                RuleContext expr = (RuleContext) context.getChild(0);
                String newExp = Where.changeExpr(expr, ("_A_" + aliasCounter));
                sql = replaceRuleContext(sql, expr, newExp);
            }
            if(SQLiteParser.ruleNames[context.getRuleIndex()].equals("select_or_values")){
                Where where = new Where(sql, context, ("_A_" + aliasCounter));
                sql = where.sql;
            }
        }
        return sql;
    }


}
