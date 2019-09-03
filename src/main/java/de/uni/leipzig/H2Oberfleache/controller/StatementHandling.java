package de.uni.leipzig.H2Oberfleache.controller;

import de.uni.leipzig.H2Oberfleache.jdbc.DBConnection;
import de.uni.leipzig.H2Oberfleache.jdbc.DbInfo;
import de.uni.leipzig.H2Oberfleache.jdbc.ExecuteStatement;
import de.uni.leipzig.H2Oberfleache.presentation.HtmlBuilder;
import de.uni.leipzig.H2Oberfleache.statementRefactoring.Grouping;
import de.uni.leipzig.H2Oberfleache.statementRefactoring.Statement;
import de.uni.leipzig.H2Oberfleache.tables.Table;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.PrimeFaces;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

@Getter
@Setter
@Component
//@SessionScoped
public class StatementHandling extends BaseController implements Serializable {
    String sql;
    //String result;
    int update;
    ResultSet rs;
    public Table table = new Table(new ArrayList<>(), new ArrayList<>());
    String html = "";

    public void submit() throws SQLException {
        sql = sql.toUpperCase().trim();
        ExecuteStatement eS = null;
        if(autoCommit){
            for (String neu : changeSQLAutoCommitTrue(sql)) {
                eS = new ExecuteStatement(dbName, neu, false, user, password);
                eS.getDBcon().Commit();
            }
        }else {
            eS = new ExecuteStatement(dbName, changeSQLAutoCommitFalse(sql), false, user, password);
            eS.getDBcon().Commit();
        }
      //  try {
            if(isUpdate())update = eS.execUpdate();
            else {
                rs = eS.execQuery();
                this.table = readResultSet(rs);
                HtmlBuilder htmlBuilder = new HtmlBuilder(table);
                this.html = htmlBuilder.getHtml();
            }
      //  } catch (NullPointerException e) {
      //  }
        PrimeFaces.current().ajax().update("mainForm");
    }
    
    private List<String> changeSQLAutoCommitTrue(String sql) throws SQLException {
        List<String> newSQL = new ArrayList<>();
        String[] parts = sql.split(";");
        for (String part : parts) {
            newSQL.add(Statement.changeToNF1(part));
        }
        return newSQL;
    }

    private String changeSQLAutoCommitFalse(String sql) throws SQLException {
        StringBuilder newSQL = new StringBuilder();
        String[] parts = sql.split(";");
        boolean erstes = true;
        for (String part : parts) {
            if(!erstes) newSQL.append("; ");
            erstes = false;
            newSQL.append(Statement.changeToNF1(part));
        }
        return newSQL.toString();
    }

    private Boolean isUpdate(){
        return sql.startsWith("CREATE") || sql.startsWith("UPDATE") || sql.startsWith("DROP") || sql.startsWith("INSERT") || sql.startsWith("DELETE");
    }

    public void  closeCon(){
        DBConnection.getInstance(autoCommit, dbName, user, password).conClose();
        goToPage("login");
    }



    private Table readResultSet(ResultSet rs) throws SQLException {
        DbInfo dbInfo = new DbInfo();
        Map<Integer, String> position_tablename = new HashMap<>();
        Map<String, List<Integer>> table_nests = new HashMap<>();
        Map<String, Map<String, List<String>>> table_schluessel_nestContent = new HashMap<>();
        Map<String, List<Integer>> tablename_schluesselPosition = new HashMap<>();
        List<String> tables = dbInfo.getTables(false, dbName, user, password);
        List<List<String>> content = new ArrayList<>();
        List<Map<String, String>> lables_tablename = new ArrayList<>();
        int j = rs.getMetaData().getColumnCount();
        for(int i= 1; i<=j; i++){
            String label = rs.getMetaData().getColumnLabel(i);
            String tablename = rs.getMetaData().getTableName(i);
            if(tablename.equals("") && label.startsWith("__") && label.endsWith("ID"))
                tablename = label.substring(2, label.length()-2);
            if(!tables.contains(tablename)){
                tablename = Grouping.columnname_tables.get(label).get(0);
                Grouping.columnname_tables.get(label).remove(0);
                if(Grouping.columnname_tables.get(label).size() == 1)Grouping.columnname_tables.remove(label);
            }
            if(label.startsWith("__") && label.endsWith("ID")){
                String table = label.substring(2, label.length()-2);
                List<Integer> pos = tablename_schluesselPosition.getOrDefault(table, new ArrayList<>());
                pos.add(i-1);
                tablename_schluesselPosition.put(table, pos);
            }
            if(label.startsWith("UN_")){
                String[] nests = label.split("UN_");
                for (int z = 0; z < nests.length-1; z++) {
                    tablename = Statement.getObertabelle(tablename);
                    label = label.substring(3);
                }
                List<Integer> pos = table_nests.getOrDefault(tablename, new ArrayList<>());
                pos.add(i);
                table_nests.put(tablename, pos);
            }
            Map<String, String> entry = new HashMap<>();
            entry.put(label, tablename);
            lables_tablename.add(entry);
            position_tablename.put(i, tablename);
        }
        int newName = 65;
        while (rs.next()){
            String[] tuple = new String[j];
            for (int i = 0; i<=j-1; i++) {
                tuple[i]="";
            }
            for(int i= 1; i<=j; i++){
                String cont = rs.getObject(i).toString();
                String tabelname = position_tablename.get(i);
                if(table_nests.containsKey(tabelname)){
                    List<Integer> nestPositions = table_nests.get(tabelname);
                    Map<String, List<String>> map = new HashMap<>();
                    List<String> values = new ArrayList<>();
                    for (Integer nestPosition : nestPositions) {
                        values.add(rs.getObject(nestPosition).toString());
                    }
                    String schluessel = rs.getObject(tablename_schluesselPosition.get(tabelname).get(0)+1).toString();
                    if(table_schluessel_nestContent.containsKey(tabelname)){
                        map = table_schluessel_nestContent.get(tabelname);
                        boolean neuerSchluessel = true;
                        if(map.containsKey(schluessel)){
                            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                                List<String> oldValues = entry.getValue();
                                String oldSchluessel = entry.getKey();
                                if(oldValues.equals(values)){
                                    neuerSchluessel = false;
                                    for (Integer position : tablename_schluesselPosition.get(tabelname)) {
                                        tuple[position] = oldSchluessel;
                                    }
                                }
                            }
                            if(neuerSchluessel) {
                                String newSchluessel = ((char) newName) + schluessel;
                                newName++;
                                for (Integer position : tablename_schluesselPosition.get(tabelname)) {
                                    tuple[position] = newSchluessel;
                                }
                                map.put(newSchluessel, values);
                            }
                        }else {
                            map.put(schluessel, values);
                        }
                    }else {
                        map.put(schluessel, values);
                    }
                    table_schluessel_nestContent.put(tabelname, map);
                }
                if(tuple[i-1].isEmpty())tuple[i-1]= cont;
            }
            content.add(Arrays.asList(tuple));
        }
        return new Table(lables_tablename, content);
    }
}
