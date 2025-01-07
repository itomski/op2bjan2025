package de.lubowiecki.uebungen.u2;

import java.time.LocalDate;
import java.util.Arrays;

public class DiceCupTest {

    public static void main(String[] args) {

        W6DiceCup cup = new W6DiceCup();

        System.out.println(cup.roll());
        System.out.println(cup.roll());
        System.out.println(cup.roll());
        System.out.println(cup.roll());
        System.out.println(cup.roll());
        System.out.println(cup.roll());

        System.out.println();

        for(int i : cup.roll(10)) {
            System.out.println(i);
        }

        System.out.println();

        System.out.println(cup.roll(10));
        System.out.println(Arrays.toString(cup.roll(20)));

        System.out.println();

        /*
        System.out.println(new Object()); // wird in String konvertiert (toString)
        System.out.println(new String("Moin"));
        System.out.println(LocalDate.now());
        */
    }
}
