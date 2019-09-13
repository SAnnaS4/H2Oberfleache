package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.controller.BaseController;
import de.uni.leipzig.H2Oberfleache.jdbc.DbInfo;
import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteLexer;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteParser;
import de.uni.leipzig.H2Oberfleache.presentation.UserDetails;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnNest extends Statement{
    private List<String> nestedSubTables = new ArrayList<>();
    private Map<String, String> nestedTables_alias = new HashMap<>();
    private Map<String, List<String>> nestedTable_oberNestedTab = new HashMap<>();
    private Map<String, String> alias_tablename = new HashMap<>();
    private Map<String, List<String>> parentTabAlias_childTabAliases = new HashMap<>();
    String sql;
    Boolean nested;

    public UnNest(Map<String, String> alias_tablename, Map<String, List<String>> parentTabAlias_childTabAliases, UserDetails userDetails){
        super(userDetails);
        this.alias_tablename = alias_tablename;
        this.parentTabAlias_childTabAliases = parentTabAlias_childTabAliases;
        nested = false;
    }

    public String setNestUnnestAttributes(RuleContext result_column, RuleContext un_nest_stmt, Map<String, List<RuleContext>> children, String start){
        String aliasStart;
        String nestedTableAlias = "";
        for (Map.Entry<String, List<RuleContext>> entry : SQL_Parser.getChildMap(result_column).entrySet()) {
            if(entry.getKey().equals("column_alias"))nestedTableAlias = entry.getValue().get(0).getText();
        }
        String tablealias = children.get("table_name").get(0).getText();
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
                    String attr = Where.changeExpr(ruleContext, alias_tablename, maintab, position_sql, sql, parentTabAlias_childTabAliases, userDetails);
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
                        attributes = DbInfo.getColumnList(tablename, userDetails);
                    } catch (SQLException e) {
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

    public String updateOrder(String sql){
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

    private Map<String, List<String>> getAlias_Attributes(String alias){
        Map<String, List<String>> alias_Attributes = new HashMap<>();
        try {
            alias_Attributes.put(alias, DbInfo.getColumnList(alias_tablename.get(alias), userDetails));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alias_Attributes;
    }
}
