package de.lubowiecki.tag10;

public class LambdaTest {

    public static void main(String[] args) {

        // (konkrete und abstrakte) Klassen und Interfaces mit mehreren abstraken Methoden
        // können NICHT als Lambdas realisiert werden
        // als Lambda
        Machbar m1 = () -> System.out.println("Moin");

        Machbar m2 = new Machbar() {
            @Override
            public void machWas() {
                System.out.println("Moin");
            }
        };
    }
}

// MUSS ein SAM sein (single abstract method)
// FunctionalInterfaces MÜSSEN Interfaces sein
// Dürfen nur eine einzige abstrakte Methode haben
// Dürfen statische Methoden enthalten
// Dürfen default Methoden enthalten
// Annotation FunctionalInterface ist optional
// Methoden von Object dürfen als abstrakte Mehoden zusätzlich enthalten sein

@FunctionalInterface
interface Machbar {

    // Schlüsselwort abstract ist optional
    // In einem Interface ist jede Methode ohne Body ({}) automatisch abstrakt
    void machWas(); // abstrakte Methode

    static void machWasAnderes() {

    }

    default void machWasGanzAnderes() {

    }

    String toString(); // Ist bereits von Objekt implementiert (hashCode, equals, toString)
}