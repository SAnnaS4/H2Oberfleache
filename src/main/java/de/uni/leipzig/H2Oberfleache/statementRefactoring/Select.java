package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteLexer;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Select extends Statement{
    private static Integer aliasCounter = 0;
    private Map<String, String> alias_tablename = new HashMap<>();
    private Map<String, List<String>> parentTabAlias_childTabAliases = new HashMap<>();
    private List<String> maintables = new ArrayList<>();
    String sql;
    private Boolean zurAusgabe;
    private Map<String, List<RuleContext>> select_or_values = new HashMap<>();

    public Select(String sql, Boolean zurAusgabe){
        this.sql = sql;
        this.zurAusgabe = zurAusgabe;
        makeMap(sql);
    }

    public Select(Map<Integer, String> position_sql, String sql, Boolean zurAusgabe){
        this.sql = sql;
        this.zurAusgabe = zurAusgabe;
        this.position_sql = position_sql;
    }

    private String addIDSToQuery(){
        StringBuilder idsToQuery = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : parentTabAlias_childTabAliases.entrySet()) {
            String id = "__" + alias_tablename.get(entry.getKey()) + "ID";
            if(maintables.contains(alias_tablename.get(entry.getKey()))) {
                idsToQuery.append(", ").append(entry.getKey()).append(".").append(id);
            }else {
                String[] table = alias_tablename.get(entry.getKey()).split("_");
                String tablename = table[table.length-1];
                idsToQuery.append(", ").append(tablename).append(".").append(id);
            }
            for (String childtabAlias : entry.getValue()) {
                idsToQuery.append(", ").append(childtabAlias).append(".").append(id);
                if(!parentTabAlias_childTabAliases.containsKey(childtabAlias)){
                    String subid = "__" + alias_tablename.get(childtabAlias) + "ID";
                    idsToQuery.append(", ").append(childtabAlias).append(".").append(subid);
                }
            }
        }
        return idsToQuery.toString();
    }

    public String nf2ToNf1(Map<String, String> alias_tablename) {
        this.sql = prepareSQL(sql);
        this.alias_tablename = alias_tablename;
        SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(sql));
        SQLiteParser parser = new SQLiteParser(new CommonTokenStream(lexer));
        RuleContext select_stmt = parser.select_stmt();
        sql = changeSQL(select_stmt);
        System.out.println(sql);
        return sql;
    }

    public String nf2ToNf1(RuleContext context, Map<String, String> alias_tablename){
        this.alias_tablename = alias_tablename;
        return changeSQL(context);
    }

    public String nf2ToNf1() {
        sql = prepareSQL(sql);
        SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(sql));
        SQLiteParser parser = new SQLiteParser(new CommonTokenStream(lexer));
        RuleContext select_stmt = parser.select_stmt();
        sql = changeSQL(select_stmt);
        System.out.println(sql);
        return sql;
    }

    public String nf2ToNf1(RuleContext context){
        return changeSQL(context);
    }

    private String changeSQL(RuleContext select_stmt){
        List<RuleContext> tables_or_subqueries = getTables_orSubquerys(select_stmt);
        for (RuleContext tables_or_subquery : tables_or_subqueries) {
            Map<String, List<RuleContext>> children = SQL_Parser.getChildMap(tables_or_subquery);
            if(children.containsKey("select_stmt")){
                Select select = new Select(cutFromSQL(tables_or_subquery, sql), zurAusgabe);
                replaceRuleContext(tables_or_subquery, "(" + select.nf2ToNf1(alias_tablename) + ")");
            }else {
                if(children.containsKey("table_name")){
                    List<String> subtables = getNF2TableNamesRec(children.get("table_name").get(0).getText());
                    if(!subtables.isEmpty()) {
                        String tablename = children.get("table_name").get(0).getText();
                        if(alias_tablename.containsKey(tablename)){
                            String[] names = cutFromSQL(tables_or_subquery, sql).split(".");
                            String neu = names[1];
                            for (int i = 2; i<names.length; i++) {
                                neu += "." + names[i];
                            }
                            replaceRuleContext(tables_or_subquery, neu);
                            continue;
                        }
                        if(tables_or_subquery.getText().contains(".")) tablename = getTablename(tables_or_subquery, subtables, false);
                        String alias = "";
                        if(children.containsKey("table_alias"))alias = children.get("table_alias").get(0).getText();
                        sql = updateFrom(tablename, tables_or_subquery, alias);
                    }
                }
            }
        }
        sql = updateWhereExpr(select_stmt, sql);
        return sql;
    }

    private String updateFrom(String tablename, RuleContext table, String alias){
        maintables.add(tablename);
        sql = insertJoins(tablename, table, alias);
        if(!alias.equals("")){
            alias_tablename.entrySet().removeIf(entry -> entry.getKey().equals(tablename));
            alias_tablename.put(alias, tablename);
        }
        return sql;
    }

    private List<RuleContext> getTables_orSubquerys(RuleContext select_stmt){
        List<RuleContext> tables_or_subtables = new ArrayList<>();
        Map<String, List<RuleContext>> children = SQL_Parser.getChildMap(select_stmt);
        if(children.containsKey("select_stmt"))children = SQL_Parser.getChildMap(children.get("select_stmt").get(0));
        if(children.containsKey("select_or_values")){
            select_or_values = SQL_Parser.getChildMap(children.get("select_or_values").get(0));
            if(select_or_values.containsKey("table_or_subquery"))tables_or_subtables = select_or_values.get("table_or_subquery");
        }
        return tables_or_subtables;
    }

    private String insertJoins(String tablename, RuleContext table, String alias){
        String tablenameJoins = getTablenameJoins(tablename);
        if(!alias.equals(""))tablenameJoins += " " + alias;
        return replaceRuleContext(table, tablenameJoins);
    }

    private String getTablenameJoins(String tablename){
        List<String> subtables = getNF2TableNames(tablename);
        Map<String, String> name_newSubtables = new HashMap<>();
        for (String subtable : subtables) {
            String newName = getTablenameJoins(subtable);
            name_newSubtables.put(subtable, newName);
        }
        return generateFullText(tablename, name_newSubtables);
    }

    private String generateFullText(String tablename, Map<String, String> name_contentSubtables){
        if(name_contentSubtables.isEmpty())return tablename;
        String alias;
        alias = "_A_" + ++aliasCounter;
        alias_tablename.put(alias, tablename);
        String tablenameJoins = "(" + tablename + " as " + alias;
        for (Map.Entry<String, String> subtable : name_contentSubtables.entrySet()) {
            String IDName = "__" + tablename + "ID";
            tablenameJoins += generateJoins(subtable.getValue(),subtable.getKey(), alias, IDName);
        }
        return tablenameJoins + ")";
    }

    private String generateJoins(String subtablecontent, String subtablename, String tablename_or_alias, String IDName){
        String result = " LEFT JOIN ";
        String[] helper = subtablename.split("_");
        String alias = subtablename;
        if(helper.length > 0)alias = helper[helper.length-1];
        if(parentTabAlias_childTabAliases.containsKey(tablename_or_alias)){
            List<String> childtabAlias = parentTabAlias_childTabAliases.get(tablename_or_alias);
            childtabAlias.add(alias);
            parentTabAlias_childTabAliases.put(tablename_or_alias, childtabAlias);
        }else {
            List<String> childtabAlias = new ArrayList<>();
            childtabAlias.add(alias);
            parentTabAlias_childTabAliases.put(tablename_or_alias, childtabAlias);
        }
        alias_tablename.put(alias, subtablename);
        return result + subtablecontent + " " + alias + " ON " + tablename_or_alias + "." + IDName + " = " + alias + "." + IDName;
    }

    private String addAllSubtables(RuleContext result_column){
        String tablename = "";
        String newExpression = ""; //result_column.getText();
        String[] tables = result_column.getText().split("\\.");
        if(tables.length > 1) {
            newExpression = tables[tables.length - 2] + "." + tables[tables.length - 1];
        }
        String aliasname = result_column.getChild(result_column.getChildCount()-3).getText();
        if(alias_tablename.containsKey(aliasname)){
            tablename = alias_tablename.get(aliasname);
        }else {
            List<String> allSubtables = new ArrayList<>();
            for (String haupttable : maintables) {
                allSubtables.addAll(getNF2TableNamesRec(haupttable));
            }
            tablename = getTablename(result_column, allSubtables, true);
        }
        List<String> subtables = getNF2TableNamesRec(tablename);
        for (String subtable : subtables) {
            String[] alias = subtable.split("_");
            String aliasName = alias[alias.length-1];
            newExpression += ", " + aliasName + ".*";
        }
        return newExpression;
    }

    private String updateWhereExpr(RuleContext stmt, String sql){
        Map<String, List<RuleContext>> context = SQL_Parser.getChildMap(stmt);
        if(context.containsKey("ordering_term")){
            List<RuleContext> ordering_terms = context.get("ordering_term");
            for (RuleContext ordering_term : ordering_terms) {
                RuleContext expr = (RuleContext) ordering_term.getChild(0);
                String newExp = Where.changeExpr(expr, alias_tablename, maintables);
                sql = replaceRuleContext(expr, newExp);
            }
        }
        Boolean notAdded = true;
        if(select_or_values.containsKey("result_column")){
            List<RuleContext> result_columns = select_or_values.get("result_column");
            for (RuleContext result_column : result_columns) {
                if(!result_column.getText().equals("*")) {
                    String newExp = "";
                    RuleContext expr = null;
                    ParseTree element = result_column.getChild(0);
                    if (element instanceof RuleContext) {
                        expr = (RuleContext) element;
                    }
                    assert expr != null;
                    if (result_column.getText().contains("*")) {
                        newExp = addAllSubtables(expr);
                    } else if(SQLiteParser.ruleNames[expr.getRuleIndex()].equals("aggregate")){

                    }else{
                        newExp = Where.changeExpr(expr, alias_tablename, maintables);
                        if (notAdded && zurAusgabe) {
                            newExp += addIDSToQuery();
                            notAdded = false;
                        }
                    }
                        sql = replaceRuleContext(expr, newExp);
                }
            }
        }
        if(select_or_values.containsKey("where_expr")){
            List<RuleContext> where_exprs = select_or_values.get("where_expr");
            for (RuleContext where_expr : where_exprs) {
                Where where = new Where(sql, where_expr.parent, alias_tablename, position_sql, maintables);
                sql = where.sql;
            }
        }
        return sql;
    }

}
