package de.lubowiecki.tag3;

import java.util.Objects;

public class Person {

    private final String vorname;
    private final String nachname;

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append('}');
        return sb.toString();
    }

    // Damit Objekte richtig verglichen werden können
    // Muss hashCode und equals richtig eingebaut werden
    // hashCode und equals MÜSSEN auf den gleichen Eigenschaften basieren
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(vorname, person.vorname) && Objects.equals(nachname, person.nachname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vorname, nachname);
    }
}
