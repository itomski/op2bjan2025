package de.lubowiecki.tag3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Wrappertypen {

    public static void main(String[] args) {

        // byte < short < int < long < float < double
        //        char < int

        int i = 10;
        double d = i; // primitive Widening von int zu double

        double sum = 10.0 + 7; // kleinerer Datentyp wird an den größeren angepasst
        int iSum = (int)10.0 + 7; // ohne Cast nicht möglich

        Integer j = 10; // Autoboxing von int zu Integer
        i = j; // Auto-Unboxing von Integer zu int

        // Double d2 = i; // Autoboxing von int auf Integer, komplex widening von Integer auf Double scheitert

        byte b1 = 127;
        byte b2 = 5;
        // byte bSum = b1 - b2; // byte und short promovieren beim Rechnen zu int

        // Überlauf und Unterlauf möglich
        b2++; // b2 = (byte)(b2 + 1);
        b2 += 7; // b2 = (byte)(b2 + 7);

        System.out.println(b1++);
        System.out.println(b1++);
        System.out.println(b1++);

        System.out.println((byte)1000);

        System.out.println();

        Integer i5 = 100;
        Integer i6 = new Integer(100);
        System.out.println(i5 == i6); // Speichervergleich/Referenzvergleich
        System.out.println(i5.equals(i6)); // Wertevergleich

        i5 = 130;
        i6 = 130;
        System.out.println(i5 == i6);
        System.out.println(i5.equals(i6));

        System.out.println();

        int[] arr1 = {5,7,22,18};
        int[] arr2 = arr1; // Referenz auf das gleiche Array

        System.out.println(arr1 == arr2); // Gleiches Objekt auf dem Spiecher?
        System.out.println(arr1.equals(arr2)); // Hat es den gleichen Inhalt? (Bei Array: Gleiches Objekt auf dem Spiecher?)
        // Richtiger Inhaltsvergleich bei einem Array
        System.out.println(Arrays.equals(arr1, arr2));

        System.out.println();

        String s1 = "Hi"; // Landet im StringLiteralPool
        String s2 = "Hi"; // Wenn gleicher Wert bereits im Pool, wird dieser referenziert
        String s3 = new String("Hi"); // Landet NICHT im Pool
        System.out.println(s1 == s2); // Speichervergleich
        System.out.println(s1.equals(s2)); // Inhaltsvergleich

        System.out.println();

        System.out.println(s1 == s3); // Speichervergleich
        System.out.println(s1.equals(s3)); // Inhaltsvergleich

        System.out.println();

        Person p1 = new Person("Peter", "Parker");
        Person p2 = new Person("Peter", "Parker");
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        // API Contract
        // WICHTIG: Um Objekte eigener Klassen richtig vergleichen zu können
        // MUSS die Methoden equals und hashCode richtig überschrieben werden

        Set<Person> sammlung = new HashSet<>();
        sammlung.add(p1);
        sammlung.add(p2);
        System.out.println(sammlung);
    }
}
