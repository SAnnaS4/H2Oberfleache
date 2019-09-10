package de.uni.leipzig.H2Oberfleache.controller;

import de.uni.leipzig.H2Oberfleache.jdbc.DBConnection;
import de.uni.leipzig.H2Oberfleache.jdbc.ExecuteStatement;
import de.uni.leipzig.H2Oberfleache.presentation.HtmlBuilder;
import de.uni.leipzig.H2Oberfleache.presentation.ReadResultSet;
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

@Getter
@Setter
@Component
public class StatementHandling extends BaseController implements Serializable {
    String sql;
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
            if(isUpdate())update = eS.execUpdate();
            else {
                rs = eS.execQuery();
                ReadResultSet readResultSet = new ReadResultSet(rs);
                this.table = readResultSet.readResultSet(rs);
                HtmlBuilder htmlBuilder = new HtmlBuilder(table);
                this.html = htmlBuilder.getHtml();
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
}
