package de.lubowiecki.tag9;

import java.time.LocalDate;

public class VerderblichesProdukt extends Produkt {

    private LocalDate haltbarBis;

    public VerderblichesProdukt() {
    }

    public VerderblichesProdukt(String name, LocalDate verfuegbarSeit, int anzahl, double preis, LocalDate haltbarBis) {
        super(name, verfuegbarSeit, anzahl, preis); // Gibt daten an die Elternklasse
        this.haltbarBis = haltbarBis; // Ergänzt die Haltbarkeit
    }

    public LocalDate getHaltbarBis() {
        return haltbarBis;
    }

    public void setHaltbarBis(LocalDate haltbarBis) {
        this.haltbarBis = haltbarBis;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VerderblichesProdukt{");
        sb.append("name='").append(getName()).append('\'');
        sb.append(", verfuegbarSeit=").append(getVerfuegbarSeit());
        sb.append(", anzahl=").append(getAnzahl());
        sb.append(", preis=").append(getPreis());
        sb.append(", haltbarBis=").append(haltbarBis);
        sb.append('}');
        return sb.toString();
    }
}
