package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.controller.BaseController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Drop extends Statement{
    String sql;

    public Drop(String sql){
        this.sql = sql;
    }

    public String nf2To1Nf() throws SQLException {
        sql = prepareSQL(sql);
        List<String> tablenames = getDropedTabelnames();
        List<String> queries = new ArrayList<>();
        if(!sql.endsWith(";"))sql += ";";
        for (String tablename : tablenames) {
            queries.addAll(createQueries(getNF2TableNamesRec(tablename)));
            String delete = "DELETE FROM " + nf2TabName + " WHERE NAME = '" + tablename + "'";
            java.sql.Statement st1 = BaseController.connection.getCon().createStatement();
            st1.executeUpdate(delete);
        }
        for (String query : queries) {
            sql += query;
        }
        return sql;
    }

    public List<String> getDropedTabelnames(){
        String[] parts = sql.split(",");
        List<String> names = new ArrayList<>();
        for(int i = parts.length; i>1; --i){
            names.add(parts[i-1]);
        }
        String[] rest = parts[0].split(" ");
        names.add(rest[rest.length-1]);
        return names;
    }

    public List<String> createQueries(List<String> tablenames) throws SQLException {
        List<String> queries = new ArrayList<>();
        for (String tablename : tablenames) {
            queries.add("DROP TABLE " + tablename + ";");
            String delete = "DELETE FROM " +nf2TabName + " WHERE NAME = '" + tablename + "'";
            java.sql.Statement st1 = BaseController.connection.getCon().createStatement();
            st1.executeUpdate(delete);
        }
        return queries;
    }
}
