package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import de.uni.leipzig.H2Oberfleache.parser.SQL_Parser;
import de.uni.leipzig.H2Oberfleache.parser.SQLiteParser;
import org.antlr.v4.runtime.RuleContext;

import java.util.ArrayList;
import java.util.List;

public class Where extends Statement{
    String sql;
    public Where(String sql, RuleContext context, String aliasName){
        this.sql = sql;
        for (RuleContext ruleContext : SQL_Parser.getChildList(context)) {
            String ruleName = SQLiteParser.ruleNames[ruleContext.getRuleIndex()];
            if(ruleName.equals("where_expr")){
                List<RuleContext> exprs = exploreExpr((RuleContext) ruleContext.getChild(1));
                for (RuleContext expr : exprs) {
                        String newExpr = changeExpr(expr, aliasName);
                        if (!newExpr.equals(expr.getText())) {
                            this.sql = replaceRuleContext(this.sql, expr, newExpr);
                        }
                }
            }
            if(SQLiteParser.ruleNames[ruleContext.getRuleIndex()].equals("group_by")){
                for (RuleContext context1 : SQL_Parser.getChildList(ruleContext)) {
                    if(SQLiteParser.ruleNames[context1.getRuleIndex()].equals("expr")){
                        String newExpr = changeExpr(context1, aliasName);
                        if(!newExpr.equals(context.getText())){
                            this.sql = replaceRuleContext(this.sql, context, newExpr);
                        }
                    }
                }
            }
        }
    }

    public List<RuleContext> exploreExpr(RuleContext expr){
        List<RuleContext> exprs = new ArrayList<>();
        for (RuleContext context : SQL_Parser.getChildList(expr)) {
            if(SQLiteParser.ruleNames[context.getRuleIndex()].equals("expr")){
                exprs.addAll(exploreExpr(context));
            }
            if(SQLiteParser.ruleNames[context.getRuleIndex()].equals("column_name")){
                exprs.add(context);
            }
            if(SQLiteParser.ruleNames[context.getRuleIndex()].equals("select_stmt")){
                this.sql = Select.nf2ToNf1(this.sql, context);
            }
        }
        return exprs;
    }

    public static String changeExpr(RuleContext expr, String alias){
        List<String> childs = SQL_Parser.getChildStringList(expr);
        if(!childs.contains("table_name")){
            return alias + "." + expr.getText();
        }
        return expr.getText();
    }
}
