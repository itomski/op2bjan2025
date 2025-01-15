package de.lubowiecki.tag9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductRepository implements Repository<Produkt> {

    private final List<Produkt> produkte;

    public ProductRepository() {
        produkte = new ArrayList<>();
    }

    /**
     * Gibt eine nicht veränderbare Kopie der Liste zurück
      */
    public List<Produkt> getAll() {
        return Collections.unmodifiableList(produkte);
    }

    public void add(Produkt produkt) {
        produkte.add(produkt);
    }

    public void sort() {
        // produkte.sort(); // Error: Verlangt einen Comparator
        // Collections.sort(produkte); // Error: Produkt-Objekte sind nicht vergleichbar

        // Java kann nicht atomatisch entscheiden, welche Eigenschaft der Produkts
        // für den Vergleich benutzt werden soll - das definiert man im Comparator

        // Comparator nimmt zwei Objekte entgegen und entscheidet anhand seiner Implementierung
        // ob das erste größer/gleich oder kleiner ist als das zweite

        // Als Lambda
        // Produkt soll mit einem anderen Produkt verglichen werden
        // int compare(T o1, T o2); // T = Produkt
        // minus = p1 ist kleiner als p2
        // plus = p1 ist größer als p2
        // 0 = p1 und p2 sind gleich
        Comparator<Produkt> nachAnzahl = (p1, p2) -> p1.getAnzahl() - p2.getAnzahl();
        Comparator<Produkt> nachPreis = (p1, p2) -> Double.compare(p1.getPreis(), p2.getPreis());

        // Als anonyme Klasse
        Comparator<Produkt> nachName = new Comparator<Produkt>() {
            @Override
            public int compare(Produkt o1, Produkt o2) {
                // Lexikographischer Stringvergleich
                return o1.getName().compareTo(o2.getName());
            }
        };

        //produkte.sort(nachName);

        // Als konkrete Klasse
        produkte.sort(new VerfuegbarkeitComparator());
    }
}
