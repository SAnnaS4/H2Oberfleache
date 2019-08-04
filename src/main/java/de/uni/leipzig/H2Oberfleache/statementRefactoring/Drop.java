package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.controller.BaseController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Drop extends Statement{
    public static String nf2ToNf1(String sql) throws SQLException {
        sql = prepareSQL(sql);
        List<String> tablenames = getDropedTabelnames(sql);
        List<String> querys = new ArrayList<>();
        if(!sql.endsWith(";")){sql += ";"; }
        for (String tablename : tablenames) {
            querys.addAll(createQuerys(getNF2TableNames(tablename)));
            String delete = "DELETE FROM " +nf2TabName + " WHERE NAME = '" + tablename + "'";
            java.sql.Statement st1 = BaseController.connection.getCon().createStatement();
            st1.executeUpdate(delete);
        }
        for (String query : querys) {
            sql += query;
        }
        return sql;
    }

    public static List<String> getDropedTabelnames(String sql){
        String[] parts = sql.split(",");
        List<String> names = new ArrayList<>();
        for(int i = parts.length; i>1; --i){
            names.add(parts[i-1]);
        }
        String[] rest = parts[0].split(" ");
        names.add(rest[rest.length-1]);
        return names;
    }

    public static List<String> createQuerys(List<String> tablenames) throws SQLException {
        List<String> querys = new ArrayList<>();
        for (String tablename : tablenames) {
            querys.add("DROP TABLE " + tablename + ";");
            String delete = "DELETE FROM " +nf2TabName + " WHERE NAME = '" + tablename + "'";
            java.sql.Statement st1 = BaseController.connection.getCon().createStatement();
            st1.executeUpdate(delete);
        }
        return querys;
    }
}
