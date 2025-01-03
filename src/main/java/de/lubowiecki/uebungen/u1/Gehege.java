package de.lubowiecki.uebungen.u1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gehege {

    private List<Sozialisiert> list = new ArrayList<>();

    public boolean add(Sozialisiert... obj) {
        return list.addAll(Arrays.asList(obj));
    }

    public boolean remove(Sozialisiert obj) {
        return list.remove(obj);
    }

    public void starteFuetterung() {
        System.out.println("Fütterung");
        for(Sozialisiert s : list) {
            s.nahrungAufnehmen();
        }
    }

    public void starteNachruhe() {
        System.out.println("Nachruhe");
        for(Sozialisiert s : list) {
            s.nachtAktivitaet();
        }
    }

    protected List<Sozialisiert> getList() {
        return list;
    }
}
