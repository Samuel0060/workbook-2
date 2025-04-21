package com.pluralsight;

public class rollTheDice {
    public static void main(String[] args) {
    Dice dice = new Dice();

    int twoCounter;
    int fourCounter;
    int sixCounter;
    int sevenCounter;

    for (int counter = 0; counter < 100; counter++){

        int roll1 = dice.roll();
        int roll2 = dice.roll();

        System.out.println(roll1 + roll2);
        }
    }

}

