package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.controller.BaseController;
import de.uni.leipzig.H2Oberfleache.jdbc.DbInfo;
import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Statement {
    public static final String nf2TabName = "NF2_UNTERTABELLEN";
    static Integer addedToSQL = 0;
    static Map<Integer, String> position_sql = new HashMap<>();

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

    protected static String replaceRuleContext(RuleContext context, String replacement){
        ParserRuleContext parserRuleContext = (ParserRuleContext) context;
        Integer start = parserRuleContext.start.getStartIndex();
        Integer stop = parserRuleContext.stop.getStopIndex();
        String newSQL = "";
        for (Map.Entry<Integer, String> entry : position_sql.entrySet()) {
            if(entry.getKey()>=start && entry.getKey()<=stop){
                if(entry.getKey() == start){
                    newSQL += replacement;
                    position_sql.put(entry.getKey(), replacement);
                }else {
                    position_sql.put(entry.getKey(), "");
                }
            }else newSQL += entry.getValue();
        }
        return newSQL;
    }

    protected static String getTablename(RuleContext nameInQuery, List<String> subtables, Boolean mitColumnname){
        String name = "";
        String tablename = "";
        String[] words = nameInQuery.getText().split("\\.");
        Integer leangeTablename = words.length;
        if(mitColumnname)--leangeTablename;
        if(words.length > 0) {
            for (int i = 0; i < leangeTablename; i++) {
                name += "_" + words[i];
            }
        }else name += "_" + nameInQuery.getText();
        for (String subtable : subtables) {
            if(subtable.contains(name)){
                tablename = subtable;

            }
        }
        return tablename;
    }

    protected static List<String> getNF2TableNames(String tablename){
        List<String> tablenames = new ArrayList<>();
        try {
            ResultSet rs = getNextTableNames(tablename);
            while (rs.next()){
                tablename = rs.getString(1);
                tablenames.add(tablename);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tablenames;
    }

    protected static List<String> getNF2TableNamesRec(String tablename){
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

    public static void makeMap(String sql){
        for(int i = 0; i < sql.length(); i++){
            String c = "" + sql.charAt(i);
            position_sql.put(i, c);
        }
    }

    public static String changeToNF1(String sql) throws SQLException {
        String newSQL = sql;
        makeMap(sql);
        if(SQL_Parser.getQueryType(sql).equals("CREATE")){
            newSQL = Create.nf2ToNf1(newSQL);
        }else if (SQL_Parser.getQueryType(sql).equals("DROP")){
            newSQL = Drop.nf2ToNf1(newSQL);
        }else if (SQL_Parser.getQueryType(sql).equals("INSERT")){
            newSQL = Insert.nf2ToNf1(newSQL);
        }else if (SQL_Parser.getQueryType(sql).equals("SELECT")){
            newSQL = Select.nf2ToNf1(newSQL);
        }else if (SQL_Parser.getQueryType(sql).equals("UPDATE")){
            newSQL = Update.nf2ToNf1(newSQL);
        }else if (SQL_Parser.getQueryType(sql).equals("DELETE")){
            newSQL = Delete.nf2ToNf1(newSQL);
        }
        position_sql = new HashMap<>();
        return newSQL;
    }



}
