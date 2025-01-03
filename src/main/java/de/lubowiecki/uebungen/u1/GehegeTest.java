package de.lubowiecki.uebungen.u1;

public class GehegeTest {

    public static void main(String[] args) {

        //Gehege gehege = new Gehege();
        Gehege gehege = new Freigehege();

        gehege.add(new Affe());
        gehege.add(new Leopard(), new Wolf());
        gehege.add(new Affe(), new Wolf(), new Leopard());

        gehege.starteFuetterung();

        System.out.println();

        gehege.starteNachruhe();
    }
}
