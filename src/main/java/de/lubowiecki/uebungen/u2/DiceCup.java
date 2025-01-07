package de.lubowiecki.uebungen.u2;

public class DiceCup {

    private final Dice dice;

    public DiceCup(Dice dice) {
        this.dice = dice;
    }

    public int roll() {
        return dice.roll();
    }

    public int[] roll(int count) {

        int[] arr = new int[count];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = dice.roll();
        }
        return arr;
    }
}
