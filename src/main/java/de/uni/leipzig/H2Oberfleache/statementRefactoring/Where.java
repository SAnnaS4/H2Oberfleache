package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import org.antlr.v4.runtime.RuleContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Where {
    public Where(Map<String, List<RuleContext>> map, String sql, List<String> subtables){

    }



//    private static List<String> getNewSelectStatsSelect (List<String> subtables, Map<String, List<RuleContext>> map) {
//        List<RuleContext> list = new ArrayList<>();
//        List<String> result = new ArrayList<>();
//        if (map.containsKey("result_column")) list = map.get("result_column");
//        for (RuleContext context : list) {
//            Map<String, List<RuleContext>> childs = SQL_Parser.getCildren(context);
//            List<RuleContext> subtable_names = new ArrayList<>();
//            if (childs.containsKey("table_name")) subtable_names = childs.get("table_name");
//            if (childs.containsKey("column_name")) subtable_names.addAll(childs.get("column_name"));
//            for (RuleContext name : subtable_names) {
//                if(!Select.isSubtable(name.getText(), subtables).isEmpty()){
//                    String subtable_name = Select.isSubtable(name.getText(), subtables);
//                    String table_name = subtable_name.substring(2, subtable_name.length() - name.getText().length()-1);
//                   // String query = createNewSelect(table_name, subtable_name, name.getText()+ "ID", false);
//                   // result.add(query + " as " + name.getText() + " , ");
//                }
//            }
//        }
//        return result;
//    }
}
