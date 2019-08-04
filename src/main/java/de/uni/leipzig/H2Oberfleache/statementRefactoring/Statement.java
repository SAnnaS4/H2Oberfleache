package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.controller.BaseController;
import de.uni.leipzig.H2Oberfleache.jdbc.DbInfo;
import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import org.antlr.v4.runtime.RuleContext;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Statement {
    public static final String nf2TabName = "NF2_UNTERTABELLEN";

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

    protected static List<String> getNF2TableNames(String tablename) throws SQLException {
        List<String> tablenames = new ArrayList<>();
        ResultSet rs = getNextTableNames(tablename);
        while (rs.next()){
            tablename = rs.getString(1);
            tablenames.add(tablename);
            ResultSet rs1 = getNextTableNames(tablename);
            if(rs1.next()) {
                tablenames.addAll(getNF2TableNames(tablename));
            }
        }
        return tablenames;
    }

    private static ResultSet getNextTableNames(String tablename) throws SQLException {
        String selection = "SELECT NAME FROM " + nf2TabName + " WHERE OBERTABELLE = '" + tablename + "'";
        java.sql.Statement st = BaseController.connection.getCon().createStatement();
        ResultSet rs = st.executeQuery(selection);
        return rs;
    }

    protected static Map<String, Integer> getNextSubIDs(List<String> tablenames) throws SQLException {
        Map<String, Integer> name_id = new HashMap<>();
        for (String table : tablenames) {
            String selection = "SELECT MAX(" + table + "ID) FROM " + table;
            java.sql.Statement st = BaseController.connection.getCon().createStatement();
            ResultSet rs = st.executeQuery(selection);
            Integer maxID = -1;
            if(rs.next()) {
                maxID = rs.getInt(1);
            }
            name_id.put(table, maxID+1);
        }
        return name_id;
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
        return newSQL;
    }



}
