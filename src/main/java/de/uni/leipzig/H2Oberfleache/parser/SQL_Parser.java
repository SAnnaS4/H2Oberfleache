package de.uni.leipzig.H2Oberfleache.parser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SQL_Parser {

    public static String getQueryType(String sql){
        SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(sql));
        SQLiteParser parser = new SQLiteParser(new CommonTokenStream(lexer));
        parser.isMatchedEOF();
        return parser.name().getText();
    }

    public static Map<String, List<RuleContext>> getParsedMap(String sql){
        SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(sql));
        SQLiteParser parser = new SQLiteParser(new CommonTokenStream(lexer));
        RuleContext ctx = parser.sql_stmt();
        Map<String, List<RuleContext>> map = new HashMap<>();
        return explore(ctx, 0, map);
    }

    public static Map<String, List<RuleContext>> getParsedMap(RuleContext context){
        Map<String, List<RuleContext>> map = new HashMap<>();
        return explore(context, 0, map);
    }

    private static Map<String, List<RuleContext>> explore(RuleContext ctx, int indentation, Map<String, List<RuleContext>> map) {
        String ruleName = SQLiteParser.ruleNames[ctx.getRuleIndex()];
        if(!map.containsKey(ruleName)) {
            List<RuleContext> newList = new ArrayList<>();
            newList.add(ctx);
            map.put(ruleName, newList);
        }else {
            map.get(ruleName).add(ctx);
        }
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                map = explore((RuleContext) element, indentation + 1, map);
            }
        }
        return map;
    }

    public static List<RuleContext> getChildList(RuleContext ctx){
        List<RuleContext> children = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                children.add((RuleContext) element);
            }
        }
        return children;
    }

    public static Map<String, List<RuleContext>> getChildMap(RuleContext ctx){
        Map<String, List<RuleContext>> children = new HashMap<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                RuleContext newChild = (RuleContext) element;
                String ruleName = SQLiteParser.ruleNames[newChild.getRuleIndex()];
                if(children.containsKey(ruleName)){
                    List<RuleContext> child = children.get(ruleName);
                    child.add(newChild);
                    children.put(ruleName, child);
                }else {
                    List<RuleContext> child = new ArrayList<>();
                    child.add(newChild);
                    children.put(ruleName, child);
                }

            }
        }
        return children;
    }

    public static RuleContext parseTreeToRuleContext(ParseTree parseTree){
        RuleContext ruleContext = null;
        if (parseTree instanceof RuleContext) {
            ruleContext = (RuleContext) parseTree;
        }
        return ruleContext;
    }
}
