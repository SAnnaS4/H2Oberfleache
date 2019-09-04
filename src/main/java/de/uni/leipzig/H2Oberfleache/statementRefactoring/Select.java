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
    private boolean order = false;
    private List<String> orderAttributes = new ArrayList<>();
    private static Integer aliasCounter = 0;
    private Map<String, String> alias_tablename = new HashMap<>();
    private Map<String, List<String>> parentTabAlias_childTabAliases = new HashMap<>();
    private List<String> maintables = new ArrayList<>();
    String sql;
    private List<String> schluessel = new ArrayList<>();
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

    private String addIDSToQuery(){
        StringBuilder idsToQuery = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : parentTabAlias_childTabAliases.entrySet()) {
            String id = "__" + alias_tablename.get(entry.getKey()) + "ID";
            schluessel.add(id);
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
                    schluessel.add(subid);
                    idsToQuery.append(", ").append(childtabAlias).append(".").append(subid);
                }
            }
        }
        return idsToQuery.toString();
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
                            StringBuilder neu = new StringBuilder(names[1]);
                            for (int i = 2; i<names.length; i++) {
                                neu.append(".").append(names[i]);
                            }
                            replaceRuleContext(tables_or_subquery, neu.toString());
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
        if(order){
            sql = updateOrder(select_stmt, sql);
        }
        return sql;
    }
    private String updateOrder(RuleContext sql_stmt, String sql){
        StringBuilder newOrderingTerms = new StringBuilder();
        boolean komma = false;
        for (String orderAttribute : orderAttributes) {
            if(komma) newOrderingTerms.append(", ");
            komma = true;
            newOrderingTerms.append(orderAttribute);
        }
        List<RuleContext> orderingTerm = SQL_Parser.getChildMap(sql_stmt).getOrDefault("ordering_term", new ArrayList<>());
        if(orderingTerm.isEmpty()){
            sql += " ORDER BY " + newOrderingTerms.toString();
        }else {
            String newOrder = newOrderingTerms + ", " + orderingTerm.get(0).getText();
            sql = replaceRuleContext(orderingTerm.get(0), newOrder);
        }
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
        StringBuilder tablenameJoins = new StringBuilder("(" + tablename + " as " + alias);
        for (Map.Entry<String, String> subtable : name_contentSubtables.entrySet()) {
            String IDName = "__" + tablename + "ID";
            tablenameJoins.append(generateJoins(subtable.getValue(), subtable.getKey(), alias, IDName));
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
        StringBuilder newExpression = new StringBuilder();
        String[] tables = result_column.getText().split("\\.");
        if(tables.length > 1) {
            newExpression = new StringBuilder(tables[tables.length - 2] + "." + tables[tables.length - 1]);
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
            newExpression.append(", ").append(aliasName).append(".*");
        }
        return newExpression.toString();
    }

    private String updateWhereExpr(RuleContext stmt, String sql){
        Map<String, List<RuleContext>> context = SQL_Parser.getChildMap(stmt);
        if(context.containsKey("ordering_term")){
            List<RuleContext> ordering_terms = context.get("ordering_term");
            for (RuleContext ordering_term : ordering_terms) {
                RuleContext expr = (RuleContext) ordering_term.getChild(0);
                String newExp = Where.changeExpr(expr, alias_tablename, maintables, position_sql, sql);
                sql = replaceRuleContext(expr, newExp);
            }
        }
        Boolean notAdded = true;
        if(select_or_values.containsKey("result_column")){
            List<RuleContext> result_columns = select_or_values.get("result_column");
            for (RuleContext result_column : result_columns) {
                if(!result_column.getText().equals("*")) {
                    boolean updated = false;
                    String newExp = "";
                    RuleContext expr = null;
                    ParseTree element = result_column.getChild(0);
                    if (element instanceof RuleContext) {
                        expr = (RuleContext) element;
                    }
                    assert expr != null;
                    Map<String, List<RuleContext>> childs = SQL_Parser.getChildMap(expr);
                    if(SQLiteParser.ruleNames[expr.getRuleIndex()].equals("un_nest_stmt")){
                        newExp =setNestUnnestAttributes(expr, childs, "");
                        if (notAdded && zurAusgabe) {
                            newExp += addIDSToQuery();
                            notAdded = false;
                        }
                    }else if(childs.containsKey("aggregate")){
                        Grouping grouping = new Grouping(position_sql, alias_tablename, maintables, sql);
                        grouping.aggregateInSelect(expr, select_or_values);
                        sql = grouping.sql;
                        updated = true;
                    }else if (result_column.getText().contains("*")) {
                        newExp = addAllSubtables(expr);

                    }else{
                        newExp = Where.changeExpr(expr, alias_tablename, maintables, position_sql, sql);
                        if (notAdded && zurAusgabe) {
                            newExp += addIDSToQuery();
                            notAdded = false;
                        }
                    }
                    if(!updated)sql = replaceRuleContext(expr, newExp);
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

    private String setNestUnnestAttributes(RuleContext un_nest_stmt, Map<String, List<RuleContext>> children, String start){
        String aliasStart;
        if(un_nest_stmt.getChild(0).getText().equals("NEST")){
            aliasStart = start + "n_";
            order = true;
        }else aliasStart = start + "un_";
        String tablealias = children.get("table_name").get(0).getText();
        String tablename = "";
        if(!alias_tablename.containsKey(tablealias)) {
            for (Map.Entry<String, String> entry : alias_tablename.entrySet()) {
                if (entry.getValue().equals(tablealias)){
                    tablealias = entry.getKey();
                    tablename = entry.getValue();
                }
            }
        }else tablename = alias_tablename.get(tablealias);
        String obertabSchluessel = tablealias + ". __" + tablename + "ID";
        orderAttributes.add(obertabSchluessel);
        List<RuleContext> column_name = children.getOrDefault("column_name", new ArrayList<>());
        List<RuleContext> nests = children.getOrDefault("un_nest_stmt", new ArrayList<>());
        StringBuilder result = new StringBuilder();
        for (RuleContext ruleContext : column_name) {
            String attribute = tablealias + "." + ruleContext.getText() + " AS " + aliasStart + ruleContext.getText();
            result.append(attribute).append(" , ");
            orderAttributes.add(attribute);
        }
        for (RuleContext ruleContext : nests) {
            result.append(setNestUnnestAttributes(ruleContext, SQL_Parser.getChildMap(ruleContext), aliasStart));
        }
        result = new StringBuilder(result.substring(0, result.length() - 2));
        return result.toString();
    }
}
