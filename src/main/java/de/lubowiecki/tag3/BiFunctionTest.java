package de.lubowiecki.tag3;

import java.util.function.BiFunction;

public class BiFunctionTest {

    public static void main(String[] args) {

        // R apply (T t, U u)
        BiFunction<Double, Double, Double> add = (a, b) -> a + b;

        System.out.println(add.apply(10.0, 22.0));
        System.out.println(add.apply(1.0, 2.0));
        System.out.println(add.apply(100.0, 200.0));
    }

}
