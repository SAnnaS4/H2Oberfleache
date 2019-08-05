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
    public List<List<Inhalt>> inhalt;
    public List<Map<String, String>> oldAttributes;
    public List<List<Object>> oldInhalt;

    public Table(List<Map<String, String>> attributes_tablenames, List<List<Object>> inhalt){
        oldAttributes = attributes_tablenames;
        oldInhalt = inhalt;
        int size = attributes_tablenames.size();
        for (int i = 0; i<size; i++){
            for (Map.Entry<String, String> entry : attributes_tablenames.get(i).entrySet()) {
                this.attributes.add(new Attribute(i, entry.getKey(), entry.getValue()));
            }
        }
        List<List<Inhalt>> tabelle = new ArrayList<>();
        for (List<Object> objects : inhalt) {
            List<Inhalt> liste = new ArrayList<>();
            for (Attribute attribute : this.attributes) {
                String convertedToString = String.valueOf(objects.get(attribute.getNummer()));
                Inhalt inhalt1 = new Inhalt(attribute, convertedToString);
                liste.add(inhalt1);
            }
            tabelle.add(liste);
        }
        this.inhalt = tabelle;
    }

    public List<Attribute> getAttribute(){
        return this.attributes;
    }

    @Getter
    @Setter
    public class Attribute {
        private int nummer;
        private String wert;
        private String table;

        public Attribute(int nummer, String wert, String tablename){
            this.nummer = nummer;
            this.wert = wert;
            this.table = tablename;
        }

        public Boolean isIn(List<Attribute> list){
            Boolean isIn = false;
            for (Attribute attribute : list) {
                if(attribute.getWert().equals(this.getWert()) && attribute.getTable().equals(this.getTable())) isIn =true;
            }
            return isIn;
        }
    }

    @Getter
    @Setter
    public class Inhalt {
        private Attribute attribute;
        private String wert;

        public Inhalt(Attribute attribute, String wert){
            this.attribute = attribute;
            this.wert = wert;
        }

        public boolean equals(Inhalt inhalt2){
            return (this.getWert().equals(inhalt2.getWert()) && (this.getAttribute().getNummer() == inhalt2.getAttribute().getNummer()));
        }
    }
}
