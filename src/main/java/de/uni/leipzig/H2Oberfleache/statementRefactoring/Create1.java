package de.uni.leipzig.H2Oberfleache.statementRefactoring;

import java.util.ArrayList;
import java.util.List;

public class Create1 extends Statement {
    public static String nf2ToNf1(String sql) {
        sql = prepareSQL(sql);
        String[] parts = splitAtSETROW(sql).toArray(new String[0]);
        String tablename = "";
        String newSql = parts[0].trim();
        String result;
        if(sql.contains("CREATE TABLE") && sql.contains("SET(ROW")){
            List<String> querys = getQuerys(parts, tablename, newSql);
            result = "CREATE TABLE IF NOT EXISTS " + nf2TabName + "(NAME VARCHAR(60), OBERTABELLE VARCHAR(60));";
            for (String query : querys) {
                result += query;
            }
        }else{
            result = sql;
        }
        return result;
    }

    private static String getSubtableName(String teilDavor){
        String[] words = teilDavor.split(",");
        String lastWord = words[words.length -1];
        if(lastWord.contains("(")){
            words = lastWord.split("\\(");
            lastWord = words[words.length-1];
        }
        return lastWord.trim();
    }

    private static String getTablename(String firstPart){
        String[] parts = firstPart.split(" ");
        parts = parts[2].split("\\(");
        return parts[0];
    }

    private static List<String> getQuerys(String[] parts, String tablename, String newSql){
        List<String> unterTabellen = new ArrayList<>();
        List<String> querys = new ArrayList<>();
        for (int i = 0; i< parts.length; i++) {
            if(i == 0){
                tablename = getTablename(parts[i]);
                String query = "INSERT INTO " + nf2TabName + "(NAME) VALUES('" + tablename + "');";
                querys.add(query);
            }
            else {
                if(parts[i].startsWith("(")){
                    String subtablename = getSubtableName(parts[i-1]);
                    String newTablename = "__" + tablename + "_" + subtablename;
                    String query = "CREATE TABLE " + newTablename + parts[i] + " ," + tablename + "ID INT );";
                    query += "INSERT INTO " + nf2TabName + "(NAME, OBERTABELLE) VALUES(" + "'" + newTablename + "', '"
                            + tablename + "');";
                    String[] subparts = splitAtSETROW(query).toArray(new String[0]);
                    if(subparts.length > 1){
                        subparts[subparts.length-1] = subparts[subparts.length-1].substring(0, subparts[subparts.length-1].length()-1);
                        List<String> subquerys = getQuerys(subparts, subtablename, subparts[0]);
                        querys.addAll(subquerys);
                    }else {
                        unterTabellen.add(subtablename);
                        querys.add(query);
                    }
                    newSql += "ID INT";
                }else{
                    if(!newSql.trim().endsWith(",")) {
                        newSql += ", ";
                    }
                    if(parts[i].trim().startsWith(",")){
                        parts[i] = parts[i].substring(1);
                    }
                    newSql += parts[i];
                }
            }
        }
        newSql += ");";
        querys.add(newSql);
        return querys;
    }

    //Todo: besserer Textsuche Algorithmus aus ADS
    public static List<String> splitAtSETROW(String sql){
        List<String> parts = new ArrayList<>();
        int firstChar = 0;
        for(int i = 0; i<=sql.length()-8; i++){
            String nextChars = "";
            for (int j = 0; j< 7; j++){
                nextChars += sql.charAt(j+i);
            }
            if(nextChars.equals("SET(ROW")){
                parts.add(sql.substring(firstChar, i-1));
                Integer closeBracket = findCloseBracket(sql, i+6);
                parts.add(sql.substring(i+7, closeBracket-2));
                firstChar = closeBracket+1;
                i = firstChar;
            }
        }
        if(firstChar< sql.length()) {
            parts.add(sql.substring(firstChar, sql.length() - 1));
        }
        return parts;
    }


}