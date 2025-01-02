package de.lubowiecki.patterns.composite;

public class ExcelDoc implements Doc {

    // TODO: Methoden zur Verarbeitung von Tabellen-Daten

    private String titel;

    public ExcelDoc(String titel) {
        this.titel = titel;
    }

    @Override
    public void print() {
        System.out.println("Print Excel-Doc: " + titel);
    }
}
