package de.lubowiecki.tag9;

import java.util.Comparator;

public class VerfuegbarkeitComparator implements Comparator<Produkt> {

    @Override
    public int compare(Produkt o1, Produkt o2) {
        // Datumsvergleich
        return o1.getVerfuegbarSeit().compareTo(o2.getVerfuegbarSeit());
    }
}
