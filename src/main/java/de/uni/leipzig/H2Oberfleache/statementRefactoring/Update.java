package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import org.antlr.v4.runtime.RuleContext;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Update extends Statement {
    public static String nf2ToNf1(String sql) {
        sql = prepareSQL(sql);
        Map<String, List<RuleContext>> map = SQL_Parser.getParsedMap(sql);
        String tablename = map.get("table_name").get(0).getText();
        List<String> subtables = getNF2TableNames(tablename);
        List<String> queries = new ArrayList<>();
        String result = sql;
        if (!subtables.isEmpty()) {

        }
        return "";
    }
}
