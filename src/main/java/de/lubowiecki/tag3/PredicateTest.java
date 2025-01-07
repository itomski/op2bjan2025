package de.lubowiecki.tag3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {

        // boolean test(T t)
        Predicate<Integer> unter100 = w -> w < 100;
        Predicate<Integer> ueber1000 = w -> w > 1000;

        List<Integer> zahlen = new ArrayList<>(List.of(20, 33, 107, 99, 995, 1020, 18, 110));
        //zahlen.removeIf(ueber1000);
        zahlen.removeIf(unter100.or(ueber1000)); // Zwei Predicates kombinieren
        System.out.println(zahlen);

    }
}
