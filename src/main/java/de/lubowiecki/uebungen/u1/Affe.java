package de.lubowiecki.uebungen.u1;

public class Affe implements Sozialisiert {
    @Override
    public void nahrungAufnehmen() {
        System.out.println(getClass().getSimpleName() + ": Frisst Bananen");
    }

    @Override
    public void nachtAktivitaet() {
        System.out.println(getClass().getSimpleName() + ": Schläft");
    }

    @Override
    public void tagAktivitaet() {
        System.out.println(getClass().getSimpleName() + ": Hängt ab");
    }
}
