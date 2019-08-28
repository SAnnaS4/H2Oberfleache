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
    public static String dbName = "testdb";
    public static DBConnection connection;
    public static String user = "sa";
    public static String password = "sa";

    public void onPageLoad(){
        try {
            connection = DBConnection.getInstance(autoCommit, dbName, user, password);
        }catch (Exception e){
            goToPage("login");
        }
    }



    public String getUser(){return user; }

    public String getPassword(){return password;}

    public void setUser(String user){BaseController.user = user; }

    public void setPassword(String password){BaseController.password = password; }

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
