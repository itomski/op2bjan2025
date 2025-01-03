package de.lubowiecki.uebungen.u1;

public class Wolf extends Fleischfresser {

    @Override
    public void nachtAktivitaet() {
        System.out.println(getClass().getSimpleName() + ": Geht auf die Jagd");
    }

    @Override
    public void tagAktivitaet() {
        System.out.println(getClass().getSimpleName() + ": Pennt");
    }
}
