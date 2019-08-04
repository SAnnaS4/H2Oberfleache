package de.uni.leipzig.H2Oberfleache.controller;

import de.uni.leipzig.H2Oberfleache.tables.Table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//
  public class HtmlBuilder1 {
//    String html = "";
      List<Table.Attribute> attributeList = new ArrayList<>();
      static Integer verschachtelungsgrad = 1;
//    String css = BaseController.css;
//
//    public HtmlBuilder1(Table table){
//        for (Table.Attribute attribute : table.attributes) {
//        }
//        List<List<Table.Inhalt>> inhalt = table.inhalt;
//        Map<String, List<Table.Attribute>> subTableAtrributes = getSubTableAtrributes(subtablenames, table.attributes);
//        Map<List<Table.Inhalt>, List<List<Table.Inhalt>>> seperatedSubTable = seperateSubTable(inhalt, table.attributes, subTableAtrributes);
//        this.html = makeFinalHtml(table, seperatedSubTable, subTableAtrributes);
//    }
//
//
//    private Map<String, List<Table.Attribute>> getSubTableAtrributes(Map<String, List<String>> table_subtables, List<Table.Attribute> attributes){
//        Map<String, List<Table.Attribute>> subTableAttributes = new HashMap<>();
//        for (String subtablename : subtablenames) {
//            List<String> attributeList = Tables.getAllAttributes(subtablename);
//            if (attributeList.size() > 1) {
//                Integer attributMenge = attributeList.size() - 1;
//                List<Table.Attribute> subAttribute = new ArrayList<>();
//                String idFeeld = subtablename.split("_")[subtablename.split("_").length - 1] + "ID";
//                for (Table.Attribute attribute : attributes) {
//                    if (attribute.getWert().equals(subtablename + "ID")) {
//                        for (int i = 0; i <= attributMenge; i++) {
//                            if (attributeList.contains(attributes.get(attribute.getNummer()-i).getWert())) {
//                                subAttribute.add(attributes.get(attribute.getNummer()-i));
//                            } else break;
//                        }
//                    }
//                }
//                if (!subAttribute.isEmpty()) subTableAttributes.put(idFeeld, subAttribute);
//            }
//        }
//        return subTableAttributes;
//    }
//
//    public Map<List<Table.Inhalt>, List<List<Table.Inhalt>>> seperateSubTable(List<List<Table.Inhalt>> inhalt, List<Table.Attribute> attributes, Map<String,
//            List<Table.Attribute>> subTableAttributes){
//        Map<List<Integer>, List<List<Integer>>> seperatedIDasInt = new HashMap<>();
//        List<Table.Attribute> subAttributes = new ArrayList<>();
//        Map<Integer, Table.Inhalt> nummer_inhalt = new HashMap<>();
//        Integer nummer = 1;
//        for (List<Table.Inhalt> list : inhalt) {
//            for (Table.Inhalt inhalt1 : list) {
//                nummer_inhalt.put(nummer, inhalt1);
//                nummer++;
//            }
//        }
//        for (Map.Entry<String, List<Table.Attribute>> entry : subTableAttributes.entrySet()) {
//            subAttributes.addAll(entry.getValue());
//        }
//        for (List<Table.Inhalt> tuple1 : inhalt) {
//            List<Integer> tuple = new ArrayList<>();
//            List<Integer> subTuple = new ArrayList<>();
//            for (Table.Attribute attribute : attributes) {
//                Table.Inhalt inhaltName = tuple1.get(attribute.getNummer());
//                if(subTableAttributes.containsKey((attribute.getWert()))){
//                    for (Table.Attribute attribute1 : subTableAttributes.get(attribute.getWert())) {
//                        if(!(attribute1.getWert().startsWith("__") && attribute1.getWert().endsWith(attribute.getWert()))) {
//                            subTuple.add(getNummer(nummer_inhalt, tuple1.get(attribute1.getNummer())));
//                        }
//                    }
//                }else if(!subAttributes.contains(attribute)){
//                    tuple.add(getNummer(nummer_inhalt, inhaltName));
//                }
//            }
//            if(seperatedIDasInt.containsKey(tuple)){
//                List<List<Integer>> subTuples = seperatedIDasInt.get(tuple);
//                subTuples.add(subTuple);
//                seperatedIDasInt.put(tuple, subTuples);
//            } else {
//                List<List<Integer>> subTuples = new ArrayList<>();
//                subTuples.add(subTuple);
//                seperatedIDasInt.put(tuple, subTuples);
//            }
//        }
//        Map<List<Table.Inhalt>, List<List<Table.Inhalt>>> seperatedID = changeToInhalt(seperatedIDasInt, nummer_inhalt);
//        return seperatedID;
//    }
//
//    public Map<List<Table.Inhalt>, List<List<Table.Inhalt>>> changeToInhalt(Map<List<Integer>, List<List<Integer>>> seperatedIDasInt,
//                                                                            Map<Integer, Table.Inhalt> nummer_inhalt){
//        Map<List<Table.Inhalt>, List<List<Table.Inhalt>>> changed = new HashMap<>();
//        for (Map.Entry<List<Integer>, List<List<Integer>>> entry : seperatedIDasInt.entrySet()) {
//            List<Table.Inhalt> keyhelper = new ArrayList<>();
//            List<List<Table.Inhalt>> valueHelper = new ArrayList<>();
//            for (Integer integer : entry.getKey()) {
//                keyhelper.add(nummer_inhalt.get(integer));
//            }
//            for (List<Integer> integerList : entry.getValue()) {
//                List<Table.Inhalt> liste = new ArrayList<>();
//                for (Integer integer : integerList) {
//                    liste.add(nummer_inhalt.get(integer));
//                }
//                valueHelper.add(liste);
//            }
//            changed.put(keyhelper, valueHelper);
//        }
//        return changed;
//    }
//
//    public Integer getNummer(Map<Integer, Table.Inhalt> nummer_inhalt, Table.Inhalt inhalt){
//        for (Map.Entry<Integer, Table.Inhalt> entry : nummer_inhalt.entrySet()) {
//            if(entry.getValue().equals(inhalt)) return entry.getKey();
//        }
//        return 0;
//    }
//
//    public String addHeader(Table table, Map<String, List<Table.Attribute>> subTableAtrributes){
//        List<Table.Attribute> subAttributes = new ArrayList<>();
//        for (Map.Entry<String, List<Table.Attribute>> entry : subTableAtrributes.entrySet()) {
//            subAttributes.addAll(entry.getValue());
//        }
//        if (!subAttributes.isEmpty()) verschachtelungsgrad++;
//        String head = "<thead>\n" +
//                "    <tr>\n";
//        String untertabelle = "    <tr>\n";
//        for (Table.Attribute attribute : table.attributes) {
//            if (!attributeList.contains(attribute) && !subAttributes.contains(attribute)) {
//                head += "<th rowspan=\"" + verschachtelungsgrad + "\">" + attribute.getWert() + "</th>\n";
//            }else if(subTableAtrributes.containsKey(attribute.getWert())){
//                Integer colspan = subTableAtrributes.get(attribute.getWert()).size()-1;
//                head += "<th colspan=\"" + colspan + "\">" + attribute.getWert().substring(0, attribute.getWert().length()-2) + "</th>";
//                for (Table.Attribute attribute1 : subTableAtrributes.get(attribute.getWert())) {
//                    if(!attributeList.contains(attribute1)) {
//                        untertabelle += "<th>" + attribute1.getWert() + "</th>\n";
//                    }
//                }
//            }
//        }
//        head += "    </tr>\n" +
//                untertabelle  +
//                "    </tr>\n" +
//                "  </thead>\n ";
//        return head;
//    }
//
    public String addBody(Table table, Map<List<Table.Inhalt>, List<List<Table.Inhalt>>> seperatedSubTable){
        String body = "  <tbody>\n";
        for (Map.Entry<List<Table.Inhalt>, List<List<Table.Inhalt>>> tuple : seperatedSubTable.entrySet()) {
            Integer rowspan = tuple.getValue().size();
            List<String> unterSpalten = new ArrayList<>();
            String hauptspalte = "";
            for (Table.Attribute attribute : table.attributes) {
                if (!attributeList.contains(attribute)) {
                    for (Table.Inhalt inhalt : tuple.getKey()) {
                        if(inhalt.getAttribute().getNummer() == attribute.getNummer()){
                            hauptspalte += "      <td rowspan=\" " + rowspan + "\">" + inhalt.getWert() + "</td>\n";
                            break;
                        }
                    }
                    for(int i = 0; i<tuple.getValue().size(); i++){
                        String neueUnterSpalte = "";
                        for (Table.Inhalt inhalt : tuple.getValue().get(i)) {
                            if(inhalt.getAttribute().getNummer() == attribute.getNummer()){
                                neueUnterSpalte = "      <td>" + inhalt.getWert() + "</td>\n";
                                if(i == 0){
                                    hauptspalte += neueUnterSpalte;
                                }else {
                                    if(unterSpalten.size()-2 < i){
                                        unterSpalten.add("");
                                    }
                                    String neu = unterSpalten.get(i-1);
                                    neu += neueUnterSpalte;
                                    unterSpalten.set(i-1, neu);
                                }
                                break;
                            }
                        }
                    }
                }
            }
            body += "    <tr>\n" +
                    hauptspalte;
            for (String s : unterSpalten) {
                body += "    </tr><tr>\n" +
                        s;
            }
            body += "    </tr>\n";
        }
        body += "  </tbody>\n";
        return body;
    }
//
//    public String makeFinalHtml(Table table, Map<List<Table.Inhalt>, List<List<Table.Inhalt>>> seperatedSubTable,
//                                Map<String, List<Table.Attribute>> subTableAtrributes){
//        return css +
//                "<table border=\"1\">\n" +
//                addHeader(table, subTableAtrributes) +
//                "\n" +
//                addBody(table, seperatedSubTable) +
//                "</table>";
//    }
//
//
 }
