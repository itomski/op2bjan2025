package de.lubowiecki.tag10;

public class AnonymeKlasse2 {

    public static void main(String[] args) {

        Tier t1 = new Tier();
        t1.gibLaut();

        Tier t2 = new Tier();
        t2.gibLaut();

        Tier t3 = new Tier() {

            @Override
            void gibLaut() { // Die Methode aus Tier wird überschrieben
                System.out.println("Wau Wau!");
            }
        };

        t3.gibLaut();

    }
}

class Tier {

    void gibLaut() {
        System.out.println("GRRRRRRRR!");
    }
}
