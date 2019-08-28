package de.uni.leipzig.H2Oberfleache.presentation;

import de.uni.leipzig.H2Oberfleache.controller.BaseController;
import de.uni.leipzig.H2Oberfleache.jdbc.DbInfo;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import org.springframework.stereotype.Controller;

import javax.faces.view.ViewScoped;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Setter
@Getter
@ViewScoped
public class TreeMaker extends BaseController {
    DatabaseMetaData dBData = connection.getMeta();
    DbInfo dbInfo = new DbInfo();

    public TreeMaker() throws SQLException {
    }

    public TreeNode getTree() throws SQLException, IllegalAccessException {
        List<String> allTables = dbInfo.getTables(autoCommit, dbName, user, password);
        List<String> tables = new ArrayList<>();
        List<String> subtables = new ArrayList<>();
        TreeNode root = new DefaultTreeNode("ROOT", null);
        for (String table : allTables) {
            if (table.startsWith("__")) {
                subtables.add(table);
            } else {
                tables.add(table);
            }
        }
        Map<String, List<String>> table_subtables = getTable_Subtable(subtables, allTables);
        for (String table : tables) {
            TreeNode node = new DefaultTreeNode(table, null);
            addColumns(node, table, table_subtables);
            root.getChildren().add(node);
        }
        return root;
    }

    private Map<String, List<String>> getTable_Subtable(List<String> subtables, List<String> allTables) {
        Map<String, List<String>> table_subtables = new HashMap<>();
        for (String table : allTables) {
            List<String> mySubtables = new ArrayList<>();
            for (String subtable : subtables) {
                if(subtable.startsWith("__" + table))mySubtables.add(subtable);
            }
            table_subtables.put(table, mySubtables);
        }
        return table_subtables;
    }

    private void addColumns(TreeNode node, String tablename, Map<String, List<String>> table_subtables) throws SQLException, IllegalAccessException {
        Map<String, String> columns = dbInfo.getColums(autoCommit,dbName,tablename, user, password);
        String idName = "__" + tablename + "ID";
        for (Map.Entry<String, String> column : columns.entrySet()) {
            TreeNode node1;
            String name;
            if(column.getKey().equals(idName)){
                for (String subTable : table_subtables.get(tablename)) {
                    String[] namen = subTable.split("_");
                    name = namen[namen.length-1];
                    node1 = new DefaultTreeNode(name);
                    addColumns(node1, subTable, table_subtables);
                    node.getChildren().add(node1);
                }
            }else if(!column.getKey().startsWith("__")){
                node1 = new DefaultTreeNode(column.getKey() + " " + column.getValue(), null);
                node.getChildren().add(node1);
            }
        }
    }
}
//    public static Map<String, List<String>> getTable_Subtable() throws SQLException {
//        DbInfo dbInfo = new DbInfo();
//        List<String> allTables = dbInfo.getTables(autoCommit, dbName, user, password);
//        List<String> subtables = new ArrayList<>();
//        for (String table : allTables) {
//            if (table.startsWith("__")) {
//                subtables.add(table);
//            }
//        }
//        Map<String, List<String>> table_subtables = new HashMap<>();
//        for (String table : allTables) {
//            List<String> mySubtables = new ArrayList<>();
//            for (String subtable : subtables) {
//                if(subtable.startsWith("__" + table))mySubtables.add(subtable);
//            }
//            if(!subtables.isEmpty()) {
//                table_subtables.put(table, mySubtables);
//            }
//        }
//        return table_subtables;
//    }