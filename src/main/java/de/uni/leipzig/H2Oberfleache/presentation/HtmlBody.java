package de.uni.leipzig.H2Oberfleache.presentation;

import de.uni.leipzig.H2Oberfleache.statementRefactoring.Statement;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class HtmlBody {
    private Integer rowspan = 1;
    private Table.Content value;
    private List<List<HtmlBody>> subtableTD;
    Map<Integer, List<HtmlBody>> attribut_td;
    static List<Integer> usedAttributes;
    List<Table.Attribute> attributes;
    Map<String, List<Table.Attribute>> tablename_attribute;
    List<String> mainTables = new ArrayList<>();
    UserDetails userDetails;

    private HtmlBody(Integer rowspan, Table.Content value, UserDetails userDetails){
        this.userDetails = userDetails;
        this.rowspan = rowspan;
        this.value = value;
    }

    public HtmlBody(List<Table.Attribute> attributes, Map<String, List<Table.Attribute>> tablename_attribute, UserDetails userDetails){
        this.userDetails = userDetails;
        this.attributes = attributes;
        this.tablename_attribute=tablename_attribute;
        attribut_td = fillMap(attributes);
        usedAttributes = new ArrayList<>();
    }

    private Integer makeChildList(String OTschluesselValue, List<String> tablenames, String OTSchluessel,
                                                      Map<String, List<List<Table.Content>>> tablename_inhalt, List<Table.Attribute> attributes){
        usedAttributes = new ArrayList<>();
        Map<String, List<Integer>> table_rowspan = new HashMap<>();
        for (String tablename : tablenames) {
                table_rowspan.put(tablename, new ArrayList<>());
            if (tablename_inhalt.containsKey(tablename)) {
                List<String> subtables = Statement.getNF2TableNames(tablename, userDetails);
                String mySchluessel = "__" + tablename + "ID";
                for (List<Table.Content> contentList : tablename_inhalt.get(tablename)) {
                    String mySchluesselValue = "";
                    for (Table.Content content : contentList) {
                        if ((content.getAttribute().getName().equals(OTSchluessel) && content.getValue().equals(OTschluesselValue)) || OTSchluessel.equals("")) {
                            for (Table.Content content1 : contentList) {
                                if (!usedAttributes.contains(content1.getAttribute().getNumber()))
                                    usedAttributes.add(content1.getAttribute().getNumber());
                                if (content1.getAttribute().getName().equals(mySchluessel))
                                    mySchluesselValue = content1.getValue();
                            }
                            Integer rowspan = 1;
                            if(!tableIsConcerned(tablename))rowspan=0;
                            if (!subtables.isEmpty() || userDetails.ober_untertabelle.containsKey(tablename) || tablename.equals("main")) {
                                List<Integer> usedAttributesAlt = usedAttributes;
                                if (!subtables.isEmpty()) {
                                    int newRowspan = makeChildList(mySchluesselValue, subtables, mySchluessel, tablename_inhalt, attributes);
                                    if (newRowspan > rowspan) rowspan = newRowspan;
                                }
                                if (userDetails.ober_untertabelle.containsKey(tablename)) {
                                    List<String> subtable = new ArrayList<>();
                                    subtable.add(userDetails.ober_untertabelle.get(tablename));
                                    String nestSchluessel = "__" + subtable.get(0) + "ID";
                                    String nestMySchluessel = "";
                                    for (Table.Content attribute : contentList) {
                                        if (attribute.getAttribute().getName().equals(nestSchluessel))
                                            nestMySchluessel = attribute.getValue();
                                    }
                                    int newRowspan = makeChildList(nestMySchluessel, subtable, nestSchluessel, tablename_inhalt, attributes);
                                    if (newRowspan > rowspan) rowspan = newRowspan;
                                }
                                if (tablename.equals("main")) {
                                    for (String mainTable : mainTables) {
                                        List<String> subtable = Statement.getNF2TableNames(mainTable, userDetails);
                                        String nestSchluessel = "__" + mainTable + "ID";
                                        String nestMySchluessel = "";
                                        for (Table.Content attribute : contentList) {
                                            if (attribute.getAttribute().getName().equals(nestSchluessel))
                                                nestMySchluessel = attribute.getValue();
                                        }
                                        if (nestMySchluessel.contains("2")) {
                                            System.out.println();
                                        }
                                        int newRowspan = makeChildList(nestMySchluessel, subtable, nestSchluessel, tablename_inhalt, attributes);
                                        if (newRowspan > rowspan) rowspan = newRowspan;
                                    }
                                }
                                usedAttributes.addAll(usedAttributesAlt);
                            }
                                for (Table.Content content1 : contentList) {
                                    HtmlBody html_td = new HtmlBody(rowspan, content1, userDetails);
                                    attribut_td.getOrDefault(content1.getAttribute().getNumber(), new ArrayList<>()).add(html_td);
                                }
                                table_rowspan.get(tablename).add(rowspan);
                                break;
                        }
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
        Map<Integer, Integer> attribute_rowspan = new HashMap<>();
        for (Map.Entry<Integer, List<HtmlBody>> entry : attribut_td.entrySet()) {
            Integer span = 0;
            for (HtmlBody html_td : entry.getValue()) {
                span+=html_td.rowspan;
            }
            attribute_rowspan.put(entry.getKey(), span);
            if(span>maxRowspan)maxRowspan=span;

        }
        for (Map.Entry<Integer, Integer> entry : attribute_rowspan.entrySet()) {
            if(entry.getValue()< maxRowspan && usedAttributes.contains(entry.getKey())){
                Integer difference = maxRowspan-entry.getValue();
                attribut_td.getOrDefault(entry.getKey(), new ArrayList<>()).add(makeEmpty(difference, entry.getKey()));
            }
        }
        for (String tablename : tablenames) {
            if(!table_rowspan.containsKey(tablename) && tableIsConcerned(tablename)){
                for (Table.Attribute attribute : attributes) {
                    if(attribute.getTable().equals(tablename)){
                        attribut_td.getOrDefault(attribute.getNumber(), new ArrayList<>()).add(makeEmpty(1, attribute.getNumber()));
                    }
                }
            }
        }
        return maxLineRowspan;
    }

    private Map<Integer, List<HtmlBody>> fillMap(List<Table.Attribute> attributes){
        Map<Integer, List<HtmlBody>> map = new HashMap<>();
        for (Table.Attribute attribute : attributes) {
            map.put(attribute.getNumber(), new ArrayList<>());
        }
        return map;
    }

    private HtmlBody makeEmpty(Integer difference, Integer attribute){
        Table.Content content = new Table.Content(attributes.get(attribute), "");
        return new HtmlBody(difference, content, userDetails);
    }

    private void cleanMap(){
        attribut_td.entrySet().removeIf(entry -> attributes.get(entry.getKey()).getName().startsWith("__")
                && attributes.get(entry.getKey()).getName().endsWith("ID"));
    }

    private boolean tableIsConcerned(String tablename){
        if(mainTables.contains(tablename))return true;
        if (tablename.equals("main"))return true;
        for (Table.Attribute attribute : tablename_attribute.get(tablename)) {
            if(!(attribute.getName().startsWith("__") && attribute.getName().endsWith("ID")))return true;
        }
        return false;
    }

    public String makeHTML(List<String> tablenames, Map<String, List<List<Table.Content>>> tablename_inhalt, List<Table.Attribute> attributes){
        this.mainTables = tablenames;
        List<String> main = Collections.singletonList("main");
        StringBuilder body = new StringBuilder("<tbody>\n");
        Map<Integer, Integer> attribute_position = new HashMap<>();
        Map<Integer, Integer> nochInRowspan = new HashMap<>();
        for (Table.Attribute attribute : attributes) {
            attribute_position.put(attribute.getNumber(), 0);
            nochInRowspan.put(attribute.getNumber(), 0);
        }
        Integer laenge = makeChildList("", main, "", tablename_inhalt, attributes);
        cleanMap();
        for(int i = 0; i<laenge; i++){
            body.append("<tr>\n");
            for (Map.Entry<Integer, List<HtmlBody>> entry : attribut_td.entrySet()) {
                if(nochInRowspan.get(entry.getKey()) == 0){
                    HtmlBody value;
                    try {
                        value = entry.getValue().get(attribute_position.get(entry.getKey()));
                    } catch (Exception e) {
                        value = makeEmpty(1, entry.getKey());
                    }
                    body.append("<td rowspan=").append(value.rowspan).append(">").append(value.value.getValue()).append("</td>\n");
                    nochInRowspan.put(entry.getKey(), value.rowspan-1);
                    attribute_position.put(entry.getKey(), attribute_position.get(entry.getKey())+1);
                }else nochInRowspan.put(entry.getKey(), nochInRowspan.get(entry.getKey())-1);
            }
            body.append("</tr>\n");
        }
        body.append("  </tbody>\n ");
        return body.toString();
    }
}
