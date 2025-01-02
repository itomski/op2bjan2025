package de.lubowiecki.patterns.composite;


import java.util.ArrayList;
import java.util.List;

public class DocGroup implements Doc {

    private List<Doc> docs = new ArrayList<>();

    public void hinzufuegen(Doc doc) {
        docs.add(doc);
    }

    public void entfernen(Doc doc) {
        docs.remove(doc);
    }

    public void print() {
        System.out.println("Printet alle Dokumente");
        for(Doc doc : docs) {
            doc.print();
        }
    }
}
