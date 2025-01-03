package de.lubowiecki.tag2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class InterfaceTest {

    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();
        System.out.println(ld.format(DateFormatUtil.DATE_FMT));
        System.out.println(ld.format(DateFormats.DATE_FMT));

        List<String> werte = new ArrayList<>(List.of("Bruce", "Carol", "Natasha", "Steve", "Scott"));

        // Lambdas basieren auf FunctionalInterfaces
        werte.removeIf(w -> w.startsWith("N"));
        werte.forEach((w) -> System.out.println(w));

    }
}

class SampleImpl implements Sample {

    @Override
    public void machWasAnderes() {
        System.out.println("Implementierung");
        System.out.println(i); // Eigenschaften werden vererbt
        //machWasGanzAnderes(); // Statische Methoden eines Interface werden NICHT vererbt!
        Sample.machWasGanzAnderes(); // Muss IMMER über das Interface ausgeführt werden
        System.out.println(Sample.i);
    }
}

interface Sample {

    // automatisch: public static final
    int i = 100;

    // automatisch: public
    default void machWas() {
        // Beispielimplementierung
        System.out.println("machWas()");
    }

    void machWasAnderes();

    static void machWasGanzAnderes() {
        System.out.println("machWasGanzAnderes()");
    }
}