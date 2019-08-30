package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.controller.BaseController;
import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import org.antlr.v4.runtime.RuleContext;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class Grouping extends Statement{
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
    public static String aggregatInSelect(RuleContext expr, Map<String, String> alias_tablename, List<String> maintables){
        String expression = "";
        String select = "_count_" + i + "." + "count";
        String from = "SELECT ";
        String where = "";
        Map<String, List<RuleContext>> map = SQL_Parser.getChildMap(expr);
        String functionName = map.get("aggregate").get(0).getText();
        RuleContext expr1= map.get("expr").get(0);
        Map<String, List<RuleContext>> childs = SQL_Parser.getChildMap(expr1);
        String tablename = "";
        if(!childs.containsKey("table_name") && !childs.containsKey("function_name") && !alias_tablename.containsKey(expr.getText())){
            for (Map.Entry<String, String> entry : alias_tablename.entrySet()) {
                if(maintables.contains(entry.getValue())) {
                    List<String> attributes = Where.getAllAttributes(entry.getValue());
                    for (String attribute : attributes) {
                        if (attribute.equals(expr.getText())) tablename = entry.getValue();
                    }
                }
            }
        }else {
            tablename = alias_tablename.get(alias_tablename.get("table_name"));
        }
        String obertab = getObertabelle(tablename);

        return expression;
    }

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
