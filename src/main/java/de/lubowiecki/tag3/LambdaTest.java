package de.lubowiecki.tag3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest {

    public static void main(String[] args) {

        Machbar m = null;

        // Das Lambda ist die Implementierung/Umsetzung der abstrakten Methode
        m = () -> System.out.println("Ich mache dies und das...");
        m.machEs();

        m = () -> System.out.println("Bla bla bla...");
        m.machEs();

        m = () -> System.out.println("Das ist das Haus von Nikigraus...");
        m.machEs();

        System.out.println();

        // Fixed-Size-Listen:

        // Ab Java 9
        List<String> namen = List.of("Peter", "Bruce", "Carol", "Natasha", "Steve", "Tony", "Scott");

        // vor Java 9
        //List<String> namen = Arrays.asList("Peter", "Bruce", "Carol", "Natasha", "Steve", "Tony", "Scott");

        // Fixed-Size-Liste wird als Basis für eine Liste mit fexibler Größe verwendet
        namen = new ArrayList<>(List.of("Peter", "Bruce", "Carol", "Natasha", "Steve", "Tony", "Scott"));

        // Externe Iteration
        for(String s : namen) {
            System.out.println(s.toUpperCase());
        }

        System.out.println();

        // Interne Iteration
        namen.forEach(s -> System.out.println(s.toLowerCase()));
        // Als Methodenreferez: Statt eingener Implementierung wird
        // eine Methode übergeben, die genau das gewünschte tut
        // Die Methode MUSS den Vorgaben entsprechen = Eingangsparameter und Rückgabetyp müssen
        // zu der abstrakten Methode des FunctionalInterface passen
        namen.forEach(LambdaTest::ausgeben);
        namen.forEach(System.out::println); // Auch OK
    }

    public static void ausgeben(String s) {
        System.out.println(s);
    }
}

// Ein Functional Interface darf und muss nur eine einizige abstrakte Methode haben
// Annotation @FunctionalInterface ist optional
interface Machbar {

    void machEs();
}