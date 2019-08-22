package de.uni.leipzig.H2Oberfleache.jdbc;

import java.lang.reflect.Field;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DbInfo {
    public List<String> getTables(Boolean autoCommit, String dBName, String user, String password) throws SQLException {
        List<String> result = new ArrayList<>();
        DatabaseMetaData meta = DBConnection.getInstance(autoCommit, dBName, user, password).getMeta();
        ResultSet resultSet = meta.getTables(null, null, null, new String[]{"TABLE"});
        while(resultSet.next())
        {
            String tablename = resultSet.getString("TABLE_NAME");
            result.add(tablename);
        }
        return result;
    }

    public Map<String, String> getColums(Boolean autoCommit, String dBName, String tableName, String user, String password) throws SQLException, IllegalAccessException {
        DatabaseMetaData meta = DBConnection.getInstance(autoCommit, dBName, user, password).getMeta();
        Map<String, String> result = new HashMap<>();
        ResultSet columns = meta.getColumns(null,null, tableName, null);
        while(columns.next())
        {
            String columnName = columns.getString("COLUMN_NAME");
            Integer datatype = Integer.parseInt(columns.getString("DATA_TYPE"));
            result.put(columnName, getAllJdbcTypeNames().get(datatype));
        }
        return result;
    }

    public Map<Integer, String> getAllJdbcTypeNames() throws IllegalAccessException {

        Map<Integer, String> result = new HashMap<>();

        for (Field field : Types.class.getFields()) {
            result.put((Integer)field.get(null), field.getName());
        }

        return result;
    }
}
