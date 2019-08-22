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
        Map<String, List<RuleContext>> map = SQL_Parser.getParsedMap(sql);
        String result = sql;
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
        }else if(map.get("qualified_table_name").get(0).getText().contains(".")){
           result =  replaceRuleContext(map.get("qualified_table_name").get(0), tablename);
        }
        return result;
    }

    public List<String> makeQuerys(String where, String tablename) throws SQLException {
        List<String> querys = new ArrayList<>();
        String delete = "DELETE FROM " + tablename + " ";
        delete += " " + where + "; ";
        if(tablename_ID.containsKey(tablename))querys.add(delete);
        List<String> subtables = getNF2TableNames(tablename);
        if(!subtables.isEmpty())querys.addAll(newQuerys(delete, tablename, subtables, this::makeQuerys));
        return querys;
    }
}
