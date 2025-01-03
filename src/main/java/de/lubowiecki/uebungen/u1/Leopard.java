package de.lubowiecki.uebungen.u1;

public class Leopard extends Fleischfresser {

    @Override
    public void nachtAktivitaet() {
        System.out.println(getClass().getSimpleName() + ": Pennt");
    }

    @Override
    public void tagAktivitaet() {
        System.out.println(getClass().getSimpleName() + ": Geht auf die Jagd");
    }
}
