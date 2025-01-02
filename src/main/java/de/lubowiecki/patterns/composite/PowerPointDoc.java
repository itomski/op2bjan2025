package de.lubowiecki.patterns.composite;

public class PowerPointDoc implements Doc {

    private int anzahlSeiten;

    public PowerPointDoc() {
    }

    public PowerPointDoc(int anzahlSeiten) {
        this.anzahlSeiten = anzahlSeiten;
    }

    // TODO: Methoden zur Verarbeitung von Keynotes

    @Override
    public void print() {
        System.out.printf("Print PowerPoint-Doc: %d Seiten \n", anzahlSeiten);
    }
}
