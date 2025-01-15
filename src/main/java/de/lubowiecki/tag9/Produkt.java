package de.lubowiecki.tag9;

import java.time.LocalDate;

public class Produkt {

    private String name;
    private LocalDate verfuegbarSeit;
    private int anzahl;
    private double preis;

    public Produkt() {
    }

    public Produkt(String name, LocalDate verfuegbarSeit, int anzahl, double preis) {
        this.name = name;
        this.verfuegbarSeit = verfuegbarSeit;
        this.anzahl = anzahl;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getVerfuegbarSeit() {
        return verfuegbarSeit;
    }

    public void setVerfuegbarSeit(LocalDate verfuegbarSeit) {
        this.verfuegbarSeit = verfuegbarSeit;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produkt{");
        sb.append("name='").append(name).append('\'');
        sb.append(", verfuegbarSeit=").append(verfuegbarSeit);
        sb.append(", anzahl=").append(anzahl);
        sb.append(", preis=").append(preis);
        sb.append('}');
        return sb.toString();
    }
}
