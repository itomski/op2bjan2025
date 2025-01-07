package de.lubowiecki.tag3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Peter");
        list.add("Carol");
        list.add("Bruce");
        list.add("Natasha");
        list.add("Steve");
        list.add("Tony");
        list.add("Scott");

        //Function<String, String> cut = s -> s.substring(0, 3) + "...";

        // UnaryOperator ist eine Funktion bei der Eingangs- und Rückgabetyp gleich sind
        UnaryOperator<String> cut = s -> s.substring(0, 3) + "...";
        list.replaceAll(cut);

        System.out.println(list);

        System.out.println();

        try {
            Files.lines(Paths.get("log.txt"))
                    .map(s -> s.toUpperCase())
                    .filter(s -> !s.startsWith("S"))
                    .forEach(System.out::println);
        }
        catch (IOException e) {
            System.out.println("Error!");
        }

        System.out.println();

        Function<String, LocalDate> deStrToLocalDate = s -> {
            final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            return LocalDate.parse(s, FMT);
        };

        Function<LocalDate, String> localDateToDeString = d -> {
            final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            return d.format(FMT);
        };

        LocalDate ld1 = deStrToLocalDate.apply("25.07.2022");
        System.out.println(ld1); // Standardausgabe im ISO-Format

        ld1 = ld1.plusDays(5);
        System.out.println(localDateToDeString.apply(ld1));


    }
}
