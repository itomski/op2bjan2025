package de.lubowiecki.tag3;

import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierTest {

    public static void main(String[] args) {

        // R get ()
        Supplier<Integer> w6 = () -> (int)(Math.random() * 6) + 1;
        Supplier<Integer> w10 = () -> (int)(Math.random() * 10) + 1;
        Supplier<Integer> w100 = () -> (int)(Math.random() * 100) + 1;

        System.out.println(w6.get());
        System.out.println(w6.get());
        System.out.println(w6.get());
        System.out.println(w6.get());

        Stream.generate(w6)
                .limit(1000)
                .forEach(System.out::println);


        final String[] VORNAMEN = {"Peter", "Bruce", "Carol", "Tony", "Natasha"};
        final String[] NACHNAMEN = {"Parker", "Banner", "Danvers", "Stark", "Romanov"};
        final Random rand = new Random();

        Supplier<Person> personSeeder = () -> new Person(VORNAMEN[rand.nextInt(5)], NACHNAMEN[rand.nextInt(5)]);



        Set<Person> personen = Stream.generate(personSeeder)
                .limit(100)
                .collect(Collectors.toSet());

        for(Person p : personen) {
            System.out.println(p);
        }
    }
}
