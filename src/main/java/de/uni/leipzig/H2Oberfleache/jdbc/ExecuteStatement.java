package de.uni.leipzig.H2Oberfleache.jdbc;

import de.uni.leipzig.H2Oberfleache.presentation.UserDetails;
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

    public ExecuteStatement(String query, Boolean autoCommit, UserDetails userDetails) throws SQLException {
        this.DBcon = userDetails.connection;
        this.DBcon.setAutoCommit(autoCommit);
        this.query = query;
    }
}
