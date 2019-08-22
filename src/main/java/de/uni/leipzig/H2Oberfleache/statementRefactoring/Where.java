package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.controller.BaseController;
import de.uni.leipzig.H2Oberfleache.controller.Tables;
import de.uni.leipzig.H2Oberfleache.jdbc.DbInfo;
import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteParser;
import org.antlr.v4.runtime.RuleContext;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Where extends Statement{
    String sql;
    Map<String, String> alias_tablename;
    public Where(String sql, RuleContext context, Map<String, String> alias_tablename, Map<Integer, String> position_sql, List<String> haupttables){
        this.sql = sql;
        this.alias_tablename = alias_tablename;
        this.position_sql = position_sql;
        for (RuleContext ruleContext : SQL_Parser.getChildList(context)) {
            String ruleName = SQLiteParser.ruleNames[ruleContext.getRuleIndex()];
            if(ruleName.equals("where_expr")){
                List<RuleContext> exprs = exploreExpr((RuleContext) ruleContext.getChild(1));
                for (RuleContext expr : exprs) {
                        String newExpr = changeExpr(expr, alias_tablename, haupttables);
                        if (!newExpr.equals(expr.getText())) {
                            this.sql = replaceRuleContext(expr, newExpr);
                        }
                }
            }
            if(SQLiteParser.ruleNames[ruleContext.getRuleIndex()].equals("group_by")){
                for (RuleContext context1 : SQL_Parser.getChildList(ruleContext)) {
                    if(SQLiteParser.ruleNames[context1.getRuleIndex()].equals("expr")){
                        String newExpr = changeExpr(context1, alias_tablename, haupttables);
                        if(!newExpr.equals(context.getText())){
                            this.sql = replaceRuleContext(context, newExpr);
                        }
                    }
                }
            }
        }
    }

    public List<RuleContext> exploreExpr(RuleContext expr){
        List<RuleContext> exprs = new ArrayList<>();
        for (RuleContext context : SQL_Parser.getChildList(expr)) {
            if(SQLiteParser.ruleNames[context.getRuleIndex()].equals("expr")){
                exprs.addAll(exploreExpr(context));
            }
            if(SQLiteParser.ruleNames[context.getRuleIndex()].equals("column_name")){
                exprs.add(context.getParent());
            }
            if(SQLiteParser.ruleNames[context.getRuleIndex()].equals("select_stmt")){
                Select select = new Select(this.sql, false);
                this.sql = select.nf2ToNf1(context, alias_tablename);
            }
        }
        return exprs;
    }

    public static String changeExpr(RuleContext expr, Map<String, String> alias_tablename, List<String> haupttables){
        Map<String, List<RuleContext>> childs = SQL_Parser.getChildMap(expr);
        if(!childs.containsKey("table_name") && !childs.containsKey("function_name")){
            return getAlias(alias_tablename, expr.getText(), haupttables) + "." + expr.getText();
        }
        if(childs.containsKey("function_name")){
            Map<String, List<RuleContext>> child = SQL_Parser.getChildMap(childs.get("function_name").get(0));
            if(child.containsKey("expr")){
                return changeExpr(child.get("expr").get(0), alias_tablename, haupttables);
            }
        }
        String[] tables = expr.getText().split("\\.");
        String result = expr.getText();
        if(tables.length > 1) {
            result = tables[tables.length - 2] + "." + tables[tables.length - 1];
        }
        return result;
    }

    public static String getAlias(Map<String, String> alias_tablename, String column, List<String> haupttables){
        for (Map.Entry<String, String> entry : alias_tablename.entrySet()) {
            if(haupttables.contains(entry.getValue())) {
                List<String> attributes = getAllAttributes(entry.getValue());
                for (String attribute : attributes) {
                    if (attribute.equals(column)) return entry.getKey();
                }
            }
        }
        return "";
    }

    public static List<String> getAllAttributes(String tablename){
        DbInfo dbInfo = new DbInfo();
        List<String> attributes = new ArrayList<>();
        try {
            Map<String, String> columns = dbInfo.getColums(false,BaseController.dbName,tablename, BaseController.user, BaseController.password);
            for (Map.Entry<String, String> entry : columns.entrySet()) {
                attributes.add(entry.getKey());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return attributes;
    }
}
