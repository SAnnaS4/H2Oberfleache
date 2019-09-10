package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.controller.BaseController;
import de.uni.leipzig.H2Oberfleache.jdbc.DbInfo;
import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteLexer;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Select extends Statement{
    private boolean nested = false;
    private Map<String, String> nestedTables_alias = new HashMap<>();
    private Map<String, List<String>> nestedTable_oberNestedTab = new HashMap<>();
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
        makePosition_sql(sql);
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

    private String changeSQL(RuleContext select_stmt){
        List<RuleContext> tables_or_subqueries = getTables_orSubquerys(select_stmt);
        for (RuleContext tables_or_subquery : tables_or_subqueries) {
            Map<String, List<RuleContext>> children = SQL_Parser.getChildMap(tables_or_subquery);
            if(children.containsKey("select_stmt")){
                Select select = new Select(cutFromSQL(tables_or_subquery, sql), zurAusgabe);
                replaceRuleContext(tables_or_subquery, "(" + select.nf2ToNf1(alias_tablename) + ")");
            }else {
                if(children.containsKey("table_name")){
                    List<String> subtables;
                    if(alias_tablename.containsKey(children.get("table_name").get(0).getText())){
                        subtables = getNF2TableNamesRec(alias_tablename.get(children.get("table_name").get(0).getText()));
                    }else subtables = getNF2TableNamesRec(children.get("table_name").get(0).getText());
                    if(!subtables.isEmpty()) {
                        String tablename = children.get("table_name").get(0).getText();
                        if(alias_tablename.containsKey(tablename)){
                            String[] names = cutFromSQL(tables_or_subquery, sql).split("\\.");
                            StringBuilder neu = new StringBuilder(names[1]);
                            for (int i = 2; i<names.length; i++) {
                                neu.append(".").append(names[i]);
                            }
                            sql = replaceRuleContext(tables_or_subquery, neu.toString());
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
        List<RuleContext> joinConstaints = SQL_Parser.getParsedMap(select_stmt).getOrDefault("join_constraint", new ArrayList<>());
        if(!joinConstaints.isEmpty()) {
            Joins joins = new Joins();
            sql = joins.JoinConstraint(sql, joinConstaints, alias_tablename, position_sql, maintables, parentTabAlias_childTabAliases);
        }
        sql = updateWhereExpr(select_stmt, sql);
        if(nested){
            sql = updateOrder(sql);
        }
        return sql;
    }

    private Map<String, List<String>> getAlias_Attributes(String alias){
        Map<String, List<String>> alias_Attributes = new HashMap<>();
        try {
            alias_Attributes.put(alias, DbInfo.getColumnList(false, BaseController.dbName, alias_tablename.get(alias), BaseController.user, BaseController.password));
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("Exception at Select getAlias_Attributes");
        }
        return alias_Attributes;
    }

    private String updateOrder(String sql){
        SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(sql));
        SQLiteParser parser = new SQLiteParser(new CommonTokenStream(lexer));
        RuleContext context = parser.select_or_values();
        List<RuleContext> result_columns = SQL_Parser.getChildMap(context).get("result_column");
        makePosition_sql(sql);
        for (Map.Entry<String, String> nestedTable : nestedTables_alias.entrySet()) {
            List<String> nestedObertabs = nestedTable_oberNestedTab.get(nestedTable.getKey());
            RuleContext tochange = null;
            StringBuilder rank = new StringBuilder("RANK() OVER (ORDER BY ");
            boolean komma = false;
            String schluessel;
            StringBuilder newKey = new StringBuilder();
            for (String nestedObertab : nestedObertabs) {
                newKey.append(nestedObertab).append("_");
            }
            newKey = new StringBuilder(newKey.substring(0, newKey.length() - 1));
            if(alias_tablename.containsKey(nestedTable.getValue())) {
                schluessel = "_n___" + alias_tablename.get(nestedTable.getValue()) + "_" + newKey;
                List<String> notNeeded = new ArrayList<>();
                for (RuleContext column : result_columns) {
                    if (column.getText().contains("_n_" + nestedTable.getKey())) {
                        notNeeded.add(column.getChild(0).getText());
                        tochange = column;
                    }
                }
                Map<String, List<String>> alias_Attributes = getAlias_Attributes(nestedTable.getValue());
                for (Map.Entry<String, List<String>> entry : alias_Attributes.entrySet()) {
                    for (String attribute : entry.getValue()) {
                        if (!attribute.contains("__") && !attribute.contains("ID") && !notNeeded.contains(entry.getKey() + "." + attribute)) {
                            if (komma) rank.append(", ");
                            komma = true;
                            rank.append(entry.getKey()).append(".").append(attribute);
                        }
                    }
                }
            }else {
                schluessel = "_n_" + newKey;
                for (RuleContext column : result_columns) {
                    if (column.getText().contains("_n_" + nestedTable.getKey())) {
                        tochange = column;
                    } else if (!column.getText().contains("__") && !column.getText().contains("ID")) {
                        if (komma) rank.append(", ");
                        komma = true;
                        rank.append(cutFromSQL(column, sql));
                    }
                }
            }
            rank.append(") AS ").append(schluessel).append(", ").append(cutFromSQL(tochange, sql));
           sql = replaceRuleContext(tochange, rank.toString());
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
        Map<String, List<RuleContext>> children = SQL_Parser.getChildMap(select_stmt);
        if(children.containsKey("select_stmt"))children = SQL_Parser.getChildMap(children.get("select_stmt").get(0));
        if(children.containsKey("select_or_values")){
            select_or_values = SQL_Parser.getChildMap(children.get("select_or_values").get(0));
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
        List<String> subtables = getNF2TableNames(tablename);
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
                String newExp = Where.changeExpr(expr, alias_tablename, maintables, position_sql, sql, parentTabAlias_childTabAliases);
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
                        newExp =setNestUnnestAttributes(result_column, expr, childs, "");
                        nestedSubTables = new ArrayList<>();
                        if (notAdded && zurAusgabe) {
                            newExp += addIDSToQuery();
                            notAdded = false;
                        }
                        sql = replaceRuleContext(result_column, newExp);
                        updated = true;
                    }else if(childs.containsKey("aggregate")){

                       // dontAddID = true;
                        Grouping grouping = new Grouping(position_sql, alias_tablename, maintables, sql);
                        grouping.aggregateInSelect(expr, select_or_values);
                        sql = grouping.sql;
                        updated = true;
                    }else if (result_column.getText().contains("*")) {
                        newExp = addAllSubtables(expr);

                    }else{
                        newExp = Where.changeExpr(expr, alias_tablename, maintables, position_sql, sql, parentTabAlias_childTabAliases);
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
                Where where = new Where(sql, where_expr.parent, alias_tablename, position_sql, maintables, parentTabAlias_childTabAliases);
                sql = where.sql;
            }
        }
        return sql;
    }

    private List<String> nestedSubTables = new ArrayList<>();
    private String setNestUnnestAttributes(RuleContext result_column, RuleContext un_nest_stmt, Map<String, List<RuleContext>> children, String start){
        String aliasStart;
        String nestedTableAlias = "";
        for (Map.Entry<String, List<RuleContext>> entry : SQL_Parser.getChildMap(result_column).entrySet()) {
            if(entry.getKey().equals("column_alias"))nestedTableAlias = entry.getValue().get(0).getText();
        }
        String tablealias = children.get("table_name").get(0).getText();
        if(!alias_tablename.containsKey(tablealias)) {
            for (Map.Entry<String, String> entry : alias_tablename.entrySet()) {
                if (entry.getValue().equals(tablealias)){
                    tablealias = entry.getKey();
                }
            }
        }
        if(un_nest_stmt.getChild(0).getText().equals("NEST")){
            aliasStart = start + "_n_" + nestedTableAlias + "_";
            nestedTables_alias.put(nestedTableAlias, tablealias);
            nestedSubTables.add(nestedTableAlias);
            List<String> mySubNests = new ArrayList<>(nestedSubTables);
            nestedTable_oberNestedTab.put(nestedTableAlias, mySubNests);
            nested =true;
        }else aliasStart = start + "_un_";
        List<RuleContext> resultColumn = children.getOrDefault("result_column", new ArrayList<>());
        List<RuleContext> column_name = new ArrayList<>();
        List<RuleContext> nests = new ArrayList<>();
        for (RuleContext ruleContext : resultColumn) {
            Map<String, List<RuleContext>> child = SQL_Parser.getChildMap(ruleContext);
            column_name.addAll(child.getOrDefault("expr", new ArrayList<>()));
            nests.addAll(child.getOrDefault("un_nest_stmt", new ArrayList<>()));
        }
        StringBuilder result = new StringBuilder();
        for (RuleContext ruleContext : column_name) {
            String attribute;
            String text = ruleContext.getText();
            if(!text.contains(".")){
                attribute = tablealias + "." + ruleContext.getText() + " AS " + aliasStart + ruleContext.getText();
                result.append(attribute).append(" , ");
            }else{
                if(!text.contains("*")){
                    List<String> maintab = new ArrayList<>();
                    maintab.add(alias_tablename.get(tablealias));
                    String attr = Where.changeExpr(ruleContext, alias_tablename, maintab, position_sql, sql, parentTabAlias_childTabAliases);
                    attribute = attr + " AS " + aliasStart + attr.split("\\.")[attr.split("\\.").length-1];
                    result.append(attribute).append(" , ");
                }else {
                    String[] parts = text.split("\\.");
                    String[] part1 = new String[parts.length-1];
                    System.arraycopy(parts, 0, part1, 0, parts.length - 1);
                    String alias = Where.getLastAlias(part1, alias_tablename, parentTabAlias_childTabAliases);
                    String tablename = alias_tablename.get(alias);
                    List<String> attributes = new ArrayList<>();
                    try {
                        attributes = DbInfo.getColumnList(false,BaseController.dbName,tablename, BaseController.user, BaseController.password);
                    } catch (SQLException | IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    for (String attribut : attributes) {
                        String nextAttribute = alias + "." + attribut + " AS " + aliasStart + attribut;
                        result.append(nextAttribute).append(" , ");
                    }
                }
            }

        }
        for (RuleContext ruleContext : nests) {
            result.append(setNestUnnestAttributes(ruleContext.parent, ruleContext, SQL_Parser.getChildMap(ruleContext), aliasStart));
        }
        result = new StringBuilder(result.substring(0, result.length() - 2));
        return result.toString();
    }
}
