package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.controller.BaseController;
import de.uni.leipzig.H2Oberfleache.jdbc.DbInfo;
import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteParser;
import de.uni.leipzig.H2Oberfleache.presentation.TreeMaker;
import org.antlr.v4.runtime.RuleContext;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Where extends Statement{
    String sql;
    Map<String, String> alias_tablename;
    public Where(String sql, RuleContext context, Map<String, String> alias_tablename, Map<Integer, String> position_sql,
                 List<String> haupttables, Map<String, List<String>> parentTabAlias_childTabAliases) {
        this.sql = sql;
        this.alias_tablename = alias_tablename;
        this.position_sql = position_sql;
        for (RuleContext ruleContext : SQL_Parser.getChildList(context)) {
            String ruleName = SQLiteParser.ruleNames[ruleContext.getRuleIndex()];
            if(ruleName.equals("where_expr")){
                List<RuleContext> exprs = exploreExpr((RuleContext) ruleContext.getChild(1));
                usedExpr = new ArrayList<>();
                for (RuleContext expr : exprs) {
                    if(!usedExpr.contains(expr)) {
                        String newExpr = changeExpr(expr, alias_tablename, haupttables, position_sql, sql, parentTabAlias_childTabAliases);
                        if (!newExpr.equals(expr.getText())) {
                            if(newExpr.contains("NOT EXISTS (") && newExpr.contains("AND NOT EXISTS (") && newExpr.contains(" EXCEPT")){
                                this.sql = replaceRuleContext(expr.parent, newExpr);
                            }else this.sql = replaceRuleContext(expr, newExpr);
                        }
                    }
                }
            }
            if(SQLiteParser.ruleNames[ruleContext.getRuleIndex()].equals("group_by")){
                for (RuleContext context1 : SQL_Parser.getChildList(ruleContext)) {
                    if(SQLiteParser.ruleNames[context1.getRuleIndex()].equals("expr")){
                        String newExpr = changeExpr(context1, alias_tablename, haupttables, position_sql, sql,parentTabAlias_childTabAliases );
                        if(!newExpr.equals(context.getText())){
                            this.sql = replaceRuleContext(context, newExpr);
                        }
                    }
                }
            }
        }
    }

    public Where() {
    }

    protected List<RuleContext> exploreExpr(RuleContext expr){
        List<RuleContext> exprs = new ArrayList<>();
        Map<String, List<RuleContext>> children = SQL_Parser.getChildMap(expr);
        if(children.containsKey("aggregate")){
            exprs.add(expr);
            return exprs;
        }
        //else if(children.containsKey("expr"))
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

    public static List<RuleContext> usedExpr = new ArrayList<>();

    public static String changeExpr(RuleContext expr, Map<String, String> alias_tablename,
                                    List<String> maintables, Map<Integer, String> position_sql, String sql,
                                    Map<String, List<String>> parentTabAlias_childTabAliases) {
        Map<String, List<RuleContext>> children = SQL_Parser.getChildMap(expr);
        if(children.containsKey("aggregate")){
            Grouping grouping = new Grouping(position_sql, alias_tablename, maintables, sql);
            return grouping.aggragateInWhere(expr);
        }
        List<RuleContext> column = children.get("column_name");
        if(alias_tablename.containsKey(column.get(column.size()-1).getText()) && expr.parent.getText().contains("=")){
            usedExpr.add(expr);
            RuleContext parent = expr.parent;
            return makeJoinConstraint(parent, alias_tablename, parentTabAlias_childTabAliases);
        }
        if(alias_tablename.containsKey(column.get(column.size()-1).getText()))
            return getSubtableASQuery(expr, alias_tablename, parentTabAlias_childTabAliases);
        if(children.containsKey("function_name")){
            Map<String, List<RuleContext>> child = SQL_Parser.getChildMap(children.get("function_name").get(0));
            if(child.containsKey("expr")){
                return changeExpr(child.get("expr").get(0), alias_tablename, maintables, position_sql, sql, parentTabAlias_childTabAliases);
            }
        }
        if(!children.containsKey("table_name") && !children.containsKey("function_name") && !alias_tablename.containsKey(expr.getText())){
            return getAlias(alias_tablename, expr.getText(), maintables) + "." + expr.getText();
        }
        String[] tables = expr.getText().split("\\.");
        String result = expr.getText();
        if(tables.length > 1) {
            result = getAliasColumn(expr.getText(), alias_tablename, parentTabAlias_childTabAliases);
        }
        return result;
    }

    private static String makeJoinConstraint(RuleContext parent, Map<String, String> alias_tablename, Map<String, List<String>> parentTabAlias_childTabAliases) {
        List<RuleContext> expr = SQL_Parser.getChildMap(parent).get("expr");
        List<String> selectStmts = new ArrayList<>();
        for (RuleContext ruleContext : expr) {
            selectStmts.add(getSubtableASQuery(ruleContext, alias_tablename, parentTabAlias_childTabAliases));
        }
        String constraint = "NOT EXISTS (" + selectStmts.get(0) +
                " EXCEPT" + selectStmts.get(1) + ") " +
                "AND NOT EXISTS (" + selectStmts.get(1) +
                " EXCEPT" + selectStmts.get(0) + ")";
        return constraint;
    }

    private static String getSubtableASQuery(RuleContext context, Map<String, String> alias_tablename, Map<String, List<String>> parentTabAlias_childTabAliases) {
        String select = "SELECT ";
        String[] parts = context.getText().split("\\.");
        String table = getLastAlias(parts, alias_tablename, parentTabAlias_childTabAliases);
        String tablename = alias_tablename.getOrDefault(table, table);
        List<String> columns = new ArrayList<>();
        try {
            columns = DbInfo.getColumnList(false, BaseController.dbName, tablename, BaseController.user, BaseController.password);
        } catch (SQLException | IllegalAccessException e) {
            e.printStackTrace();
        }
        for (String column : columns) {
            if(!column.startsWith("__") && !column.endsWith("ID"))
            select += table + "." + column + ", ";
        }
        String oberTab = getObertabelle(tablename);
        String oberAlias = oberTab;
        for (Map.Entry<String, String> entry : alias_tablename.entrySet()) {
            if(entry.getValue().equals(oberTab))oberAlias = entry.getKey();
        }
        String ID = "__" + oberTab + "ID";
        select = select.substring(0, select.length()-2);
        select += " FROM " + tablename + " " + table + " WHERE " + table + "." + ID + " = " + oberAlias + "." + ID;
        select = "(" + select + ")";
        return select;
    }

    protected static String getAlias(Map<String, String> alias_tablename, String column, List<String> maintables){
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

    private static String getAliasColumn(String column, Map<String, String> alias_tablename, Map<String, List<String>> parentTabAlias_childTabAliases){
        String[] parts = column.split("\\.");
        String[] part1 = new String[parts.length-1];
        System.arraycopy(parts, 0, part1, 0, parts.length - 1);
        //Map<String, List<String>> newParentTabAlias_childTabAliases = updateParent_child(alias_tablename, parentTabAlias_childTabAliases);
        return getLastAlias(part1, alias_tablename, parentTabAlias_childTabAliases) + "." + parts[parts.length-1];
    }

    private static String getLastAlias(String[] parts, Map<String, String> alias_tablename, Map<String, List<String>> parentTabAlias_childTabAliases){
        if(!parentTabAlias_childTabAliases.isEmpty()) {
            for (int i = 0; i < parts.length-1; i++) {
                if (alias_tablename.containsKey(parts[i]) || alias_tablename.containsValue(parts[i])) {
                    List<String> childs = parentTabAlias_childTabAliases.getOrDefault(parts[i], new ArrayList<>());
                    if (!childs.contains(parts[i + 1])) {
                        String nextAlias;
                        String alias = parts[i + 1];
                        int j = 1;
                        do {
                            nextAlias = alias + j;
                            j++;
                        } while (!childs.contains(nextAlias));
                        parts[i + 1] = nextAlias;
                    }
                }
            }
        }
        return parts[parts.length-1];
    }

    private static Map<String, List<String>>  updateParent_child(Map<String, String> alias_tablename, Map<String, List<String>> parentTabAlias_childTabAliases){
        Map<String, List<String>> newParentTabAlias_childTabAliases = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : parentTabAlias_childTabAliases.entrySet()) {
            newParentTabAlias_childTabAliases.put(alias_tablename.get(entry.getKey()), entry.getValue());
        }
        newParentTabAlias_childTabAliases.putAll(parentTabAlias_childTabAliases);
        return newParentTabAlias_childTabAliases;
    }
}
