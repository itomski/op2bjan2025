package de.lubowiecki.tag1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class KlassenTest {

    public static void main(String[] args) {

        int i = 10;

        // Person IS-A Person
        Person p = new Person("Peter", "Parker");
        // Person IS-A Object
        Object o = p;
        System.out.println(p); // toString wird benutzt
        // Instanzmethoden werden IMMER auf dem Objekttyp ausgeführt

        System.out.println();

        // ExtPerson IS-A Person
        p = new ExtPerson("Bruce", "Banner", LocalDate.now());
        System.out.println(p);

        // Objekttyp: ExtPerson (Muss immer eine Klasse sein)
        // Referenztyp: Person (Kann eine Klasse, Abstrakte Klasse oder Interface sein)
        //System.out.println(p.getGeburtsDatum());

        System.out.println();

        // Referenztyp: List (Interface)
        // Objekttyp: ArrayList
        List<Person> list = new ArrayList<>(); // arraysize: 10
        list = new LinkedList<>(); // arraysize: 10
        list.add(new Person("Peter", "Parker"));
        list.add(new ExtPerson("Bruce", "Banner", LocalDate.now()));

        System.out.println(list);
    }
}

class Person {

    private String vorname;
    private String nachname;

    public Person() {
    }

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

class ExtPerson extends Person {

    private LocalDate geburtsDatum;

    public ExtPerson() {
    }

    public ExtPerson(String vorname, String nachname) {
        super(vorname, nachname);
    }

    public ExtPerson(String vorname, String nachname, LocalDate geburtsDatum) {
        super(vorname, nachname);
        this.geburtsDatum = geburtsDatum;
    }

    public LocalDate getGenurtsDatum() {
        return geburtsDatum;
    }

    public void setGenurtsDatum(LocalDate genurtsDatum) {
        this.geburtsDatum = genurtsDatum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ExtPerson{");
        sb.append("vorname='").append(getVorname()).append('\'');
        sb.append(", nachname='").append(getNachname()).append('\'');
        sb.append("geburtsDatum=").append(geburtsDatum);
        sb.append('}');
        return sb.toString();
    }
}

