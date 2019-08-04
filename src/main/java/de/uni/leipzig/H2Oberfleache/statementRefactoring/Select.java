package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import org.antlr.v4.runtime.RuleContext;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class Select extends Statement{
    static Integer aliasCounter = 0;

    public static String nf2ToNf1(String sql) throws SQLException {
        sql = prepareSQL(sql);
        Map<String, List<RuleContext>> map = SQL_Parser.getParsedMap(sql);
        List<RuleContext> tablenames = map.get("table_name");
        for (RuleContext tablename : tablenames) {
            List<String> subtables = getNF2TableNames(tablename.getText());
            if (!subtables.isEmpty()) {
                sql = insertJoins(subtables,tablename, sql);
            }
        }
        return sql;
    }

    private static String insertJoins(List<String> subtables, RuleContext tablename, String sql){
        String alias = "_A_" + ++aliasCounter;
        String tablename_mit_Joins = tablename.getText() + " as " + alias;
        for (String subtable : subtables) {
            String IDName = "__" + tablename.getText() + "ID";
            tablename_mit_Joins += generateJoins(subtable, alias, IDName);
        }
        RuleContext parent = tablename.parent.parent;
        String before = " ";
        String after = "";
        String fullName = "";
        Integer position1 = 0;
        Integer position2 = 0;
        for(int i =  0; i<parent.getChildCount(); i++){
            for(int j =  0; j<parent.getChild(i).getChildCount(); j++) {
                if (parent.getChild(i).getChild(j).equals(tablename)) {
                    position1 = i;
                    position2 = j;
                    if (i > 0) before = parent.getChild(i - 1).getText();
                    if (i < parent.getChildCount() - 1) after = parent.getChild(i + 1).getText();
                    break;
                }
            }
        }
        if(parent.getChild(position1).getChildCount() >= 1) {
            String before1 = "";
            Boolean danach = false;
            String after1 = "";
            for (int i = 0; i < parent.getChild(position1).getChildCount(); i++) {
                String between = " ";
                if(before1.equals(")") || before1.equals("(") ||
                        before1.equals("") || before1.endsWith(" ") || before1.equals(",")) between = "";
                before1 = parent.getChild(position1).getChild(i).getText();
                if(danach) after1 += between + before1;
                if(i == position2){
                    tablename_mit_Joins = fullName + between + "(" + tablename_mit_Joins + ")";
                    danach = true;
                }
                fullName += between + before1;
            }
            tablename_mit_Joins += after1;
        }
        String between1 = " ";
        if(before.equals(")") || before.equals("(") || before.equals(".") ||
                before.equals("") || before.endsWith(" ") || before.equals(",")) between1 = "";
        String between2 = " ";
        if(after.equals(".") || after.equals(")") || after.equals("(") ||
                after.equals("") || after.startsWith(" ") || after.equals(",")) between2 = "";
        String newSql = sql.replace(before + between1 + fullName + between2 + after,
                before + between1 + tablename_mit_Joins + between2 + after);
        return newSql;
    }

    private static String generateJoins(String subtablename, String tablename_or_alias, String IDName){
        String result = " LEFT JOIN ";
        String[] helper = subtablename.split("_");
        String alias = subtablename;
        if(helper.length > 0)alias = helper[helper.length-1];
        return result + subtablename + " " + alias + " ON " + tablename_or_alias + "." + IDName + " = " + alias + "." + IDName;
    }

    //nimm nur die Kinder füge die zusammen und setze an den stellen wo noch kein alias ist ein alias ein, gibt es ein select statement --> rekursion
    public static String updateWhereExpr(RuleContext where_expr){
        String newWhere = "";
        return newWhere;
    }
}
