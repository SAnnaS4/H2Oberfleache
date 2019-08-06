package de.uni.leipzig.H2Oberfleache.parser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.Tree;
import org.stringtemplate.v4.gui.JTreeScopeStackModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SQL_Parser {
    public static void test(){
        String sql1 = "CREATE TABLE NF(NB INT, NF1 SET(ROW(NS VARCHAR(10), NAME INT)), NF2 SET(ROW(NS VARCHAR(10), NAME INT)))";
        String sql2 = "CREATE TABLE Abteilung (AbtNr Int, Mitarbeiter SET( ROW( MaNr Int, Funktion String, Projekt " +
                "SET( ROW(ProjNr Int, ProjName String)))), Ausstattung SET( ROW (Anzahl Int, Typ String)))";
        String sql = "select nf.nf2, nf.*, a.b";
        Map<String, List<RuleContext>> map = getParsedMap(sql);
        SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(sql));
        SQLiteParser parser = new SQLiteParser(new CommonTokenStream(lexer));
        CommonTokenStream stream = new CommonTokenStream(lexer);
        List<CommonToken> tokens = new ArrayList<>();

        RuleContext context = parser.sql_stmt();
        print(context);
        parser.name().getText();
        ParseTree tree = parser.sql_stmt();
        ParseTreeWalker walker = new ParseTreeWalker();
        SQLiteBaseListener listener= new SQLiteBaseListener();
        walker.walk(listener, tree);
        }

    public static String getQueryType(String sql){
        SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(sql));
        SQLiteParser parser = new SQLiteParser(new CommonTokenStream(lexer));
        return parser.name().getText();
    }

    public static void print(RuleContext ctx) {
        Map<String, List<RuleContext>> map = new HashMap<>();
        map = explore(ctx, 0, map);
        for (Map.Entry<String, List<RuleContext>> entry : map.entrySet()) {
            for (RuleContext context : entry.getValue()) {
                System.out.println(entry.getKey() + ": " + context.getText());
            }
        }
        System.out.println(map);
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

    public static Map<String, List<RuleContext>> getChildren(RuleContext ctx){
        Map<String, List<RuleContext>> map = new HashMap<>();
        return explore(ctx, 0, map);
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

    public static List<String> getChildStringList(RuleContext ctx){
        List<String> children = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                children.add(SQLiteParser.ruleNames[((RuleContext) element).getRuleIndex()]);
            }
        }
        return children;
    }
}
