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

    public static Map<String, String> ober_untertabelle = new HashMap<>();
    private Map<String, List<Integer>> tablename_schluesselPosition = new HashMap<>();
    public Map<Integer, Integer> position_gleicheBelegung = new HashMap<>();

    public static String getObertab(String tab){
        for (Map.Entry<String, String> entry : ober_untertabelle.entrySet()) {
            if(entry.getValue().equals(tab))return entry.getKey();
        }
        return "";
    }

    private Table readResultSet(ResultSet rs) throws SQLException {
        Map<Integer, String> position_tablename = new HashMap<>();
        Map<String, List<Integer>> table_nests = new HashMap<>();
        Map<String, Map<String, List<String>>> table_schluessel_nestContent = new HashMap<>();
        List<List<String>> content = new ArrayList<>();
        int j = rs.getMetaData().getColumnCount();
        List<Map<String, String>> lables_tablename = makeLables_tablename(j, position_tablename, table_nests);
        int laenge = lables_tablename.size();
        int newName = 65;
        while (rs.next()){
            String[] tuple = new String[laenge];
            for (int i = 0; i<laenge; i++) {
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
            for (Map.Entry<Integer, Integer> entry : position_gleicheBelegung.entrySet()) {
                tuple[entry.getValue()-1] = tuple[entry.getKey()-1];
            }
            content.add(Arrays.asList(tuple));
        }
        return new Table(lables_tablename, content);
    }

    private List<Map<String, String>> makeLables_tablename(int j, Map<Integer, String> position_tablename, Map<String, List<Integer>> table_nests) throws SQLException {
        List<Map<String, String>> lables_tablename = new ArrayList<>();
        List<Map<String, String>> zusatzlables_tablename = new ArrayList<>();
        DbInfo dbInfo = new DbInfo();
        int neueSpalten = j;
        List<String> tables = dbInfo.getTables(false, dbName, user, password);
        for(int i= 1; i<=j; i++){
            String label = rs.getMetaData().getColumnLabel(i);
            String tablename = rs.getMetaData().getTableName(i);
            if(tablename.equals("") && label.startsWith("__") && label.endsWith("ID"))
                tablename = label.substring(2, label.length()-2);
            if(!tables.contains(tablename)){
                if(Grouping.columnname_tables.containsKey(label)) {
                    tablename = Grouping.columnname_tables.get(label).get(0);
                    Grouping.columnname_tables.get(label).remove(0);
                    if (Grouping.columnname_tables.get(label).size() == 1) Grouping.columnname_tables.remove(label);
                }else if(label.startsWith("_N_")){
                    boolean schluessel = false;
                    for (String s : tables) {
                        if(label.contains(s))schluessel = true;
                    }
                    if(schluessel) {
                        tablename = label.substring(3);
                        label = "__" + tablename + "ID";
                        String obertable = "";
                        String[] parts = tablename.split("_");
                        if(parts.length>0) {
                            for (int z = 0; z < parts.length - 1; z++) {
                                if(!parts[z].equals(""))
                                obertable = (obertable.equals("")?"":"__" + obertable + "_") + parts[z];
                            }
                           // obertable = obertable.substring(2);
                        }else obertable = "main";
                        ober_untertabelle.put(obertable, tablename);
                        Map<String, String> entry = new HashMap<>();
                        entry.put(label, obertable);
                        zusatzlables_tablename.add(entry);
                        position_tablename.put(++neueSpalten, obertable);
                        position_gleicheBelegung.put(i, neueSpalten);
                    }else {
                        Map<String, String> lable_tablename = getLable_tablename(label, "main");
                        for (Map.Entry<String, String> entry : lable_tablename.entrySet()) {
                            tablename = entry.getValue();
                            label = entry.getKey();
                        }
                    }
                }else{
                    tablename = "main";
                }
            }
            if(label.startsWith("__") && label.endsWith("ID")){
                String table = label.substring(2, label.length()-2);
                List<Integer> pos = tablename_schluesselPosition.getOrDefault(table, new ArrayList<>());
                pos.add(i-1);
                tablename_schluesselPosition.put(table, pos);
            }
            if(label.startsWith("_N_")){
                Map<String, String> lable_tablename = getLable_tablename(label, tablename);
                for (Map.Entry<String, String> entry : lable_tablename.entrySet()) {
                    tablename = entry.getValue();
                    label = entry.getKey();
                }
            }
            if(label.startsWith("_UN_")){
                Map<String, String> lable_tablename = getLable_tablename(label, tablename);
                for (Map.Entry<String, String> entry : lable_tablename.entrySet()) {
                    tablename = entry.getValue();
                    label = entry.getKey();
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
        lables_tablename.addAll(zusatzlables_tablename);
        return lables_tablename;
    }

    private Map<String, String> getLable_tablename(String label, String tablename){
        Integer unnests = label.split("_UN_").length-1;
        String[] nestList = label.split("_N_");
        Integer nest = nestList.length-1;
        int verschachtelungsGrad = nest - unnests;
        if(verschachtelungsGrad < 0){
            verschachtelungsGrad *= -1;
            for (int i = 0; i < verschachtelungsGrad; i++) {
                tablename = Statement.getObertabelle(tablename);
            }
        }else if(verschachtelungsGrad > 0){
            for(int i = 1; i <= verschachtelungsGrad; i++){
                tablename = (tablename.equals("main")?"": "__" + tablename + "_") + nestList[i].split("_")[0];
            }
        }
        String[]lables = nestList[nestList.length-1].split("_", 2)[1].split("_UN_");
        label = lables[lables.length-1];
        Map<String, String> lable_tablename = new HashMap<>();
        lable_tablename.put(label, tablename);
        return lable_tablename;
    }
}
