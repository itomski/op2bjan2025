package de.lubowiecki.uebungen.u2;

import java.util.Arrays;
import java.util.Random;

public class DiceCupTest2 {

    public static void main(String[] args) {

        // Verwendung einer konkreten Klasse
        //DiceCup cup = new DiceCup(new W6());

        // Verwendung flexibler Implementierungen als Lambdas
        // Auf einer Variable wird eine Funktionalität abgelegt, die als Parameter weitergegeben werden kann
        // int roll();
        Dice w6 = () -> (int)(Math.random() * 6) + 1;

        Dice w10 = () -> (int)(Math.random() * 10) + 1;

        Dice w100 = () -> (int)(Math.random() * 100) + 1;

        Dice static100 = () -> 100;

        Dice w1000 = () -> {
            Random rand = new Random();
            return rand.nextInt(1000) + 1;
        };
        //DiceCup cup = new DiceCup(w1000);

        // Verwendung einer anonymen Klasse als flexible Implementierung des Interfaces
        DiceCup cup = new DiceCup(new Dice() {
            @Override
            public int roll() {
                return 25;
            }
        });

        System.out.println(cup.roll());
        System.out.println(cup.roll());
        System.out.println(cup.roll());
        System.out.println(cup.roll());

        System.out.println(Arrays.toString(cup.roll(10)));



    }
}
