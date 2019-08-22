package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.controller.BaseController;
import de.uni.leipzig.H2Oberfleache.jdbc.ExecuteStatement;
import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteLexer;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Update_Delete extends Statement {
    String whichStmt = "";
    Map<String, List<String>> tablename_ID = new HashMap<>();
    public List<String> getIDs(String tablename, RuleContext stmt, String sql) throws SQLException {
        String id = "__" + tablename + "ID";
        String tableAlias = "";
        String hauptTable = tablename;
        if(tablename.startsWith("__")){
            String[] tab = tablename.split("_");
            for (String s : tab) {
                if(!s.equals("")){
                    hauptTable = s;
                    break;
                }
            }
            tableAlias = tab[tab.length-1];
            id = tableAlias + "." + id;
        }
        String selectStmt = "SELECT DISTINCT " + id ;
        String where = "";
        List<String> subtables = getNF2TableNamesRec(tablename);
        for (String subtable : subtables) {
            String alias = subtable.split("_")[subtable.split("_").length-1];
            String idName = "__" + subtable + "ID";
            selectStmt += ", " + alias + "." + idName;
        }
        selectStmt += " FROM " + hauptTable + " ";
        for (RuleContext context : SQL_Parser.getChildList(stmt)) {
            if(SQLiteParser.ruleNames[context.getRuleIndex()].equals("where_expr")){
                where = cutFromSQL(context, sql);
            }
        }
        selectStmt += where;
        if(!tableAlias.equals("")){
            makeMap(selectStmt);
            Map<String, String> alias_tablename = new HashMap<>();
            alias_tablename.put(tableAlias, tablename);
            List<String> haupttables = new ArrayList<>();
            haupttables.add(tablename);
            SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(selectStmt));
            SQLiteParser parser = new SQLiteParser(new CommonTokenStream(lexer));
            RuleContext select_stmt = parser.select_or_values();
            Where updateWhere = new Where(selectStmt,select_stmt, alias_tablename, position_sql, haupttables);
            selectStmt = updateWhere.sql;
        }
        position_sql = new HashMap<>();
        Select select = new Select(selectStmt, false);
        selectStmt = select.nf2ToNf1();
        List<String> ids = new ArrayList<>();
        ExecuteStatement eS = new ExecuteStatement(BaseController.dbName, selectStmt, true, BaseController.user, BaseController.password);
        ResultSet rs = eS.execQuery();
        List<String> tables = new ArrayList<>();
        tables.add(tablename);
        tables.addAll(subtables);
        makeMap(sql);
        int j = rs.getMetaData().getColumnCount();
        while (rs.next()){
            if(!ids.contains(rs.getObject(1).toString())) ids.add(rs.getObject(1).toString());
            for(int i= 1; i<=j; i++){
                if(tablename_ID.containsKey(tables.get(i-1))){
                    List<String> subids = tablename_ID.get(tables.get(i-1));
                    if(!subids.contains(rs.getObject(i).toString())) {
                        subids.add(rs.getObject(i).toString());
                        tablename_ID.put(tables.get(i - 1), subids);
                    }
                }else {
                    List<String> subids = new ArrayList<>();
                    subids.add(rs.getObject(i).toString());
                    tablename_ID.put(tables.get(i-1), subids);
                }

            }
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
            List<String> ids;
            if(tablename_ID.containsKey(tablename))ids = tablename_ID.get(tablename);
            else ids = getIDs(tablename, stmt, sql);
            String id = "__" + tablename +"ID";
            String whereAnfang = "WHERE " + id + " IN( ";
            Boolean komma = false;
            for (String value : ids) {
                if(komma)whereAnfang += ", ";
                komma = true;
                whereAnfang += value;
            }
            whereAnfang += ")";
            for (String subtable : subtables) {
                String where = whereAnfang;
                if (tablename_ID.containsKey(subtable)) {
                    where += " AND __" + subtable + "ID IN( ";
                    komma = false;
                    for (String s : tablename_ID.get(subtable)) {
                        if (komma) where += ", ";
                        komma = true;
                        where += s;
                    }
                    where += ")";
                }
                queries.addAll(foo.method(where, subtable));
            }
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
        List<String> method(String where, String tablename) throws SQLException;
    }
}
