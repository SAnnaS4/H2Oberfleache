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

public class Select extends Statement{
    static Integer aliasCounter = 0;
    static Map<String, String> alias_tablename = new HashMap<>();

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
        Integer aliasnumber = 0;
        for (RuleContext tablename : tablenames) {
            List<String> subtables = getNF2TableNames(tablename.getText());
            if (!subtables.isEmpty()) {
                alias_tablename.put(("_A_" + ++aliasnumber), tablename.getText());
                sql = insertJoins(tablename);
            }
        }
        //map einbinden
        sql = updateWhereExpr(select_stmt, sql);
        return sql;
    }

    public static String nf2ToNf1(String sql, RuleContext context){
        Map<String, List<RuleContext>> map = SQL_Parser.getParsedMap(context);
        return changeSQL(sql, map, context);
    }

    private static String insertJoins(RuleContext tablename){
        String tablename_mit_Joins = getTablename_mit_joins(tablename.getText());
        return replaceRuleContext(tablename, tablename_mit_Joins);
    }

    private static String getTablename_mit_joins(String tablename){
        List<String> subtables = getNF2TableNames(tablename);
        Map<String, String> name_newSubtables = new HashMap<>();
        for (String subtable : subtables) {
            String newName = getTablename_mit_joins(subtable);
            name_newSubtables.put(subtable, newName);
        }
        return generateFullText(tablename, name_newSubtables);
    }

    private static String generateFullText(String tablename, Map<String, String> name_inhaltSubtables){
        if(name_inhaltSubtables.isEmpty())return tablename;
        String alias;
        alias = "_A_" + ++aliasCounter;
        String tablename_mit_Joins = "(" + tablename + " as " + alias;
        for (Map.Entry<String, String> subtable : name_inhaltSubtables.entrySet()) {
            String IDName = "__" + tablename + "ID";
            tablename_mit_Joins += generateJoins(subtable.getValue(),subtable.getKey(), alias, IDName);
        }
        return tablename_mit_Joins + ")";
    }

    private static String generateJoins(String subtableinhalt, String subtablename, String tablename_or_alias, String IDName){
        String result = " LEFT JOIN ";
        String[] helper = subtablename.split("_");
        String alias = subtablename;
        if(helper.length > 0)alias = helper[helper.length-1];
        return result + subtableinhalt + " " + alias + " ON " + tablename_or_alias + "." + IDName + " = " + alias + "." + IDName;
    }

    public static String updateWhereExpr(RuleContext stmt, String sql){
        for (RuleContext context : SQL_Parser.getChildList(stmt)) {
            if(SQLiteParser.ruleNames[context.getRuleIndex()].equals("ordering_term")){
                RuleContext expr = (RuleContext) context.getChild(0);
                String newExp = Where.changeExpr(expr, ("_A_" + aliasCounter));
                sql = replaceRuleContext(expr, newExp);
            }
            if(SQLiteParser.ruleNames[context.getRuleIndex()].equals("select_or_values")){
                Where where = new Where(sql, context, ("_A_" + aliasCounter));
                sql = where.sql;
            }
        }
        return sql;
    }


}
