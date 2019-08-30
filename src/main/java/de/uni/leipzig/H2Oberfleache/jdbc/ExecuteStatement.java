package de.uni.leipzig.H2Oberfleache.jdbc;

import lombok.Getter;
import lombok.Setter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Getter
@Setter
public class ExecuteStatement {
    private String query;
    private String dBName;
    private DBConnection DBcon;

    public ResultSet execQuery() throws SQLException {
        Statement st = DBcon.getCon().createStatement();
        return st.executeQuery(query);
    }

    public int execUpdate() throws SQLException {
        Statement st = DBcon.getCon().createStatement();
        return st.executeUpdate(query);
    }

    public ExecuteStatement(String dBName, String query, Boolean autoCommit, String user, String password) throws SQLException {
        this.DBcon = DBConnection.getInstance(autoCommit, dBName, user, password);
        this.DBcon.setAutoCommit(autoCommit);
        this.query = query;
    }
}
