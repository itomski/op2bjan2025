package de.lubowiecki.uebungen.u3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private Scanner scanner = new Scanner(System.in);

    private List<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        new App().start();
    }

    private void start() {

        app: while(true) {
            System.out.print("Eingabe: ");

            // bei Verwendung von -> benutzt man kein break
            switch(scanner.nextLine().trim().toLowerCase()) {
                case "exit" -> { break app; }
                case "neu" -> createProduct();
                case "liste" -> showProducts();
                default -> System.out.println("Falsche Eingabe!");
            }
        }

        System.out.println("Programm beendet.");
    }

    private void showProducts() {
        // TODO: Den Inhalt der Liste products ausgeben
        System.out.println("Produkte anzeigen");
    }

    private void createProduct() {
        // TODO: Produktdaten abfragen, Product-Objekt bauen und der Liste products hinzufügen
        System.out.println("Produkt erzeugen");
    }
}
