package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.controller.BaseController;
import de.uni.leipzig.H2Oberfleache.jdbc.ExecuteStatement;
import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Update_Delete extends Statement {
    String sql;
    String whichStmt = "";
    public List<String> getIDs(String tablename, RuleContext stmt, String sql) throws SQLException {
        String selectStmt = "SELECT __" + tablename + "ID FROM " + tablename + " ";
        String where = "";
        for (RuleContext context : SQL_Parser.getChildList(stmt)) {
            if(SQLiteParser.ruleNames[context.getRuleIndex()].equals("where_expr")){
                where = cutFromSQL(context, sql);
            }
        }
        selectStmt += where;
        position_sql = new HashMap<>();
        Select select = new Select(selectStmt, false);
        selectStmt = select.nf2ToNf1();
        List<String> ids = new ArrayList<>();
        ExecuteStatement eS = new ExecuteStatement(BaseController.dbName, selectStmt, true);
        ResultSet rs = eS.execQuery();
        while (rs.next()){
            ids.add(rs.getObject(1).toString());
        }
        return ids;
    }

    public List<String> newQuerys(String sql, String tablename, List<String> subtables, Foo foo) throws SQLException {
        Map<String, List<RuleContext>> map = SQL_Parser.getParsedMap(sql);
        RuleContext stmt;
        if(map.containsKey(whichStmt + "_limited")) stmt = map.get(whichStmt + "_limited").get(0);
        else stmt = map.get(whichStmt).get(0);
        return createQuerys(subtables, stmt, tablename, sql, foo);
    }

    public List<String> createQuerys(List<String> subtables, RuleContext stmt, String tablename, String sql, Foo foo) throws SQLException {
        List<String> queries = new ArrayList<>();
        if (!subtables.isEmpty()) {
            List<String> ids = getIDs(tablename, stmt, sql);
            String id = "__" + tablename +"ID";
            queries.addAll(foo.method(ids, subtables, id));
        }else queries.add(sql);
        return queries;
    }

    public String getTablename(RuleContext qualifiedTablename, Boolean mitColumnname){
        String tablename = "";
        ParseTree element = qualifiedTablename.getChild(0);
        if (element instanceof RuleContext) {
            tablename = element.getText();
        }
        if(qualifiedTablename.getChildCount()>1){
            tablename = getTablename(qualifiedTablename, getNF2TableNamesRec(tablename), mitColumnname);
        }
        return tablename;
    }



    @FunctionalInterface
    public interface Foo {
        List<String> method(List<String> values, List<String> tablenames, String id) throws SQLException;
    }
}
