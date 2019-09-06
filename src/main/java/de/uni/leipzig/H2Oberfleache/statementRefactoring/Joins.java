package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteParser;
import org.antlr.v4.runtime.RuleContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Joins extends Where {
    // mit with Anweisung !!!

    public static List<String> operations = Arrays.asList("NATURAL", "LEFT", "INNER", "CROSS");

    public static List<RuleContext> getTableOrSubQuerys(List<RuleContext> joins){
        List<RuleContext> tableOrSubQuerys = new ArrayList<>();
        for (RuleContext join : joins) {
            List<RuleContext> table_subquery = SQL_Parser.getParsedMap(join).get("table_or_subquery");
            for (RuleContext context : table_subquery) {
                if(!SQL_Parser.getChildMap(context).containsKey("join_clause"))tableOrSubQuerys.add(context);
            }
        }
        return tableOrSubQuerys;
    }

    public String JoinConstraint(String sql, List<RuleContext> constrainList, Map<String, String> alias_tablename, Map<Integer, String> position_sql,
                 List<String> haupttables, Map<String, List<String>> parentTabAlias_childTabAliases){
        this.sql = sql;
        this.alias_tablename = alias_tablename;
        this.position_sql = position_sql;
        for (RuleContext ruleContext : constrainList) {
            List<RuleContext> exprs = exploreExpr((RuleContext) ruleContext.getChild(1));
            for (RuleContext expr : exprs) {
                String newExpr = changeExpr(expr, alias_tablename, haupttables, position_sql, sql, parentTabAlias_childTabAliases);
                if (!newExpr.equals(expr.getText())) {
                    this.sql = replaceRuleContext(expr, newExpr);
                }
            }
        }
        return this.sql;
    }


}
