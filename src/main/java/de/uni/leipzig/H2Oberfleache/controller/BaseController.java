package de.uni.leipzig.H2Oberfleache.controller;

import de.uni.leipzig.H2Oberfleache.jdbc.DBConnection;
import de.uni.leipzig.H2Oberfleache.jdbc.ExecuteStatement;
import de.uni.leipzig.H2Oberfleache.presentation.*;
import de.uni.leipzig.H2Oberfleache.statementRefactoring.Statement;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.PrimeFaces;

import javax.annotation.ManagedBean;
import javax.faces.context.FacesContext;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@Getter
@Setter
public class BaseController{
    public UserDetails userDetails;
    public Boolean autoCommit = false;
    public String dbName = "testdb";
    public DBConnection connection;
    public String user = "sa";
    public String password = "sa";
    public TreeMaker treeMaker;
    String sql;
    int update;
    ResultSet rs;
    public Table table = new Table(new ArrayList<>(), new ArrayList<>());
    String html = "";

    public void submit() {
        sql = sql.toUpperCase().trim();
        ExecuteStatement eS = null;
        try {
            if(autoCommit){
                for (String neu : changeSQLAutoCommitTrue(sql)) {
                    eS = new ExecuteStatement(neu, false, userDetails);
                    if(isUpdate()){
                        update = eS.execUpdate();
                        eS.getDBcon().Commit();
                    }
                    else {
                        rs = eS.execQuery();
                        ReadResultSet readResultSet = new ReadResultSet(rs, userDetails);
                        this.table = readResultSet.readResultSet(rs);
                        HtmlBuilder htmlBuilder = new HtmlBuilder(table, userDetails);
                        this.html = htmlBuilder.getHtml();
                    }
                }
            }else {
                eS = new ExecuteStatement(changeSQLAutoCommitFalse(sql), false, userDetails);
                if(isUpdate()){
                    update = eS.execUpdate();
                    eS.getDBcon().Commit();
                }
                else {
                    rs = eS.execQuery();
                    ReadResultSet readResultSet = new ReadResultSet(rs, userDetails);
                    this.table = readResultSet.readResultSet(rs);
                    HtmlBuilder htmlBuilder = new HtmlBuilder(table, userDetails);
                    this.html = htmlBuilder.getHtml();
                }
            }
        } catch (SQLException e) {
            this.html = "<p>" + e.getMessage() + "</p>";
        } catch (Exception e) {
            this.html = "<p> Syntax Fehler in SQL Befehl \"" + sql + "\"</p>";
        }
        PrimeFaces.current().ajax().update("mainForm");
    }

    private List<String> changeSQLAutoCommitTrue(String sql) throws SQLException {
        List<String> newSQL = new ArrayList<>();
        String[] parts = sql.split(";");
        for (String part : parts) {
            Statement statement = new Statement(userDetails);
            newSQL.add(statement.changeToNF1(part));
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
            Statement statement = new Statement(userDetails);
            newSQL.append(statement.changeToNF1(part));
        }
        return newSQL.toString();
    }

    private Boolean isUpdate(){
        return sql.startsWith("CREATE") || sql.startsWith("UPDATE") || sql.startsWith("DROP") || sql.startsWith("INSERT") || sql.startsWith("DELETE");
    }

    public void  closeCon(){
        connection.conClose();
        goToPage("login");
    }

    public void onPageLoad(){
        try {
            connection = new DBConnection(autoCommit, dbName, user, password);
            userDetails = new UserDetails(autoCommit, dbName, connection, user, password);
            treeMaker = new TreeMaker(connection, userDetails);
        }catch (Exception e){
            goToPage("login");
        }
    }

    public String getUser(){return user; }

    public String getPassword(){return password;}

    public void setUser(String user){this.user = user; }

    public void setPassword(String password){this.password = password; }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public Boolean getAutoCommit() {
        return autoCommit;
    }

    public void setAutoCommit(Boolean autoCommit) {
        this.autoCommit = autoCommit;
    }

    public void goToPage(String page) {
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect(page + ".xhtml");
        } catch (Exception e) {
            System.out.println("goToPage hat eine Exception geworfen");
        }
    }
}
