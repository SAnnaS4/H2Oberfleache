package de.uni.leipzig.H2Oberfleache.controller;

import de.uni.leipzig.H2Oberfleache.jdbc.DBConnection;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
@Getter
@Setter
public class BaseController{
    public static Boolean autoCommit = false;
    public static String dbName = "db";
    public static DBConnection connection;
    public static String css =
            "<style>\n" +
                    "table, td, th {border: 2px solid black;" +
                    "  font-size: 18px;" +
                    "  text-align: center;}\n" +
                    "table {border-collapse: collapse;\n" +
                    "  width: 100%;}\n" +
                    "\n" +
                    "th, td {padding: 5px;}\n" +
                    "th {background-color: #f2f2f2;}\n" +
                    "</style>";

    public void onPageLoad(){
        try {
            this.connection = DBConnection.getInstance(autoCommit, dbName);
        }catch (Exception e){
            goToPage("login");
        }
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        BaseController.dbName = dbName;
    }

    public Boolean getAutoCommit() {
        return autoCommit;
    }

    public void setAutoCommit(Boolean autoCommit) {
        BaseController.autoCommit = autoCommit;
    }

    public void goToPage(String page) {
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect(page + ".xhtml");
        } catch (Exception e) {
            System.out.println("goToPage hat eine Exception geworfen");
        }
    }
}
