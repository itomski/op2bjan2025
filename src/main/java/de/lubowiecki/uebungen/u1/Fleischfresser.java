package de.lubowiecki.uebungen.u1;

public abstract class Fleischfresser implements Sozialisiert{
    @Override
    public void nahrungAufnehmen() {
        System.out.println(getClass().getSimpleName() + ": Frisst Fleisch");
    }
}
