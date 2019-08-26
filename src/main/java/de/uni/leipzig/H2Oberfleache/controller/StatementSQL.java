package de.uni.leipzig.H2Oberfleache.controller;

import de.uni.leipzig.H2Oberfleache.jdbc.DBConnection;
import de.uni.leipzig.H2Oberfleache.jdbc.ExecuteStatement;
import de.uni.leipzig.H2Oberfleache.statementRefactoring.Statement;
import de.uni.leipzig.H2Oberfleache.tables.Table;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.PrimeFaces;
import org.springframework.stereotype.Component;

import javax.enterprise.context.SessionScoped;
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
@SessionScoped
public class StatementSQL extends BaseController implements Serializable {
    String sql = "update nf set nf1.alter = 7 where name = 4";
    String result;
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
       // try {
            if(isUpdate())update = eS.execUpdate();
            else {
                rs = eS.execQuery();
                this.table = readResultSet(rs);
                HtmlBuilder htmlBuilder = new HtmlBuilder(table);
                this.html = htmlBuilder.html;
            }
        //} catch (NullPointerException e) {
       // }
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
        String newSQL = "";
        String[] parts = sql.split(";");
        boolean erstes = true;
        for (String part : parts) {
            if(!erstes)newSQL += "; ";
            erstes = false;
            newSQL += Statement.changeToNF1(part);
        }
        return newSQL;
    }

    private Boolean isUpdate (){
        if(sql.startsWith("CREATE")|| sql.startsWith("UPDATE") || sql.startsWith("DROP") || sql.startsWith("INSERT") || sql.startsWith("DELETE"))return true;
        return false;
    }

    public void  closeCon(){
        DBConnection.getInstance(autoCommit, dbName, user, password).conClose();
        goToPage("login");
    }

    private Table readResultSet(ResultSet rs) throws SQLException {
        List<List<Object>> table = new ArrayList<>();
        List<Map<String, String>> lables_tablename = new ArrayList<>();
        int j = rs.getMetaData().getColumnCount();
        for(int i= 1; i<=j; i++){
            String label = rs.getMetaData().getColumnLabel(i);
            String tablename = rs.getMetaData().getTableName(i);
            if(tablename.equals("")){
                if(label.startsWith("__") && label.endsWith("ID"))tablename = label.substring(2, label.length()-2);
            }
            Map<String, String> entry = new HashMap<>();
            entry.put(label, tablename);
            lables_tablename.add(entry);
        }
        while (rs.next()){
            List<Object> liste = new ArrayList<>();
            for(int i= 1; i<=j; i++){
                liste.add(rs.getObject(i));
            }
            table.add(liste);
        }
        return new Table(lables_tablename, table);
    }
}
