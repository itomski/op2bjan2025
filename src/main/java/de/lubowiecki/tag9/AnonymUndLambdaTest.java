package de.lubowiecki.tag9;

import java.time.LocalDate;
import java.util.Scanner;

public class AnonymUndLambdaTest {

    private static final String KEYS = "\n**************************************" +
                                        "\n np \t: Neues Produkt" +
                                        "\n nvp \t: Neues verderbliches Produkt" +
                                        "\n list \t: Produkte anzeigen" +
                                        "\n sort \t: Produkte sortieren" +
                                        "\n exit \t: Programm verlassen" +
                                        "\n**************************************";

    // Instanzeigenschaft
    // Hier passen Produkt-Objekte rein, sowie Objekte aller Kindklassen von Produkt
    // Speicher für Produkte
    private Repository<Produkt> repository;

    // Für Eiganben von der Console
    private Scanner scanner = new Scanner(System.in);

    // Konkrete Lösung für Datenhaltung wird eingeimpft
    public AnonymUndLambdaTest(Repository<Produkt> repository) {
        this.repository = repository;
    }

    // Statische Methode (Klassenmethode)
    public static void main(String[] args) {
        // produkte.add(); // Error. produkte ist nicht statisch
        new AnonymUndLambdaTest(new ProductRepository()).start(); // Dependency injection
    }

    // Instanzmethode
    private void start() {

        // Endlos-Schleife
        app: while(true) {
            System.out.print(KEYS);
            System.out.print("\n\nAuswahl: ");

            // Auswahl wird von der Console eingelesen
            // durch -> spart man sich das break pro case
            switch(scanner.nextLine().trim().toLowerCase()) {
                case "np" -> createProduct(false);
                case "nvp" -> createProduct(true);
                case "list" -> printList();
                case "sort" -> repository.sort();
                case "exit" -> {
                    break app; // bricht die while-Schleife ab
                }
                default -> System.out.println("Falsche Eingabe!");
            }
        }

        System.out.println("Ende das Programms!");
    }

    private void printList() {
        System.out.println("\nProdukte: ");
        // Todo: Bei 0 Produkten eine andere Meldung ausgeben
        for(Produkt p : repository.getAll()) {
            if(p instanceof VerderblichesProdukt) // Prüft, ob das Objekt auf dem Heap ein VerderblichesProdukt ist
                System.out.println("\t" + p);
            else
                System.out.println(p);
        }
    }

    private void createProduct(boolean verderblich) {
        if(verderblich) {
            // VerderblichesProdukt IS-A Produkt
            // Daten von der Console abfragen und daraus ein VerderblichesProdukt erzeugen
            repository.add(new VerderblichesProdukt("Käse", LocalDate.now(), 150, 3.29, LocalDate.of(2025, 10, 1)));
        }
        else {
            // Logik für das erzeugen neuer Produkte
            // Daten von der Console abfragen und daraus ein Produkt erzeugen
            repository.add(new Produkt("Handschuhe", LocalDate.now(), 1000, 1.19));
        }
    }
}
