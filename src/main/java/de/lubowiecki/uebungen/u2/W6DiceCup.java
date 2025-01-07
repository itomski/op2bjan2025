package de.lubowiecki.uebungen.u2;

import java.util.Random;

public class W6DiceCup {

    private Random rand = new Random();

    public int roll() {
        return rand.nextInt(6) + 1;
    }

    public int[] roll(int count) {

        int[] arr = new int[count];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = roll();
        }
        return arr;
    }
}
