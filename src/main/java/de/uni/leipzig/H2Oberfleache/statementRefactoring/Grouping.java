package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import org.antlr.v4.runtime.RuleContext;

import java.util.List;
import java.util.Map;

public class Grouping extends Statement{
    //group by having
    //eingabe position sql, rulecontext group by, alias_tablename

    public static String aggregatInSelect(RuleContext expr, Map<String, String> alias_tablename){
        String expression = "";
        Map<String, List<RuleContext>> map = SQL_Parser.getChildMap(expr);
        String functionName = map.get("aggregate").get(0).getText();
        RuleContext expr1= map.get("expr").get(0);
        switch (functionName){
            case "COUNT": {}
            case "SUM": {}
            default: {}
        }
        return expression;
    }
}
