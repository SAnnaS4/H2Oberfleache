package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.controller.BaseController;
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
    private Map<String, String> alias_tablename;
    public Where(String sql, RuleContext context, Map<String, String> alias_tablename, Map<Integer, String> position_sql, List<String> haupttables){
        this.sql = sql;
        this.alias_tablename = alias_tablename;
        this.position_sql = position_sql;
        for (RuleContext ruleContext : SQL_Parser.getChildList(context)) {
            String ruleName = SQLiteParser.ruleNames[ruleContext.getRuleIndex()];
            if(ruleName.equals("where_expr")){
                List<RuleContext> exprs = exploreExpr((RuleContext) ruleContext.getChild(1));
                for (RuleContext expr : exprs) {
                        String newExpr = changeExpr(expr, alias_tablename, haupttables, position_sql, sql);
                        if (!newExpr.equals(expr.getText())) {
                            this.sql = replaceRuleContext(expr, newExpr);
                        }
                }
            }
            if(SQLiteParser.ruleNames[ruleContext.getRuleIndex()].equals("group_by")){
                for (RuleContext context1 : SQL_Parser.getChildList(ruleContext)) {
                    if(SQLiteParser.ruleNames[context1.getRuleIndex()].equals("expr")){
                        String newExpr = changeExpr(context1, alias_tablename, haupttables, position_sql, sql);
                        if(!newExpr.equals(context.getText())){
                            this.sql = replaceRuleContext(context, newExpr);
                        }
                    }
                }
            }
        }
    }

    private List<RuleContext> exploreExpr(RuleContext expr){
        List<RuleContext> exprs = new ArrayList<>();
        Map<String, List<RuleContext>> children = SQL_Parser.getChildMap(expr);
        if(children.containsKey("aggregate")){
            exprs.add(expr);
        }else if(children.containsKey("expr"))
        for (RuleContext context : SQL_Parser.getChildList(expr)) {
            if(SQLiteParser.ruleNames[context.getRuleIndex()].equals("expr")){
                exprs.addAll(exploreExpr(context));
            }
            if(SQLiteParser.ruleNames[context.getRuleIndex()].equals("column_name")){
                exprs.add(context.getParent());
            }
            if(SQLiteParser.ruleNames[context.getRuleIndex()].equals("select_stmt")){
                Select select = new Select(position_sql, this.sql, false);
                this.sql = select.nf2ToNf1(context, alias_tablename);
            }
        }
        return exprs;
    }

    public static String changeExpr(RuleContext expr, Map<String, String> alias_tablename,
                                    List<String> maintables, Map<Integer, String> position_sql, String sql){
        Map<String, List<RuleContext>> children = SQL_Parser.getChildMap(expr);
        if(children.containsKey("aggregate")){
            Grouping grouping = new Grouping(position_sql, alias_tablename, maintables, sql);
            return grouping.aggragateInWhere(expr);
        }
        if(children.containsKey("function_name")){
            Map<String, List<RuleContext>> child = SQL_Parser.getChildMap(children.get("function_name").get(0));
            if(child.containsKey("expr")){
                return changeExpr(child.get("expr").get(0), alias_tablename, maintables, position_sql, sql);
            }
        }
        if(!children.containsKey("table_name") && !children.containsKey("function_name") && !alias_tablename.containsKey(expr.getText())){
            return getAlias(alias_tablename, expr.getText(), maintables) + "." + expr.getText();
        }
        String[] tables = expr.getText().split("\\.");
        String result = expr.getText();
        if(tables.length > 1) {
            result = tables[tables.length - 2] + "." + tables[tables.length - 1];
        }
        return result;
    }

    private static String getAlias(Map<String, String> alias_tablename, String column, List<String> maintables){
        for (Map.Entry<String, String> entry : alias_tablename.entrySet()) {
            if(maintables.contains(entry.getValue())) {
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
        } catch (SQLException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return attributes;
    }
}
