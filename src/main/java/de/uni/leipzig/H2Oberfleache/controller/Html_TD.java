package de.uni.leipzig.H2Oberfleache.controller;

import de.uni.leipzig.H2Oberfleache.statementRefactoring.Statement;
import de.uni.leipzig.H2Oberfleache.tables.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class Html_TD {
    private Integer rowspan = 1;
    private Table.Inhalt value;
    private List<List<Html_TD>> subtableTD;
    Map<Integer, List<Html_TD>> attribut_td;
    static List<Integer> usedAttributes;
    List<Table.Attribute> attributes;

    public Html_TD(Integer rowspan, Table.Inhalt value){
        this.rowspan = rowspan;
        this.value = value;
    }

    public Html_TD(List<Table.Attribute> attributes){
        this.attributes = attributes;
        attribut_td = fuelleMap(attributes);
    }

    private Integer makeChildList(String OTschluesselValue, List<String> tablenames, String OTSchluessel,
                                                      Map<String, List<List<Table.Inhalt>>> tablename_inhalt){
        usedAttributes = new ArrayList<>();
        Map<String, List<Integer>> table_rowspan = new HashMap<>();
        for (String tablename : tablenames) {
            table_rowspan.put(tablename, new ArrayList<>());
            List<String> subtables = Statement.getNF2TableNames(tablename);
            String mySchluessel = "__" + tablename + "ID";
            for (List<Table.Inhalt> inhaltList : tablename_inhalt.get(tablename)) {
                String mySchluesselValue = "";
                List<List<Table.Inhalt>> myValues = new ArrayList<>();
                for (Table.Inhalt inhalt : inhaltList) {
                    if((inhalt.getAttribute().getWert().equals(OTSchluessel) && inhalt.getWert().equals(OTschluesselValue)) || OTSchluessel.equals("")){
                        for (Table.Inhalt inhalt1 : inhaltList) {
                            if(!usedAttributes.contains(inhalt1.getAttribute().getNummer()))usedAttributes.add(inhalt1.getAttribute().getNummer());
                            if (inhalt1.getAttribute().getWert().equals(mySchluessel))mySchluesselValue = inhalt1.getWert();
                        }
                        myValues.add(inhaltList);
                        Integer rowspan = 1;
                        if(!subtables.isEmpty()){
                            List<Integer> usedAttributesAlt = usedAttributes;
                            rowspan= makeChildList(mySchluesselValue, subtables, mySchluessel, tablename_inhalt);
                            usedAttributes.addAll(usedAttributesAlt);
                        }
                        for (Table.Inhalt inhalt1 : inhaltList) {
                            Html_TD html_td = new Html_TD(rowspan, inhalt1);
                            attribut_td.get(inhalt1.getAttribute().getNummer()).add(html_td);
                        }
                        table_rowspan.get(tablename).add(rowspan);
                        break;
                    }
                }
            }
        }
        Integer maxLineRowspan = 0;
        for (Map.Entry<String, List<Integer>> entry : table_rowspan.entrySet()) {
            Integer span = 0;
            for (Integer html_td : entry.getValue()) {
                span+=html_td;
            }
            if(span>maxLineRowspan)maxLineRowspan=span;
        }
        Integer maxRowspan = 0;
        Map<Integer, Integer> attribut_rowspan = new HashMap<>();
        for (Map.Entry<Integer, List<Html_TD>> entry : attribut_td.entrySet()) {
            Integer span = 0;
            for (Html_TD html_td : entry.getValue()) {
                span+=html_td.rowspan;
            }
            attribut_rowspan.put(entry.getKey(), span);
            if(span>maxRowspan)maxRowspan=span;
        }
        for (Map.Entry<Integer, Integer> entry : attribut_rowspan.entrySet()) {
            if(entry.getValue()< maxRowspan && usedAttributes.contains(entry.getKey())){
                Integer differenz = maxRowspan-entry.getValue();
                attribut_td.get(entry.getKey()).add(makeLeer(differenz, entry.getKey()));
            }
        }
        return maxLineRowspan;
    }

    private Map<Integer, List<Html_TD>> fuelleMap(List<Table.Attribute> attributes){
        Map<Integer, List<Html_TD>> map = new HashMap<>();
        for (Table.Attribute attribute : attributes) {
            map.put(attribute.getNummer(), new ArrayList<>());
        }
        return map;
    }

    private Html_TD makeLeer(Integer difference, Integer attribtut){
        Table.Inhalt inhalt = new Table.Inhalt(attributes.get(attribtut), "");
        return new Html_TD(difference, inhalt);
    }

    private void cleanMap(){
        attribut_td.entrySet().removeIf(entry -> attributes.get(entry.getKey()).getWert().startsWith("__")
                && attributes.get(entry.getKey()).getWert().endsWith("ID"));
    }

    public String makeHTML(List<String> tablenames, Map<String, List<List<Table.Inhalt>>> tablename_inhalt){
        String body = "<tbody>\n";
        Map<Integer, Integer> attribut_position = new HashMap<>();
        Map<Integer, Integer> nochInRowspan = new HashMap<>();
        for (Table.Attribute attribute : attributes) {
            attribut_position.put(attribute.getNummer(), 0);
            nochInRowspan.put(attribute.getNummer(), 0);
        }
        Integer laenge = makeChildList("", tablenames, "", tablename_inhalt);
        cleanMap();
        for(int i = 0; i<laenge; i++){
            body += "<tr>\n";
            for (Map.Entry<Integer, List<Html_TD>> entry : attribut_td.entrySet()) {
                if(nochInRowspan.get(entry.getKey()) == 0){
                    Html_TD value = entry.getValue().get(attribut_position.get(entry.getKey()));
                    body += "<td rowspan=" + value.rowspan + ">" + value.value.getWert() + "</td>\n";
                    nochInRowspan.put(entry.getKey(), value.rowspan-1);
                    attribut_position.put(entry.getKey(), attribut_position.get(entry.getKey())+1);
                }else nochInRowspan.put(entry.getKey(), nochInRowspan.get(entry.getKey())-1);
            }
            body += "</tr>\n";
        }
        body += "  </tbody>\n ";
        return body;
    }
}
