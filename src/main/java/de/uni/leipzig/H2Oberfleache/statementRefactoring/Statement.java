package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.controller.BaseController;
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
    Map<Integer, String> position_sql = new HashMap<>();

    private String deleteBlank(String sql){
        StringBuilder newSql = new StringBuilder();
        String[] parts = sql.split("\\(");
        int clipNumber = parts.length -1;
        int i = 0;
        for (String part : parts) {
            part = part.trim();
            newSql.append(part);
            if(i<clipNumber){
                newSql.append("(");
                i++;
            }
        }
        return newSql.toString();
    }

    protected String prepareSQL(String sql){
        sql = sql.toUpperCase();
        sql = deleteBlank(sql);
        return sql.trim();
    }

    protected String replaceRuleContext(RuleContext context, String replacement){
        ParserRuleContext parserRuleContext = (ParserRuleContext) context;
        Integer start = parserRuleContext.start.getStartIndex();
        Integer stop = parserRuleContext.stop.getStopIndex();
        StringBuilder newSQL = new StringBuilder();
        for (Map.Entry<Integer, String> entry : position_sql.entrySet()) {
            if(entry.getKey()>=start && entry.getKey()<=stop){
                if(entry.getKey().equals(start)){
                    newSQL.append(replacement);
                    position_sql.put(entry.getKey(), replacement);
                }else {
                    position_sql.put(entry.getKey(), "");
                }
            }else newSQL.append(entry.getValue());
        }
        return newSQL.toString();
    }

    protected String getTablename(RuleContext nameInQuery, List<String> subtables, Boolean mitColumnname){
        StringBuilder name = new StringBuilder();
        String tablename = "";
        String[] words = nameInQuery.getText().split("\\.");
        int lengthTablename = words.length;
        if(mitColumnname)--lengthTablename;
        if(words.length > 1) {
            for (int i = 0; i < lengthTablename; i++) {
                name.append("_").append(words[i]);
            }
        }else name.append("_").append(nameInQuery.getText());
        for (String subtable : subtables) {
            if(subtable.contains(name.toString()) && !subtable.contains(name + "_")){
                tablename = subtable;

            }
        }
        return tablename;
    }

    public static List<String> getNF2TableNames(String tablename){
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

    public static List<String> getNF2TableNamesRec(String tablename){
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
        return st.executeQuery(selection);
    }

    protected Integer getNextSubID(String tablename) {
        String selection = "SELECT MAX(" + "__" + tablename + "ID) FROM " + tablename;
        int maxID = -1;
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

    public String cutFromSQL(RuleContext toCut, String sql){
        ParserRuleContext parserRuleContext = (ParserRuleContext) toCut;
        int start = parserRuleContext.start.getStartIndex();
        int stop = parserRuleContext.stop.getStopIndex();
        StringBuilder newSQL = new StringBuilder();
        for(int i = start; i<=stop; i++){
            newSQL.append(position_sql.get(i));
        }
        return newSQL.toString();
    }

    public static String getObertabelle(String tablename) {
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

    public void makePosition_sql(String sql){
        for(int i = 0; i < sql.length(); i++){
            String c = "" + sql.charAt(i);
            position_sql.put(i, c);
        }
    }

    public static String changeToNF1(String sql) throws SQLException {
        String newSQL = sql;
        switch (SQL_Parser.getQueryType(sql)) {
            case "CREATE":
                Create create = new Create(sql);
                newSQL = create.nf2To1Nf();
                break;
            case "DROP":
                Drop drop = new Drop(sql);
                newSQL = drop.nf2To1Nf();
                break;
            case "INSERT":
                Insert insert = new Insert();
                newSQL = insert.nf2To1Nf(newSQL);
                break;
            case "SELECT":
                Select select = new Select(sql, true);
                newSQL = select.nf2To1Nf();
                break;
            case "UPDATE":
                Update.hauptSQL = sql;
                Update update = new Update(sql);
                newSQL = update.nf2To1Nf();
                break;
            case "DELETE":
                Delete delete = new Delete(sql);
                newSQL = delete.nf2To1Nf();
                break;
        }
        return newSQL;
    }
}
