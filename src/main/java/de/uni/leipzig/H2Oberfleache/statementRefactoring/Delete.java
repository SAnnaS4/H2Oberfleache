package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import org.antlr.v4.runtime.RuleContext;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Delete extends Update_Delete{
    String sql;

    public Delete(String sql){
        this.sql = sql;
        makeMap(sql);
    }
    public String nf2ToNf1() throws SQLException {
        sql = prepareSQL(sql);
        whichStmt = "delete_stmt";
        String result = sql;
        Map<String, List<RuleContext>> map = SQL_Parser.getParsedMap(sql);
        String tablename = getTablename(map.get("qualified_table_name").get(0), false);
        List<String> subtables = getNF2TableNamesRec(tablename);
        List<String> table = new ArrayList<>();
        table.add(tablename);
        if(!subtables.isEmpty()) {
            result = "";
            List<String> querys = createQuerys(table, map.get("delete_stmt").get(0), tablename, sql, this::makeQuerys);
            for (String query : querys) {
                result += query;
            }
        }
        return result;
    }

    public List<String> makeQuerys(List<String> values, List<String> tablenames, String id) throws SQLException {
        String where = "WHERE " + id + " IN( ";
        Boolean komma = false;
        for (String value : values) {
            if(komma)where += ", ";
            komma = true;
            where += value;
        }
        where += ")";
        List<String> querys = new ArrayList<>();
        for (String tablename : tablenames) {
            String delete = "DELETE FROM " + tablename + " ";
            delete += " " + where + "; ";
            List<String> subtables = getNF2TableNames(tablename);
            querys.add(delete);
            if(!subtables.isEmpty())querys.addAll(newQuerys(delete, tablename, subtables, this::makeQuerys));
        }
        return querys;
    }
}
