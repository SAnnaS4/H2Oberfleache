package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.controller.BaseController;
import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import org.antlr.v4.runtime.RuleContext;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grouping extends Statement{
    public static Map<String, List<String>> columnname_tables = new HashMap<>();
    public Map<String, String> alias_tablename;
    public List<String> maintables;
    String sql;
    public Grouping(Map<Integer, String> position_sql, Map<String, String> alias_tablename, List<String> maintables, String sql){
        this.position_sql = position_sql;
        this.alias_tablename = alias_tablename;
        this.maintables = maintables;
        this.sql = sql;
    }
    static private Integer i = 0;
    //group by having
    //eingabe position sql, rulecontext group by, alias_tablename

    //text siehe arbeit
    //einsetzten in select durch ersetzen der expr, in from durch table_or_subquery + neues select, in where durch oberste expr + and + join ausdruck

    /*
    SELECT Distinct MITARBEITER.MANR , c.count as alias
    FROM (ABTEILUNG as _A_2 LEFT JOIN (__ABTEILUNG_MITARBEITER as _A_1 LEFT JOIN ____ABTEILUNG_MITARBEITER_PROJEKT PROJEKT
        ON _A_1.____ABTEILUNG_MITARBEITERID = PROJEKT.____ABTEILUNG_MITARBEITERID) MITARBEITER
        ON _A_2.__ABTEILUNGID = MITARBEI-TER.__ABTEILUNGID LEFT JOIN __ABTEILUNG_AUSSTATTUNG AUSSTATTUNG
        ON _A_2.__ABTEILUNGID = AUSSTATTUNG.__ABTEILUNGID) A,

        (SELECT b.__AbteilungID as id, Count(c.____ABTEILUNG_AusstattungID) As count
            FROM ABTEILUNG b, __ABTEILUNG_AUSSTATTUNG c
            WHERE b.__AbteilungID = c.__AbteilungID
            GROUP BY b.__AbteilungID) AS C

    WHERE c.id = a.__AbteilungID
     */
    public String aggregateInSelect(RuleContext expr, Map<String, List<RuleContext>> select_or_values){
        Map<String, List<RuleContext>> map = SQL_Parser.getChildMap(expr);
        String functionName = map.get("aggregate").get(0).getText();
        String expression = "";
        String newAlias = "_" + functionName + "_" + i;
        String aliasMainSelect = "";
        String select = newAlias + "." + functionName;
        i++;
        if(map.containsKey("alias"))select += " as " + map.get("alias");
        String from = "(SELECT ";
        RuleContext expr1= map.get("expr").get(0);
        String distinct = " ";
        if(expr.getText().contains("DISTINCT"))distinct = "DISTINCT ";
        Map<String, List<RuleContext>> childs = SQL_Parser.getChildMap(expr1);
        String tablename = "";
        if(!childs.containsKey("table_name") && !childs.containsKey("function_name") && !alias_tablename.containsKey(expr.getText())){
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
        String obertab = getObertabelle(tablename);
        for (Map.Entry<String, String> entry : alias_tablename.entrySet()) {
            if(entry.getValue().equals(obertab))aliasMainSelect = entry.getKey();
        }
        String obertabkey = "__" + obertab + "ID";
        String tabkey = "__" + tablename + "ID";
        String column;
        if(!expr1.getText().contains("*")){
            List<RuleContext> columns = childs.get("column_name");
            column = columns.get(columns.size()-1).getText();
        }
        else column = tabkey;
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
        return expression;
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
    /*
    (SELECT b.__AbteilungID as id, Count(c.____ABTEILUNG_AusstattungID) As count
            FROM ABTEILUNG b, __ABTEILUNG_AUSSTATTUNG c
            WHERE b.__AbteilungID = c.__AbteilungID
            GROUP BY b.__AbteilungID) AS C
     */

    private static String getObertabelle(String tablename) {
        String obertab = "";
        String selection = "SELECT OBERTABELLE FROM " + nf2TabName + " WHERE NAME = '" + tablename + "'";
        try {
            java.sql.Statement st = BaseController.connection.getCon().createStatement();
            ResultSet rs = st.executeQuery(selection);
            while (rs.next()) {
                obertab = rs.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obertab;
    }
}
