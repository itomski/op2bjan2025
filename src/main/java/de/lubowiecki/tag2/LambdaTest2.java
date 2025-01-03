package de.lubowiecki.tag2;

public class LambdaTest2 {

    public static void main(String[] args) {

        print("Hallo Lambda", "### %s ### \n");

        // Methoden-Referenz = Verweis auf eine bereits vorhandene Methode
        // Es muss kein neuer Lambda-Ausdruck geschrieben werden, sondern es kann jede
        // vorhandene Methode benutzt werden, welche die gleiche Signatur hat
        printNext("Hallo Lambda", System.out::println);

        // Lambdas bieten mehr Flexibilität als fest ausprogrammierte Methoden
        printNext("Hallo Lambda", v -> System.out.println("###" + v + "###"));

        printNext("Hallo Lambda", v -> {
            System.out.println("************************");
            System.out.println("\t" + v);
            System.out.println("************************");
        });


    }

    static void print(String value, String format) {
        System.out.printf(format, value);
    }

    static void printNext(String value, Printer printer) {
        printer.print(value);
    }
}

@FunctionalInterface
interface Printer {

    void print(String v);

}
