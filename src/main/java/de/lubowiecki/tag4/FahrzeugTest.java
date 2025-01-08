package de.lubowiecki.tag4;

import de.lubowiecki.mylib.Fahrzeug;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FahrzeugTest {

    public static void main(String[] args) {
        Fahrzeug f1 = new Fahrzeug("HH:AB123", "VW", "Polo", 2020);
        Fahrzeug f2 = new Fahrzeug("HH:XY223", "Ford", "Capri", 2024);
        Fahrzeug f3 = new Fahrzeug("A:AB229", "Renault", "Clio", 2022);

        List<Fahrzeug> list = new ArrayList<>();
        list.add(f1);
        list.add(f2);
        list.add(f3);

        System.out.println(list);

        //Collections.sort(list); // Verwendet das Comparable von Fahrzeug
        //Collections.sort(list, (a, b) -> a.getBaujahr() - b.getBaujahr()); // Mit Lambda
        Collections.sort(list, Comparator.comparing(Fahrzeug::getMarke)); // Methoden-Referenz

        System.out.println(list);

    }
}
