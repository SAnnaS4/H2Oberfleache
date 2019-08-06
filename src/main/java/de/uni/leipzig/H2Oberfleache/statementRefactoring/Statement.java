package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.controller.BaseController;
import de.uni.leipzig.H2Oberfleache.jdbc.DbInfo;
import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteParser;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Statement {
    public static final String nf2TabName = "NF2_UNTERTABELLEN";
    static Integer addedToSQL = 0;

    // Todo: noch test schreiben!!!
    private static String deleteBlank(String sql){
        String newSql = "";
        String[] parts = sql.split("\\(");
        int klammerzahl = parts.length -1;
        int i = 0;
        for (String part : parts) {
            part = part.trim();
            newSql += part;
            if(i<klammerzahl){
                newSql += "(";
                i++;
            }
        }
        return newSql;
    }

    protected static String prepareSQL(String sql){
        sql.toUpperCase();
        sql = deleteBlank(sql);
       // sql = sql.replace(")", ") ");
        return sql.trim();
    }

    protected static Integer findCloseBracket(String sql, Integer openPosition){
        Integer closePosition;
        int open = 0;
        int close = 0;
        int position = openPosition + 1;
        do{
            if(sql.charAt(position) == '(') open++;
            if(sql.charAt(position) == ')') close++;
            position++;
        }while (open >= close);
        closePosition = position;
        return closePosition;
    }

    protected static String replaceRuleContext(String sql, RuleContext context, String replacement){
        ParserRuleContext parserRuleContext = (ParserRuleContext) context;
        Integer start = parserRuleContext.start.getStartIndex() + addedToSQL;
        Integer stop = parserRuleContext.stop.getStopIndex() + addedToSQL;
        addedToSQL += replacement.length()-context.getText().length();
        String newSQL = "";
        for(int i = 0; i<sql.length(); i++){
            if(i>=start && i<=stop){
                if(i == start) newSQL += replacement;
            }else newSQL += sql.charAt(i);
        }
        return newSQL;
    }

    protected static String replaceRuleContext1(String sql, RuleContext context, String replacement){
        RuleContext parent = context.parent.parent;
        String before = " ";
        String after = "";
        String fullName = "";
        Integer position1 = 0;
        Integer position2 = 0;
        for(int i =  0; i<parent.getChildCount(); i++){
            for(int j =  0; j<parent.getChild(i).getChildCount(); j++) {
                if (parent.getChild(i).getChild(j).equals(context)) {
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
                    replacement = fullName + between + "(" + replacement + ")";
                    danach = true;
                }
                fullName += between + before1;
            }
            replacement += after1;
        }
        String between1 = " ";
        if(before.equals(")") || before.equals("(") || before.equals(".") ||
                before.equals("") || before.endsWith(" ") || before.equals(",")) between1 = "";
        String between2 = " ";
        if(after.equals(".") || after.equals(")") || after.equals("(") ||
                after.equals("") || after.startsWith(" ") || after.equals(",")) between2 = "";
        String newSql = sql.replace(before + between1 + fullName + between2 + after,
                before + between1 + replacement + between2 + after);
        return newSql;
    }

    protected static List<String> getNF2TableNames(String tablename){
        List<String> tablenames = new ArrayList<>();
        try {
            ResultSet rs = getNextTableNames(tablename);
            while (rs.next()){
                tablename = rs.getString(1);
                tablenames.add(tablename);
                ResultSet rs1 = getNextTableNames(tablename);
                if(rs1.next()) {
                    tablenames.addAll(getNF2TableNames(tablename));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tablenames;
    }

    private static ResultSet getNextTableNames(String tablename) throws SQLException {
        String selection = "SELECT NAME FROM " + nf2TabName + " WHERE OBERTABELLE = '" + tablename + "'";
        java.sql.Statement st = BaseController.connection.getCon().createStatement();
        ResultSet rs = st.executeQuery(selection);
        return rs;
    }

    protected static Integer getNextSubID(String tablename) {
        String selection = "SELECT MAX(" + "__" + tablename + "ID) FROM " + tablename;
        Integer maxID = -1;
        try {
            java.sql.Statement st = BaseController.connection.getCon().createStatement();
            ResultSet rs = st.executeQuery(selection);
            if(rs.next()) {
                maxID = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maxID+1;
    }

    protected static Map<String, List<String>> getColumnsPlaces(String tablename, List<RuleContext> werte, Map<String, Integer> nextID) throws SQLException, IllegalAccessException {
        DbInfo dbInfo = new DbInfo();
        Map<String, List<String>> table_cols = new HashMap<>();
        List<String> subTables = getNF2TableNames(tablename);
        Map<String, String> tableColumn = dbInfo.getColums(false, BaseController.dbName, tablename);
        List<String> values = new ArrayList<>();
        for (Map.Entry<String, String> column : tableColumn.entrySet()) {
            if(column.getKey().length()>= 3){
                String subtablename = "__" + tablename + "_" + column.getKey().substring(0, column.getKey().length()-2);
                if(subTables.contains(subtablename)){
                    values.add(String.valueOf(nextID.get(subtablename)));
                    table_cols.putAll(getColumnsPlaces(subtablename, werte, nextID));
                }else {
                    if(column.getKey().equals(tablename + "ID") && nextID.containsKey(tablename)){
                        values.add(String.valueOf(nextID.get(tablename)));
                    }else {
                        if (!werte.isEmpty()) {
                            values.add(werte.get(0).getText());
                            werte.remove(0);
                        }
                    }
                }}else {
                if(!werte.isEmpty()) {
                    values.add(werte.get(0).getText());
                    werte.remove(0);
                }
            }
        }
        table_cols.put(tablename, values);
        return table_cols;
    }

    public static String changeToNF1(String sql) throws SQLException {
        String newSQL = sql;
        if(SQL_Parser.getQueryType(sql).equals("CREATE")){
            newSQL = Create.nf2ToNf1(newSQL);
        }else if (SQL_Parser.getQueryType(sql).equals("DROP")){
            newSQL = Drop.nf2ToNf1(newSQL);
        }else if (SQL_Parser.getQueryType(sql).equals("INSERT")){
            newSQL = Insert.nf2ToNf1(newSQL);
        }else if (SQL_Parser.getQueryType(sql).equals("SELECT")){
            newSQL = Select.nf2ToNf1(newSQL);
        }
        addedToSQL = 0;
        return newSQL;
    }



}
