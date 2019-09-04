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
    private List<String> getIDs(String tablename, RuleContext stmt, String sql) throws SQLException {
        String id = "__" + tablename + "ID";
        String tableAlias = "";
        String mainTable = tablename;
        if(tablename.startsWith("__")){
            String[] tab = tablename.split("_");
            for (String s : tab) {
                if(!s.equals("")){
                    mainTable = s;
                    break;
                }
            }
            tableAlias = tab[tab.length-1];
            id = tableAlias + "." + id;
        }
        StringBuilder selectStmt = new StringBuilder("SELECT DISTINCT " + id);
        String where = "";
        List<String> subtables = getNF2TableNamesRec(tablename);
        for (String subtable : subtables) {
            String alias = subtable.split("_")[subtable.split("_").length-1];
            String idName = "__" + subtable + "ID";
            selectStmt.append(", ").append(alias).append(".").append(idName);
        }
        selectStmt.append(" FROM ").append(mainTable).append(" ");
        for (RuleContext context : SQL_Parser.getChildList(stmt)) {
            if(SQLiteParser.ruleNames[context.getRuleIndex()].equals("where_expr")){
                where = cutFromSQL(context, sql);
            }
        }
        selectStmt.append(where);
        if(!tableAlias.equals("")){
            makePosition_sql(selectStmt.toString());
            Map<String, String> alias_tablename = new HashMap<>();
            alias_tablename.put(tableAlias, tablename);
            List<String> maintables = new ArrayList<>();
            maintables.add(tablename);
            SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(selectStmt.toString()));
            SQLiteParser parser = new SQLiteParser(new CommonTokenStream(lexer));
            RuleContext select_stmt = parser.select_or_values();
            Where updateWhere = new Where(selectStmt.toString(),select_stmt, alias_tablename, position_sql, maintables);
            selectStmt = new StringBuilder(updateWhere.sql);
        }
        position_sql = new HashMap<>();
        Select select = new Select(selectStmt.toString(), false);
        selectStmt = new StringBuilder(select.nf2ToNf1());
        List<String> ids = new ArrayList<>();
        ExecuteStatement eS = new ExecuteStatement(BaseController.dbName, selectStmt.toString(), true, BaseController.user, BaseController.password);
        ResultSet rs = eS.execQuery();
        List<String> tables = new ArrayList<>();
        tables.add(tablename);
        tables.addAll(subtables);
        makePosition_sql(sql);
        int columnCount = rs.getMetaData().getColumnCount();
        while (rs.next()){
            if(!ids.contains(rs.getObject(1).toString())) ids.add(rs.getObject(1).toString());
            for(int i= 1; i<=columnCount; i++){
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

    public List<String> newQueries(String sql, String tablename, List<String> subtables, SpezificFunction foo) throws SQLException {
        Map<String, List<RuleContext>> map = SQL_Parser.getParsedMap(sql);
        RuleContext stmt;
        if(map.containsKey(whichStmt + "_limited")) stmt = map.get(whichStmt + "_limited").get(0);
        else stmt = map.get(whichStmt).get(0);
        return createQuerys(subtables, stmt, tablename, sql, foo);
    }

    public List<String> createQuerys(List<String> subtables, RuleContext stmt, String tablename, String sql, SpezificFunction foo) throws SQLException {
        List<String> queries = new ArrayList<>();
        if (!subtables.isEmpty()) {
            List<String> ids;
            if(tablename_ID.containsKey(tablename))ids = tablename_ID.get(tablename);
            else ids = getIDs(tablename, stmt, sql);
            String id = "__" + tablename +"ID";
            StringBuilder whereStart = new StringBuilder("WHERE " + id + " IN( ");
            boolean komma = false;
            for (String value : ids) {
                if(komma) whereStart.append(", ");
                komma = true;
                whereStart.append(value);
            }
            whereStart.append(")");
            for (String subtable : subtables) {
                StringBuilder where = new StringBuilder(whereStart.toString());
                if (tablename_ID.containsKey(subtable)) {
                    where.append(" AND __").append(subtable).append("ID IN( ");
                    komma = false;
                    for (String s : tablename_ID.get(subtable)) {
                        if (komma) where.append(", ");
                        komma = true;
                        where.append(s);
                    }
                    where.append(")");
                }
                queries.addAll(foo.createStats(where.toString(), subtable));
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
    public interface SpezificFunction {
        List<String> createStats(String where, String tablename) throws SQLException;
    }
}
