package de.uni.leipzig.H2Oberfleache.controller;

import de.uni.leipzig.H2Oberfleache.statementRefactoring.Statement;
import de.uni.leipzig.H2Oberfleache.tables.Table;

import java.util.*;

public class HtmlBuilder1 {
//    String html = "";
//    String css = BaseController.css;
//    Map<Integer, List<Table.Attribute>> hirarchie_attributes = new HashMap<>();
//    String highestTablename = "";
//    List<Integer> ids = new ArrayList<>();
//
//    public HtmlBuilder(Table table, String sql) {
//        Map<String, List<Table.Attribute>> tabelname_Attribute = new HashMap<>();
//        for (Table.Attribute attribute : table.attributes) {
//            if(!tabelname_Attribute.containsKey(attribute.getTable())){
//                List<Table.Attribute> attributes = new ArrayList<>();
//                attributes.add(attribute);
//                tabelname_Attribute.put(attribute.getTable(), attributes);
//            }else {
//                List<Table.Attribute> attributes = tabelname_Attribute.get(attribute.getTable());
//                attributes.add(attribute);
//                tabelname_Attribute.put(attribute.getTable(), attributes);
//            }
//        }
//        String head = addHead(table.attributes, tabelname_Attribute);
//        // List<List<Table.Inhalt>> inhalt = updateInhalt(table.inhalt, tabelname_Attribute);
//        html = makeFinalHtml(table.inhalt, head, table.attributes, tabelname_Attribute);
//    }
//
//    private List<List<Table.Inhalt>> updateInhalt(List<List<Table.Inhalt>> inhalt, Map<String, List<Table.Attribute>> tabelname_Attribute){
//        Map<String, List<List<Table.Inhalt>>> tablename_inhalt = getTablename_Inhalt(inhalt, tabelname_Attribute);
//        String mySchluessel = "__" + highestTablename + "ID";
//        List<List<Table.Inhalt>> myInhalt = new ArrayList<>();
//        List<String> subtables = Statement.getNF2TableNames(highestTablename);
//        for (List<Table.Inhalt> inhaltList : tablename_inhalt.get(highestTablename)) {
//            String mySchluesselValue = "";
//            for (Table.Inhalt inhalt2 : inhaltList) {
//                if(inhalt2.getAttribute().getWert().equals(mySchluessel))mySchluesselValue = inhalt2.getWert();
//            }
//            if(!subtables.isEmpty()){
//                myInhalt.addAll(rekursivTest(mySchluesselValue, subtables, mySchluessel, tablename_inhalt, inhaltList));
//            }else myInhalt.add(inhaltList);
//        }
//        return myInhalt;
//    }
//
//    private List<List<Table.Inhalt>> rekursivTest(String OTschluesselValue, List<String> tablenames, String OTSchluessel,
//                                                  Map<String, List<List<Table.Inhalt>>> tablename_inhalt,
//                                                  List<Table.Inhalt> newInhalt){
//        Map<String, List<List<Table.Inhalt>>> table_myInhalt = new HashMap<>();
//        Integer maxRows = 0;
//        for (String tablename : tablenames) {
//            List<List<Table.Inhalt>> myInhalt = new ArrayList<>();
//            String mySchluessel = "__" + tablename + "ID";
//            for (List<Table.Inhalt> inhaltList : tablename_inhalt.get(tablename)) {
//                for (Table.Inhalt inhalt : inhaltList) {
//                    if(inhalt.getAttribute().getWert().equals(OTSchluessel) && inhalt.getWert().equals(OTschluesselValue)){
//                        List<String> subtables = Statement.getNF2TableNames(tablename);
//                        String mySchluesselValue = "";
//                        for (Table.Inhalt inhalt1 : inhaltList) {
//                            if(inhalt1.getAttribute().getWert().equals(mySchluessel))mySchluesselValue = inhalt1.getWert();
//                        }
//                        if(!subtables.isEmpty()){
//                            myInhalt.addAll(rekursivTest(mySchluesselValue, subtables, mySchluessel, tablename_inhalt, inhaltList));
//                        }else myInhalt.add(inhaltList);
//                    }
//                }
//            }
//            if(maxRows < myInhalt.size()-1)maxRows = myInhalt.size()-1;
//            table_myInhalt.put(tablename, myInhalt);
//        }
//        List<List<Table.Inhalt>> resultInhalt = new ArrayList<>();
//        for(int i = 0; i<= maxRows; i++){
//            Map<Integer, Table.Inhalt> position_Inhalt = new HashMap<>();
//            Integer highest = 0;
//            for (Table.Inhalt inhalt : newInhalt) {
//                position_Inhalt.put(inhalt.getAttribute().getNummer(), inhalt);
//                if(inhalt.getAttribute().getNummer()>highest)highest = inhalt.getAttribute().getNummer();
//            }
//            for (Map.Entry<String, List<List<Table.Inhalt>>> entry : table_myInhalt.entrySet()) {
//                if(entry.getValue().size()>i) {
//                    for (Table.Inhalt inhalt : entry.getValue().get(i)) {
//                        position_Inhalt.put(inhalt.getAttribute().getNummer(), inhalt);
//                        if(inhalt.getAttribute().getNummer()>highest)highest = inhalt.getAttribute().getNummer();
//                    }
//                }else{
//                    for (Table.Inhalt inhalt : entry.getValue().get(0)) {
//                        Table.Inhalt neu = new Table.Inhalt(inhalt.getAttribute(), "");
//                        position_Inhalt.put(inhalt.getAttribute().getNummer(), neu);
//                        if(inhalt.getAttribute().getNummer()>highest)highest = inhalt.getAttribute().getNummer();
//                    }
//                }
//            }
//            List<Table.Inhalt> result = new ArrayList<>();
//            for(int j = 0; j <= highest; j++){
//                if(position_Inhalt.containsKey(j))result.add(position_Inhalt.get(j));
//            }
//            resultInhalt.add(result);
//        }
//        return resultInhalt;
//    }
//
//    private Map<String, List<List<Table.Inhalt>>> getTablename_Inhalt(List<List<Table.Inhalt>> inhalt, Map<String, List<Table.Attribute>> tabelname_Attribute){
//        Map<String, List<List<Table.Inhalt>>> tabelname_Inhalte = new HashMap<>();
//        for (Map.Entry<String, List<Table.Attribute>> entry : tabelname_Attribute.entrySet()) {
//            String tablename = entry.getKey();
//            List<List<Table.Inhalt>> tupelList = new ArrayList<>();
//            for (List<Table.Inhalt> list : inhalt) {
//                List<Table.Inhalt> tupel = new ArrayList<>();
//                for (Table.Attribute attribute : entry.getValue()) {
//                    tupel.add(list.get(attribute.getNummer()));
//                }
//                tupelList.add(tupel);
//            }
//            tabelname_Inhalte.put(tablename, tupelList);
//        }
//        Map<String, List<List<Table.Inhalt>>> newtabelname_Inhalte = new HashMap<>();
//        for (Map.Entry<String, List<List<Table.Inhalt>>> table : tabelname_Inhalte.entrySet()) {
//            int schluessel = 0;
//            List<List<Table.Inhalt>> newInhalt = new ArrayList<>();
//            for (Table.Attribute attribute : tabelname_Attribute.get(table.getKey())) {
//                if(attribute.getWert().equals("__" + table.getKey() + "ID"))schluessel=attribute.getNummer();
//            }
//            List<String> schluesselList = new ArrayList<>();
//            for (List<Table.Inhalt> tupel : table.getValue()) {
//                String wert = "";
//                for (Table.Inhalt inhalt1 : tupel) {
//                    if(inhalt1.getAttribute().getWert().equals("__" + table.getKey() + "ID"))wert=inhalt1.getWert();
//                }
//                if(!schluesselList.contains(wert)){
//                    newInhalt.add(tupel);
//                    schluesselList.add(wert);
//                }
//            }
//            newtabelname_Inhalte.put(table.getKey(), newInhalt);
//        }
//        return newtabelname_Inhalte;
//    }
//
//    private Map<String, Integer> getHoechsteSchachtelung(Map<String, List<Table.Attribute>> tabelname_Attribute, List<Table.Attribute> attribute){
//        List<String> tables = new ArrayList<>();
//        Integer tiefe = 0;
//        String highestTable = "";
//        for (Table.Attribute attribut : attribute) {
//            if(!tables.contains(attribut.getTable())) {
//                Integer neu = tiefe(tabelname_Attribute, attribut.getTable(), "");
//                if(neu > tiefe){
//                    highestTable = attribut.getTable();
//                    tiefe=neu;
//                }
//                tables.add(attribut.getTable());
//            }
//        }
//        Map<String, Integer> result = new HashMap<>();
//        result.put(highestTable, tiefe);
//        return result;
//    }
//
//    private Integer getColspan(Map<String, List<Table.Attribute>> tabelname_Attribute, String tablename){
//        Integer colspan = 0;
//        for (Table.Attribute attribute : tabelname_Attribute.get(tablename)) {
//            if(!ids.contains(attribute.getNummer()))++colspan;
//        }
//        List<String> subtables = Statement.getNF2TableNamesRec(tablename);
//        for (String subtable : subtables) {
//            if(tabelname_Attribute.containsKey(subtable)){
//                for (Table.Attribute attribute : tabelname_Attribute.get(subtable)) {
//                    if(!ids.contains(attribute.getNummer()))++colspan;
//                }
//            }
//        }
//        return colspan;
//    }
//
//    private Integer tiefe(Map<String, List<Table.Attribute>> tabelname_Attribute, String tablename, String zielTabelle){
//        List<String> subtables = Statement.getNF2TableNames(tablename);
//        Integer highestSubtable = 0;
//        Boolean isNested = false;
//        if(tablename.equals(zielTabelle))return 0;
//        for (String subtable : subtables) {
//            if(subtable.equals(zielTabelle))return 1;
//            if(tabelname_Attribute.containsKey(subtable)){
//                Integer neu = tiefe(tabelname_Attribute, subtable, zielTabelle);
//                if(neu > highestSubtable) highestSubtable = neu;
//                isNested = true;
//            }
//        }
//        if(isNested)highestSubtable += 1;
//        return highestSubtable;
//    }
//
//    private String addHead(List<Table.Attribute> attributes, Map<String, List<Table.Attribute>> tabelname_Attribute){
//        String head = "<thead>\n";
//        for (Table.Attribute attribute : attributes) {
//            if (attribute.getWert().startsWith("__") && attribute.getWert().endsWith("ID")) {
//                ids.add(attribute.getNummer());
//            }
//        }
//        for(Iterator<Map.Entry<String, List<Table.Attribute>>> it = tabelname_Attribute.entrySet().iterator(); it.hasNext(); ) {
//            Map.Entry<String, List<Table.Attribute>> entry = it.next();
//            Boolean nurIDs = true;
//            for (Table.Attribute attribute : entry.getValue()) {
//                if(!ids.contains(attribute.getNummer()))nurIDs = false;
//            }
//            if (nurIDs)it.remove();
//        }
//        Map<String, Integer> highestTable_hoehe = getHoechsteSchachtelung(tabelname_Attribute, attributes);
//        Integer groessteHoehe = 0;
//        for (Map.Entry<String, Integer> entry : highestTable_hoehe.entrySet()) {
//            highestTablename = entry.getKey();
//            groessteHoehe = entry.getValue();
//        }
//        Integer attributCounter = 0;
//        Integer hirarchie = 0;
//        Integer hoehe = 0;
//        List<String> schonEnthalten = new ArrayList<>();
//        while (attributCounter < attributes.size()-ids.size()) {
//            List<Table.Attribute> neueListe = new ArrayList<>();
//            head += "    <tr>\n";
//            for (Table.Attribute attribute : attributes) {
//                if (tabelname_Attribute.containsKey(attribute.getTable())) {
//                    Integer tiefe = tiefe(tabelname_Attribute, highestTablename, attribute.getTable());
//                    if (tiefe == hoehe) {
//                        if (!ids.contains(attribute.getNummer())) {
//                            head += "<th rowspan=\"" + (groessteHoehe - hoehe + 1) + "\">" + attribute.getWert() + "</th>\n";
//                            attributCounter++;
//                        }
//                        neueListe.add(attribute);
//                    }
//                    if (tiefe == hoehe + 1 && !schonEnthalten.contains(attribute.getTable())) {
//                        head += "<th colspan=\"" + getColspan(tabelname_Attribute, attribute.getTable()) + "\">" +
//                                getTablename(attribute.getTable()) + "</th>";
//                        schonEnthalten.add(attribute.getTable());
//                    }
//                }
//            }
//            hirarchie_attributes.put(hirarchie, neueListe);
//            head += "    </tr>\n";
//            hoehe++;
//            hirarchie++;
//        }
//        head += "  </thead>\n ";
//        return head;
//    }
//
//    private String getTablename(String tablename){
//        String[] names = tablename.split("_");
//        return names[names.length-1];
//    }
//
//    private List<Map<Integer, String>> getPosition_value(List<List<Table.Inhalt>> inhalt, Map<String, List<Table.Attribute>> tabelname_Attribute){
//        Map<String, List<List<Table.Inhalt>>> tablename_inhalt = getTablename_Inhalt(inhalt, tabelname_Attribute);
//        String mySchluessel = "__" + highestTablename + "ID";
//        List<Map<Integer, String>>  position_value = new ArrayList<>();
//        List<List<Table.Inhalt>> myInhalt = new ArrayList<>();
//        List<String> subtables = Statement.getNF2TableNames(highestTablename);
//        List<String> tablenames = new ArrayList<>();
//        tablenames.add(highestTablename);
//        position_value = getTds("", tablenames, "", tablename_inhalt);
//        return position_value;
//    }
//
//    private List<Map<Integer, String>> getTds(String OTschluesselValue, List<String> tablenames, String OTSchluessel,
//                                              Map<String, List<List<Table.Inhalt>>> tablename_inhalt){
//        List<Map<Integer, String>> position_value = new ArrayList<>();
//        for (String tablename : tablenames) {
//            String mySchluessel = "__" + tablename + "ID";
//            for (List<Table.Inhalt> inhaltList : tablename_inhalt.get(tablename)) {
//                List<String> subtables = Statement.getNF2TableNames(tablename);
//                String mySchluesselValue = "";
//                for (Table.Inhalt inhalt : inhaltList) {
//                    if((inhalt.getAttribute().getWert().equals(OTSchluessel) && inhalt.getWert().equals(OTschluesselValue)) || OTSchluessel.equals("")){
//                        for (Table.Inhalt inhalt1 : inhaltList) {
//                            if (inhalt1.getAttribute().getWert().equals(mySchluessel))
//                                mySchluesselValue = inhalt1.getWert();
//                        }
//                    }
//                    Integer rowspan = 0;
//                    List<Map<Integer, String>> subValues = new ArrayList<>();
//                    if(!subtables.isEmpty()){
//                        subValues = getTds(mySchluesselValue, subtables, mySchluessel, tablename_inhalt);
//                        rowspan = subValues.size();
//                    }
//                    Map<Integer, String> map = new HashMap<>();
//                    for (Table.Inhalt inhalt1 : inhaltList) {
//                        String html = "<td rowspan=" + rowspan + ">" + inhalt1.getWert() + "</td>\n";
//                        map.put(inhalt.getAttribute().getNummer(), html);
//                        if(!subValues.isEmpty())map.putAll(subValues.get(0));
//                    }
//                    position_value.add(map);
//                    for(int i = 1; i< subValues.size(); i++){
//                        Map<Integer, String> map1 = subValues.get(i);
//                        position_value.add(map1);
//                    }
//                }
//            }
//        }
//        return position_value;
//    }
//
//    private String addBody(List<List<Table.Inhalt>> inhalt, List<Table.Attribute> attributes, Map<String, List<Table.Attribute>> tabelname_Attribute){
//        String body = "<tbody>\n";
//        List<Map<Integer, String>> trList = getPosition_value(inhalt, tabelname_Attribute);
//        Integer counter = 0;
//        Integer position = 0;
//        for (Map<Integer, String> map : trList) {
//            for (Map.Entry<Integer, String> entry : map.entrySet()) {
//                if(position >= entry.getKey()){
//                    if(counter != 0) body += "    </tr><tr>\n";
//                    else body += "    <tr>\n";
//                    counter++;
//                }
//                position = entry.getKey();
//                if(!ids.contains(position)) {
//                    body += entry.getValue();
//                }
//            }
//        }
//
//        body += "  </tbody>\n ";
//        return body;
//    }
//
//    private List<Map<Integer, String>> getNewTubleList(List<String> IDs, List<Table.Attribute> attributes, List<List<Table.Inhalt>> zeilen, Integer ebende){
//        List<Map<Integer, String>> schonGenutzteIDs = new ArrayList<>();
//        List<List<List<Table.Inhalt>>> newTubleList = new ArrayList<>();
//        List<Map<Integer, String>> trs = new ArrayList<>();
//        List<Integer> hauptIDs = new ArrayList<>();
//        List<Table.Attribute> highestAttributes = hirarchie_attributes.get(ebende);
//        for (Table.Attribute attribute : attributes) {
//            if (attribute.isIn(highestAttributes)) {
//                String idName = "__" + attribute.getTable() + "ID";
//                if (attribute.getWert().equals(idName)) {
//                    hauptIDs.add(attribute.getNummer());
//                    IDs.add(attribute.getWert());
//                }
//            }
//        }
//        for (List<Table.Inhalt> inhalt : zeilen) {
//            List<List<Table.Inhalt>> newTuble = new ArrayList<>();
//            Map<Integer, String> id_value = new HashMap<>();
//            for (Integer hauptID : hauptIDs) {
//                id_value.put(hauptID, inhalt.get(hauptID).getWert());
//            }
//            if(!schonGenutzteIDs.contains(id_value) || id_value.isEmpty()) {
//                schonGenutzteIDs.add(id_value);
//                for (List<Table.Inhalt> tuple : zeilen) {
//                    Boolean partOfTuple = true;
//                    for (Map.Entry<Integer, String> entry : id_value.entrySet()) {
//                        if (!tuple.get(entry.getKey()).getWert().equals(entry.getValue())) partOfTuple = false;
//                    }
//                    if (partOfTuple)newTuble.add(tuple);
//                }
//                List<Map<Integer, String>> attribut_tds = new ArrayList<>();
//                Integer rowspan = newTuble.size();
//                if(!hirarchie_attributes.containsKey(ebende+1))rowspan = 1;
//                List<Map<Integer, String>> nextLine = new ArrayList<>();
//                for (Table.Attribute hauptAtt : highestAttributes) {
//                    String html = "";
//                    if (rowspan <= 1) html = "      <td>" + inhalt.get(hauptAtt.getNummer()).getWert() + "</td>\n";
//                    else
//                        html = "      <td rowspan=\" " + rowspan + "\">" + inhalt.get(hauptAtt.getNummer()).getWert() + "</td>\n";
//                    Map<Integer, String> helper = new HashMap<>();
//                    helper.put(hauptAtt.getNummer(), html);
//                    nextLine.add(helper);
//                }
//                if(hirarchie_attributes.containsKey(ebende+1)) {
//                    List<Map<Integer, String>> neu = getNewTubleList(IDs, attributes, newTuble, (ebende+1));
//                    Integer anzahl = 0;
//                    for (Table.Attribute attribute : attributes) {
//                        for (Map<Integer, String> map : neu) {
//                            Integer nummer = 0;
//                            for (Map.Entry<Integer, String> entry : map.entrySet()) {
//                                nummer = entry.getKey();
//                            }
//                            if(nummer == attribute.getNummer()){
//                                attribut_tds.add(map);
//                                anzahl++;
//                                break;
//                            }
//                        }
//                        for (Map<Integer, String> map : nextLine) {
//                            Integer nummer = 0;
//                            for (Map.Entry<Integer, String> entry : map.entrySet()) {
//                                nummer = entry.getKey();
//                            }
//                            if(nummer == attribute.getNummer()){
//                                attribut_tds.add(map);
//                                break;
//                            }
//                        }
//                    }
//                    for (int i = anzahl; i< neu.size(); i++) {
//                        attribut_tds.add(neu.get(i));
//                    }
//                }else attribut_tds = nextLine;
//                trs.addAll(attribut_tds);
//                newTubleList.add(newTuble);
//            }
//        }
//        return trs;
//    }
//
//    private String makeFinalHtml(List<List<Table.Inhalt>> inhalt, String head, List<Table.Attribute> attributes, Map<String, List<Table.Attribute>> tabelname_Attribute){
//        return css +
//                "<table border=\"1\">\n" +
//                head +
//                "\n" +
//                addBody(inhalt, attributes, tabelname_Attribute) +
//                "</table>";
//    }
 }
