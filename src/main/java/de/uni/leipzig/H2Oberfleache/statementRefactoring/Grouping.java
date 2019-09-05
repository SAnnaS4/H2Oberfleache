package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import org.antlr.v4.runtime.RuleContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grouping extends Statement{
    public static Map<String, List<String>> columnname_tables = new HashMap<>();
    private Map<String, String> alias_tablename;
    private List<String> maintables;
    String sql;
    public Grouping(Map<Integer, String> position_sql, Map<String, String> alias_tablename, List<String> maintables, String sql){
        this.position_sql = position_sql;
        this.alias_tablename = alias_tablename;
        this.maintables = maintables;
        this.sql = sql;
    }
    static private Integer i = 0;
    /*
    AVG(Mitarbeiter.Projekt.Projnr) -->
    (SELECT AVG( _UT.PROJNR) AS AVG FROM ____ABTEILUNG_MITARBEITER_PROJEKT _UT
    WHERE Mitarbeiter.____ABTEILUNG_MITARBEITERID = _UT.____ABTEILUNG_MITARBEITERID)
     */
    private String distinct;
    private String column;
    private String tablename;
    private String obertabkey;
    private String aliasMainSelect;
    private String obertab;

    public String aggragateInWhere(RuleContext expr){
        Map<String, List<RuleContext>> map = SQL_Parser.getChildMap(expr);
        String functionName = map.get("aggregate").get(0).getText();
        String from = "(SELECT ";
        something(map, expr);
        from += functionName + "(" + distinct + "_UT." + column + ") FROM " +
                tablename + " _UT WHERE "+ aliasMainSelect +"." + obertabkey + " = _UT." + obertabkey;
        return from + ")";
    }

    private void something(Map<String, List<RuleContext>> map, RuleContext expr){
        RuleContext expr1= map.get("expr").get(0);
        distinct = " ";
        if(expr.getText().contains("DISTINCT"))distinct = "DISTINCT ";
        Map<String, List<RuleContext>> children = SQL_Parser.getChildMap(expr1);
        tablename = "";
        if(!children.containsKey("table_name") && !children.containsKey("function_name") && !alias_tablename.containsKey(expr.getText())){
            for (Map.Entry<String, String> entry : alias_tablename.entrySet()) {
                if(maintables.contains(entry.getValue())) {
                    List<String> attributes = Where.getAllAttributes(entry.getValue());
                    for (String attribute : attributes) {
                        if (attribute.equals(expr.getText())) {
                            tablename = entry.getValue();
                        }
                    }
                }
            }
        }else {
            String[] alias = expr1.getText().split("\\.");
            tablename = alias_tablename.get(alias[alias.length-2]);
        }
        obertab = getObertabelle(tablename);
        for (Map.Entry<String, String> entry : alias_tablename.entrySet()) {
            if(entry.getValue().equals(obertab))aliasMainSelect = entry.getKey();
        }
        obertabkey = "__" + obertab + "ID";
        String tabkey = "__" + tablename + "ID";
        if(!expr1.getText().contains("*")){
            List<RuleContext> columns = children.get("column_name");
            column = columns.get(columns.size()-1).getText();
        } else column = tabkey;
    }

    public void aggregateInSelect(RuleContext expr, Map<String, List<RuleContext>> select_or_values){
        Map<String, List<RuleContext>> map = SQL_Parser.getChildMap(expr);
        String functionName = map.get("aggregate").get(0).getText();
        String newAlias = "_" + functionName + "_" + i;
        String select = newAlias + "." + functionName;
        i++;
        if(map.containsKey("alias"))select += " as " + map.get("alias");
        String from = "(SELECT ";
        something(map, expr);
        from += "_OT." + obertabkey + " AS ID, " + functionName + "(" + distinct + "_UT." + column + ") AS " + functionName + " FROM " +
                obertab + " _OT, " + tablename + " _UT WHERE _OT." + obertabkey + " = _UT." + obertabkey +
                " GROUP BY _OT." + obertabkey + ") AS " + newAlias;
        String where = newAlias + ".ID = " + aliasMainSelect + "." + obertabkey;
        this.sql = replaceRuleContext(expr, select);
        changeSQL(select_or_values, from, where);
        if(columnname_tables.containsKey(functionName))columnname_tables.get(functionName).add(obertab);
        else {
            List<String> newList = new ArrayList<>();
            newList.add(obertab);
            columnname_tables.put(functionName, newList);
        }
    }

    private void changeSQL(Map<String, List<RuleContext>> select_or_values, String from, String where){
        List<RuleContext> fromCntx = select_or_values.get("table_or_subquery");
        RuleContext lastFrom = fromCntx.get(fromCntx.size()-1);
        String newFrom = cutFromSQL(lastFrom, sql) + ", " + from;
        if(select_or_values.containsKey("where_expr")){
            RuleContext whereExpr = select_or_values.get("where_expr").get(0);
            String newWhere = cutFromSQL(whereExpr, sql) + " AND " + where;
            this.sql = replaceRuleContext(whereExpr, newWhere);
        }else newFrom += " WHERE " + where + " ";
        this.sql = replaceRuleContext(lastFrom, newFrom);
    }


}
