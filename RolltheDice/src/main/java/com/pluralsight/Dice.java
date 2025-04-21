package com.pluralsight;

public class Dice {

    public static void roll(Integer number){
        int randomNumber = (int)(Math.random() * 6) + 1;
        System.out.println(randomNumber);
    }

}