package de.lubowiecki.tag10;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConsumerTest {

    public static void main(String[] args) {

        // T ist der generische Typ

        // void accept(T t);
        Consumer<Integer> cons1 = i -> System.out.println(i);
        Consumer<Integer> cons2 = (i) -> System.out.println(i);
        Consumer<Integer> cons3 = (Integer i) -> System.out.println(i);
        Consumer<Integer> cons4 = (Integer i) -> {
            System.out.println(i);
            // hier wäre return möglich
        };

        // Lambdas mit einer Anweisung enthalten kein return
        // Consumer<Integer> cons3 = (Integer i) -> return System.out.println(i); // Error

        // R get();
        Supplier<Integer> sup1 = () -> 123; // Ok
        // Supplier<Integer> sup2 = () -> return 123; // Error: return nicht erlaubt!
        Supplier<Integer> sup3 = () -> {
            return 123; // Bei mehrzeiligen Lambdas mit Rückgabetyp braucht es das return!
        };

        Map<String, Integer> einwohner = new HashMap<>();
        einwohner.put("Hamburg", 1_900_000);

        // Function<T, R>
        // R apply(T t);
        Function<String, Integer> func1 = s -> Integer.parseInt(s);

        // Bei Methodenreferenzen fehlt die Parameterklammer
        // int parseInt(String s)
        Function<String, Integer> func2 = Integer::parseInt;

    }
}
