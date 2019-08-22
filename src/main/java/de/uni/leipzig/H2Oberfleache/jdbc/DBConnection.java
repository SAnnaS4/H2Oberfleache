package de.uni.leipzig.H2Oberfleache.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private Connection con;
    String url;

    private static DBConnection dbConnection;

    public static DBConnection getInstance(Boolean autoCommit, String DbName, String user, String password){
        if(dbConnection == null){
            dbConnection = new DBConnection(autoCommit, DbName, user, password);
        }
        return dbConnection;
    }

    private DBConnection(Boolean autoCommit, String DbName, String user, String password) {
        try {
            this.url = "jdbc:h2:~/" + DbName;
            this.con = DriverManager.getConnection(url,user,password);
            con.setAutoCommit(autoCommit);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setAutoCommit(Boolean autoCommit) throws SQLException {
        this.con.setAutoCommit(autoCommit);
    }

    public Connection getCon(){
        return this.con;
    }

    public void Commit(){
        try {
            con.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public DatabaseMetaData getMeta() throws SQLException {
        return this.con.getMetaData();
    }

    public void conClose(){
        try {
            this.con.close();
            dbConnection = null;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
