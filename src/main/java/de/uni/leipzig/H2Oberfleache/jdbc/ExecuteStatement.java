package de.uni.leipzig.H2Oberfleache.jdbc;

import de.uni.leipzig.H2Oberfleache.jdbc.DBConnection;
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
        ResultSet rs = st.executeQuery(query);
        String result = "";
//        while (rs.next()) {
//            result ="%d %s %d%n" + rs.getInt(1) + rs.getString(2) + rs.getInt(3);
//        }
        return rs;
    }

    public int execUpdate() throws SQLException {
        Statement st = DBcon.getCon().createStatement();
        int rs = st.executeUpdate(query);
        return rs;
    }

    public void conClose(){
        DBcon.conClose();
    }

    public ExecuteStatement(String dBName, String query, Boolean autoCommit) throws SQLException {
        this.DBcon = DBConnection.getInstance(autoCommit, dBName);
        this.DBcon.setAutoCommit(autoCommit);
        this.query = query;
    }
}
