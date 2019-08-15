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
    static Integer aliasCounter = 0;
    Map<String, String> alias_tablename = new HashMap<>();
    Map<String, List<String>> oberTabAlias_untertabAlias = new HashMap<>();
    List<String> haupttables = new ArrayList<>();
    String sql;
    Boolean zurAusgabe;
    Map<String, List<RuleContext>> select_or_values = new HashMap<>();

    public Select(String sql, Boolean zurAusgabe){
        this.sql = sql;
        this.zurAusgabe = zurAusgabe;
        makeMap(sql);
    }

    public String addIDSToQuery(){
        String idsToQuery = "";
        for (Map.Entry<String, List<String>> entry : oberTabAlias_untertabAlias.entrySet()) {
            String id = "__" + alias_tablename.get(entry.getKey()) + "ID";
            if(haupttables.contains(alias_tablename.get(entry.getKey()))) {
                idsToQuery += ", " + entry.getKey() + "." + id;
            }else {
                String[] table = alias_tablename.get(entry.getKey()).split("_");
                String tablename = table[table.length-1];
                idsToQuery += ", " + tablename + "." + id;
            }
            for (String untertabAlias : entry.getValue()) {
                idsToQuery += ", " + untertabAlias + "." + id;
            }
        }
        return idsToQuery;
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
        List<RuleContext> tables_or_subquerys = getTables_orSubquerys(select_stmt);
        for (RuleContext tables_or_subquery : tables_or_subquerys) {
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
        haupttables.add(tablename);
        sql = insertJoins(tablename, table, alias);
        if(!alias.equals("")){
            alias_tablename.entrySet().removeIf(entry -> entry.getKey().equals(tablename));
            alias_tablename.put(alias, tablename);
        }
        return sql;
    }

    public List<RuleContext> getTables_orSubquerys(RuleContext select_stmt){
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
        String tablename_mit_Joins = getTablename_mit_joins(tablename);
        if(!alias.equals(""))tablename_mit_Joins += " " + alias;
        return replaceRuleContext(table, tablename_mit_Joins);
    }

    private String getTablename_mit_joins(String tablename){
        List<String> subtables = getNF2TableNames(tablename);
        Map<String, String> name_newSubtables = new HashMap<>();
        for (String subtable : subtables) {
            String newName = getTablename_mit_joins(subtable);
            name_newSubtables.put(subtable, newName);
        }
        return generateFullText(tablename, name_newSubtables);
    }

    private String generateFullText(String tablename, Map<String, String> name_inhaltSubtables){
        if(name_inhaltSubtables.isEmpty())return tablename;
        String alias;
        alias = "_A_" + ++aliasCounter;
        alias_tablename.put(alias, tablename);
        String tablename_mit_Joins = "(" + tablename + " as " + alias;
        for (Map.Entry<String, String> subtable : name_inhaltSubtables.entrySet()) {
            String IDName = "__" + tablename + "ID";
            tablename_mit_Joins += generateJoins(subtable.getValue(),subtable.getKey(), alias, IDName);
        }
        return tablename_mit_Joins + ")";
    }

    private String generateJoins(String subtableinhalt, String subtablename, String tablename_or_alias, String IDName){
        String result = " LEFT JOIN ";
        String[] helper = subtablename.split("_");
        String alias = subtablename;
        if(helper.length > 0)alias = helper[helper.length-1];
        if(oberTabAlias_untertabAlias.containsKey(tablename_or_alias)){
            List<String> untertabAlias = oberTabAlias_untertabAlias.get(tablename_or_alias);
            untertabAlias.add(alias);
            oberTabAlias_untertabAlias.put(tablename_or_alias, untertabAlias);
        }else {
            List<String> untertabAlias = new ArrayList<>();
            untertabAlias.add(alias);
            oberTabAlias_untertabAlias.put(tablename_or_alias, untertabAlias);
        }
        return result + subtableinhalt + " " + alias + " ON " + tablename_or_alias + "." + IDName + " = " + alias + "." + IDName;
    }

    private String updateAllTable(RuleContext result_column){
        String tablename = "";
        String newAllTable = result_column.getText();
        String aliasname = result_column.getChild(0).getText();
        if(alias_tablename.containsKey(aliasname)){
            tablename = alias_tablename.get(aliasname);
        }else {
            List<String> allSubtables = new ArrayList<>();
            for (String haupttable : haupttables) {
                allSubtables.addAll(getNF2TableNamesRec(haupttable));
            }
            tablename = getTablename(result_column, allSubtables, true);
        }
        List<String> subtables = getNF2TableNamesRec(tablename);
        for (String subtable : subtables) {
            String[] alias = subtable.split("_");
            String aliasName = alias[alias.length-1];
            newAllTable += ", " + aliasName + ".*";
        }
        return newAllTable;
    }

    private String updateWhereExpr(RuleContext stmt, String sql){
        Map<String, List<RuleContext>> context = SQL_Parser.getChildMap(stmt);
        if(context.containsKey("ordering_term")){
            List<RuleContext> ordering_terms = context.get("ordering_term");
            for (RuleContext ordering_term : ordering_terms) {
                RuleContext expr = (RuleContext) ordering_term.getChild(0);
                String newExp = Where.changeExpr(expr, alias_tablename, haupttables);
                sql = replaceRuleContext(expr, newExp);
            }
        }
        Boolean nochnichthinzugefuegt = true;
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
                        newExp = updateAllTable(expr);
                    } else if(SQLiteParser.ruleNames[expr.getRuleIndex()].equals("aggregate")){

                    }else{
                        newExp = Where.changeExpr(expr, alias_tablename, haupttables);
                        if (nochnichthinzugefuegt && zurAusgabe) {
                            newExp += addIDSToQuery();
                            nochnichthinzugefuegt = false;
                        }
                    }
                        sql = replaceRuleContext(expr, newExp);
                }
            }
        }
        if(select_or_values.containsKey("where_expr")){
            List<RuleContext> where_exprs = select_or_values.get("where_expr");
            for (RuleContext where_expr : where_exprs) {
                Where where = new Where(sql, where_expr.parent, alias_tablename, position_sql, haupttables);
                sql = where.sql;
            }
        }
        return sql;
    }

}
