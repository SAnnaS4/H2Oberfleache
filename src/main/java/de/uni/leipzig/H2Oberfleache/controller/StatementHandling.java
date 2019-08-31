package de.uni.leipzig.H2Oberfleache.controller;

import de.uni.leipzig.H2Oberfleache.jdbc.DBConnection;
import de.uni.leipzig.H2Oberfleache.jdbc.DbInfo;
import de.uni.leipzig.H2Oberfleache.jdbc.ExecuteStatement;
import de.uni.leipzig.H2Oberfleache.presentation.HtmlBuilder;
import de.uni.leipzig.H2Oberfleache.statementRefactoring.Grouping;
import de.uni.leipzig.H2Oberfleache.statementRefactoring.Statement;
import de.uni.leipzig.H2Oberfleache.tables.Table;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.PrimeFaces;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Component
//@SessionScoped
public class StatementHandling extends BaseController implements Serializable {
    String sql;
    //String result;
    int update;
    ResultSet rs;
    public Table table = new Table(new ArrayList<>(), new ArrayList<>());
    String html = "";

    public void submit() throws SQLException {
        sql = sql.toUpperCase().trim();
        ExecuteStatement eS = null;
        if(autoCommit){
            for (String neu : changeSQLAutoCommitTrue(sql)) {
                eS = new ExecuteStatement(dbName, neu, false, user, password);
                eS.getDBcon().Commit();
            }
        }else {
            eS = new ExecuteStatement(dbName, changeSQLAutoCommitFalse(sql), false, user, password);
            eS.getDBcon().Commit();
        }
        try {
            if(isUpdate())update = eS.execUpdate();
            else {
                rs = eS.execQuery();
                this.table = readResultSet(rs);
                HtmlBuilder htmlBuilder = new HtmlBuilder(table);
                this.html = htmlBuilder.getHtml();
            }
        } catch (NullPointerException e) {
        }
        PrimeFaces.current().ajax().update("mainForm");
    }
    
    private List<String> changeSQLAutoCommitTrue(String sql) throws SQLException {
        List<String> newSQL = new ArrayList<>();
        String[] parts = sql.split(";");
        for (String part : parts) {
            newSQL.add(Statement.changeToNF1(part));
        }
        return newSQL;
    }

    private String changeSQLAutoCommitFalse(String sql) throws SQLException {
        StringBuilder newSQL = new StringBuilder();
        String[] parts = sql.split(";");
        boolean erstes = true;
        for (String part : parts) {
            if(!erstes) newSQL.append("; ");
            erstes = false;
            newSQL.append(Statement.changeToNF1(part));
        }
        return newSQL.toString();
    }

    private Boolean isUpdate(){
        return sql.startsWith("CREATE") || sql.startsWith("UPDATE") || sql.startsWith("DROP") || sql.startsWith("INSERT") || sql.startsWith("DELETE");
    }

    public void  closeCon(){
        DBConnection.getInstance(autoCommit, dbName, user, password).conClose();
        goToPage("login");
    }

    private Table readResultSet(ResultSet rs) throws SQLException {
        DbInfo dbInfo = new DbInfo();
        List<String> tables = dbInfo.getTables(false, dbName, user, password);
        List<List<Object>> content = new ArrayList<>();
        List<Map<String, String>> lables_tablename = new ArrayList<>();
        int j = rs.getMetaData().getColumnCount();
        for(int i= 1; i<=j; i++){
            String label = rs.getMetaData().getColumnLabel(i);
            String tablename = rs.getMetaData().getTableName(i);
            if(tablename.equals("") && label.startsWith("__") && label.endsWith("ID"))
                tablename = label.substring(2, label.length()-2);
            if(!tables.contains(tablename)){
                tablename = Grouping.columnname_tables.get(label).get(0);
                Grouping.columnname_tables.get(label).remove(0);
                if(Grouping.columnname_tables.get(label).size() == 1)Grouping.columnname_tables.remove(label);
            }
            Map<String, String> entry = new HashMap<>();
            entry.put(label, tablename);
            lables_tablename.add(entry);
        }
        while (rs.next()){
            List<Object> tuple = new ArrayList<>();
            for(int i= 1; i<=j; i++){
                tuple.add(rs.getObject(i));
            }
            content.add(tuple);
        }
        return new Table(lables_tablename, content);
    }
}
