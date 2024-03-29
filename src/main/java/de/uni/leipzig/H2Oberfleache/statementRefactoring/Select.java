package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.parser.ParserHelper;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteLexer;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteParser;
import de.uni.leipzig.H2Oberfleache.presentation.UserDetails;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Select extends Statement{
    private UnNest unNest = new UnNest(new HashMap<>(), new HashMap<>(), userDetails);
    private static Integer aliasCounter = 0;
    private Map<String, String> alias_tablename = new HashMap<>();
    private Map<String, List<String>> parentTabAlias_childTabAliases = new HashMap<>();
    private List<String> maintables = new ArrayList<>();
    String sql;
    private Boolean zurAusgabe;
    private Map<String, List<RuleContext>> select_or_values = new HashMap<>();

    public Select(String sql, Boolean zurAusgabe, UserDetails userDetails){
        super(userDetails);
        this.sql = sql;
        this.zurAusgabe = zurAusgabe;
        makePosition_sql(sql);
    }

    public Select(Map<Integer, String> position_sql, String sql, Boolean zurAusgabe, UserDetails userDetails){
        super(userDetails);
        this.sql = sql;
        this.zurAusgabe = zurAusgabe;
        this.position_sql = position_sql;
    }

    public String nf2To1Nf(Map<String, String> alias_tablename) {
        this.alias_tablename = alias_tablename;
        SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(sql));
        SQLiteParser parser = new SQLiteParser(new CommonTokenStream(lexer));
        RuleContext select_stmt = parser.select_stmt();
        sql = changeSQL(select_stmt);
        System.out.println(sql);
        return sql;
    }

    public String nf2To1Nf(RuleContext context, Map<String, String> alias_tablename){
        this.alias_tablename = alias_tablename;
        return changeSQL(context);
    }

    public String nf2To1Nf() {
        SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(sql));
        SQLiteParser parser = new SQLiteParser(new CommonTokenStream(lexer));
        RuleContext select_stmt = parser.select_stmt();
        sql = changeSQL(select_stmt);
        System.out.println(sql);
        return sql;
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

    public String getSubQuery(RuleContext context, String aliasMainSelect, String obertab){
        String obertabkey = "__" + obertab + "ID";
        String[] parts = cutFromSQL(context, sql).split(" ")[0].split("\\.");
        String tablename = Where.getLastAlias(parts, alias_tablename, parentTabAlias_childTabAliases);
        return "(SELECT _UT.* FROM " + alias_tablename.get(tablename) + " _UT WHERE " + aliasMainSelect + "." + obertabkey + " = _UT." + obertabkey + ")";
    }

    private String changeSQL(RuleContext select_stmt){
        List<RuleContext> tables_or_subqueries = getTables_orSubquerys(select_stmt);
        for (RuleContext tables_or_subquery : tables_or_subqueries) {
            Map<String, List<RuleContext>> children = ParserHelper.getChildMap(tables_or_subquery);
            if(children.containsKey("select_stmt")){
                Select select = new Select(cutFromSQL(tables_or_subquery, sql), zurAusgabe, userDetails);
                replaceRuleContext(tables_or_subquery, "(" + select.nf2To1Nf(alias_tablename) + ")");
            }else {
                if(children.containsKey("table_name")){
                    List<String> subtables;
                    if(alias_tablename.containsKey(children.get("table_name").get(0).getText())){
                        subtables = getNF2TableNamesRec(alias_tablename.get(children.get("table_name").get(0).getText()), userDetails);
                    }else subtables = getNF2TableNamesRec(children.get("table_name").get(0).getText(), userDetails);
                    if(!subtables.isEmpty()) {
                        String tablename = children.get("table_name").get(0).getText();
                        if(alias_tablename.containsKey(tablename)){
                            sql = replaceRuleContext(tables_or_subquery, getSubQuery(tables_or_subquery, tablename, alias_tablename.get(tablename)));
                            continue;
                        }
                        if(tables_or_subquery.getText().contains(".")) tablename = getTablename(tables_or_subquery, subtables, false);
                        String alias = "";
                        if(children.containsKey("table_alias")){
                            alias = children.get("table_alias").get(0).getText();
                            if(Joins.operations.contains(alias)) alias = "";
                        }if(alias.equals(""))alias = tablename;
                        sql = updateFrom(tablename, tables_or_subquery, alias);
                    }
                }
            }
        }
        List<RuleContext> joinConstaints = ParserHelper.getParsedMap(select_stmt).getOrDefault("join_constraint", new ArrayList<>());
        if(!joinConstaints.isEmpty()) {
            Joins joins = new Joins(userDetails);
            sql = joins.JoinConstraint(sql, joinConstaints, alias_tablename, position_sql, maintables, parentTabAlias_childTabAliases);
        }
        sql = updateResultColumnAndWhere(select_stmt, sql);
        if(unNest.nested){
            sql = unNest.updateOrder(sql);
        }
        return sql;
    }

    private String updateFrom(String tablename, RuleContext table, String alias){
        maintables.add(tablename);
        if(!alias.equals("")){
            alias_tablename.entrySet().removeIf(entry -> entry.getKey().equals(tablename));
            if(!alias_tablename.containsValue(tablename)) alias_tablename.put(alias, tablename);
        }
        sql = insertJoins(tablename, table, alias);
        return sql;
    }

    private List<RuleContext> getTables_orSubquerys(RuleContext select_stmt){
        List<RuleContext> tables_or_subtables = new ArrayList<>();
        Map<String, List<RuleContext>> children = ParserHelper.getChildMap(select_stmt);
        if(children.containsKey("select_stmt"))children = ParserHelper.getChildMap(children.get("select_stmt").get(0));
        if(children.containsKey("select_or_values")){
            select_or_values = ParserHelper.getChildMap(children.get("select_or_values").get(0));
            if(select_or_values.containsKey("table_or_subquery"))tables_or_subtables = select_or_values.get("table_or_subquery");
            if(select_or_values.containsKey("join_clause"))tables_or_subtables = Joins.getTableOrSubQuerys(select_or_values.get("join_clause"));
        }
        return tables_or_subtables;
    }

    private String insertJoins(String tablename, RuleContext table, String alias){
        String tablenameJoins = getTablenameJoins(tablename, alias);
        if(!alias.equals(""))tablenameJoins += " " + alias;
        return replaceRuleContext(table, tablenameJoins);
    }

    private String getTablenameJoins(String tablename, String alias){
        List<String> subtables = getNF2TableNames(tablename, userDetails);
        Map<String, String> name_newSubtables = new HashMap<>();
        for (String subtable : subtables) {
            String[] parts = subtable.split("_");
            String newName = getTablenameJoins(subtable, parts[parts.length-1]);
            name_newSubtables.put(subtable, newName);
        }
        return generateFullText(tablename, name_newSubtables, alias);
    }

    private String generateFullText(String tablename, Map<String, String> name_contentSubtables, String oberAlias){
        if(name_contentSubtables.isEmpty())return tablename;
        String alias;
        alias = "_A_" + ++aliasCounter;
        StringBuilder tablenameJoins = new StringBuilder("(" + tablename + " as " + alias);
        for (Map.Entry<String, String> subtable : name_contentSubtables.entrySet()) {
            String IDName = "__" + tablename + "ID";
            tablenameJoins.append(generateJoins(subtable.getValue(), subtable.getKey(), alias, IDName, oberAlias));
        }
        return tablenameJoins + ")";
    }

    private String generateJoins(String subtablecontent, String subtablename, String tablename_or_alias, String IDName, String oberAlias){
        String result = " LEFT JOIN ";
        oberAlias = oberAlias.equals("")?tablename_or_alias:oberAlias;
        String[] helper = subtablename.split("_");
        String alias = subtablename;
        if(helper.length > 0)alias = helper[helper.length-1];
        if (alias_tablename.containsKey(alias)){
            String nextAlias;
            int i = 1;
            do{
                nextAlias = alias + i;
                i++;
            }while (alias_tablename.containsKey(nextAlias));
            alias = nextAlias;
        }
        if(parentTabAlias_childTabAliases.containsKey(oberAlias)){
            List<String> childtabAlias = parentTabAlias_childTabAliases.get(oberAlias);
            childtabAlias.add(alias);
            parentTabAlias_childTabAliases.put(oberAlias, childtabAlias);
        }else {
            List<String> childtabAlias = new ArrayList<>();
            childtabAlias.add(alias);
            parentTabAlias_childTabAliases.put(oberAlias, childtabAlias);
        }
        if(!alias_tablename.containsValue(subtablename)) alias_tablename.put(alias, subtablename);
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
                allSubtables.addAll(getNF2TableNamesRec(haupttable, userDetails));
            }
            tablename = getTablename(result_column, allSubtables, true);
        }
        List<String> subtables = getNF2TableNamesRec(tablename, userDetails);
        for (String subtable : subtables) {
            String[] alias = subtable.split("_");
            String aliasName = alias[alias.length-1];
            newExpression.append(", ").append(aliasName).append(".*");
        }
        return newExpression.toString();
    }

    private String updateResultColumnAndWhere(RuleContext stmt, String sql){
        Map<String, List<RuleContext>> context = ParserHelper.getChildMap(stmt);
        if(context.containsKey("ordering_term")){
            List<RuleContext> ordering_terms = context.get("ordering_term");
            for (RuleContext ordering_term : ordering_terms) {
                RuleContext expr = (RuleContext) ordering_term.getChild(0);
                String newExp = Where.changeExpr(expr, alias_tablename, maintables, position_sql, sql, parentTabAlias_childTabAliases, userDetails);
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
                    Map<String, List<RuleContext>> childs = ParserHelper.getChildMap(expr);
                    if(SQLiteParser.ruleNames[expr.getRuleIndex()].equals("un_nest_stmt")){
                        this.unNest = new UnNest(alias_tablename, parentTabAlias_childTabAliases, userDetails);
                        newExp =unNest.setNestUnnestAttributes(result_column, expr, childs, "");
                        if (notAdded && zurAusgabe) {
                            newExp += addIDSToQuery();
                            notAdded = false;
                        }
                        sql = replaceRuleContext(result_column, newExp);
                        updated = true;
                    }else if(childs.containsKey("aggregate")){
                        Aggregate aggregate = new Aggregate(position_sql, alias_tablename, maintables, sql, userDetails);
                        aggregate.aggregateInSelect(expr, select_or_values);
                        sql = aggregate.sql;
                        updated = true;
                    }else if (result_column.getText().contains("*")) {
                        newExp = addAllSubtables(expr);

                    }else{
                        newExp = Where.changeExpr(expr, alias_tablename, maintables, position_sql, sql, parentTabAlias_childTabAliases, userDetails);
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
                Where where = new Where(sql, where_expr.parent, alias_tablename, position_sql, maintables, parentTabAlias_childTabAliases, userDetails);
                sql = where.sql;
            }
        }
        return sql;
    }
}
