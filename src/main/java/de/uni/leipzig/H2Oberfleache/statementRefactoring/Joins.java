package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteParser;
import de.uni.leipzig.H2Oberfleache.presentation.UserDetails;
import org.antlr.v4.runtime.RuleContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Joins extends Where {

    public static List<String> operations = Arrays.asList("NATURAL", "LEFT", "INNER", "CROSS");

    public Joins(UserDetails userDetails) {
        super(userDetails);
    }

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
            usedExpr = new ArrayList<>();
            for (RuleContext expr : exprs) {
                if(!usedExpr.contains(expr)) {
                    String newExpr = changeExpr(expr, alias_tablename, haupttables, position_sql, sql, parentTabAlias_childTabAliases, userDetails);
                    if (!newExpr.equals(expr.getText())) {
                        if(newExpr.contains("NOT EXISTS (") && newExpr.contains("AND NOT EXISTS (") && newExpr.contains(" EXCEPT")){
                            this.sql = replaceRuleContext(expr.parent, newExpr);
                        }else this.sql = replaceRuleContext(expr, newExpr);
                    }
                }
            }
        }
        return this.sql;
    }


}
