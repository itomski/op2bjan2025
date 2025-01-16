package de.lubowiecki.tag10;

public class AnonymeKlassenTest {

    public static void main(String[] args) {

        // Anonyme Klasse = eine Klasse ohne Namen die von Machbar erbt (extends oder implements)
        Machbar m2 = new Machbar() { // Hier erfolgt sofort die Instanzierung
            @Override
            public void machWas() {
                System.out.println("Moin");
            }
        };
    }
}

// Basis für eine anonyme Klasse kann ein Interface, oder eine Klasse (abstrakt oder konkret) sein
// Bei Interface oder einer abstrakten Klasse MÜSSEN alle abstrakten Methoden implementiert werden
// Bei konkreten Klassen werden gewünschte Methoden überschrieben
// Anonyme Klassen haben keine eigenen Namen, enthält keine eigenen Konstruktoren
