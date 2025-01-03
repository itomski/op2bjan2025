package de.lubowiecki.uebungen.u1;

public class Freigehege extends Gehege {

    @Override
    public void starteFuetterung() {
        System.out.println("Starte Fütterung im Freien");
        for(Sozialisiert s : getList()) {
            s.nahrungAufnehmen();
        }
    }

    @Override
    public void starteNachruhe() {
        System.out.println("Starte Nachtruhe im Freien");
        for(Sozialisiert s : getList()) {
            s.nachtAktivitaet();
        }
    }
}
