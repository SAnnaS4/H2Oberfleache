package de.uni.leipzig.H2Oberfleache.tables;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Table {
    public String name = "result";
    public List<Attribute> attributes = new ArrayList<>();
    public List<List<Content>> content;
    public List<Map<String, String>> oldAttributes;
    public List<List<String>> oldContent;

    public Table(List<Map<String, String>> attributes_tablenames, List<List<String>> content){
        oldAttributes = attributes_tablenames;
        oldContent = content;
        int size = attributes_tablenames.size();
        for (int i = 0; i<size; i++){
            for (Map.Entry<String, String> entry : attributes_tablenames.get(i).entrySet()) {
                this.attributes.add(new Attribute(i, entry.getKey(), entry.getValue()));
            }
        }
        List<List<Content>> table = new ArrayList<>();
        for (List<String> objects : content) {
            List<Content> list = new ArrayList<>();
            for (Attribute attribute : this.attributes) {
                Content content1 = new Content(attribute, String.valueOf(objects.get(attribute.getNumber())));
                list.add(content1);
            }
            table.add(list);
        }
        this.content = table;
    }

    public List<Attribute> getAttribute(){
        return this.attributes;
    }

    @Getter
    @Setter
    public class Attribute {
        private int number;
        private String name;
        private String table;

        private Attribute(int number, String name, String tablename){
            this.number = number;
            this.name = name;
            this.table = tablename;
        }

        public Boolean isIn(List<Attribute> list){
            boolean isIn = false;
            for (Attribute attribute : list) {
                if(attribute.getName().equals(this.getName()) && attribute.getTable().equals(this.getTable())) isIn =true;
            }
            return isIn;
        }
    }

    @Getter
    @Setter
    public static class Content {
        private Attribute attribute;
        private String value;

        public Content(Attribute attribute, String value){
            this.attribute = attribute;
            this.value = value;
        }

        public boolean equals(Content content2){
            return (this.getValue().equals(content2.getValue()) && (this.getAttribute().getNumber() == content2.getAttribute().getNumber()));
        }
    }
}
