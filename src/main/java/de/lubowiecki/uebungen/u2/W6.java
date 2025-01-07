package de.lubowiecki.uebungen.u2;

import java.util.Random;

public class W6 implements Dice {

    private Random rand = new Random();

    @Override
    public int roll() {
        return rand.nextInt(6) + 1;

    }
}
