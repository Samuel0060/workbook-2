package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String[] favQuotes = {
                "Work hard play hard",
                "Time is money",
                "Practice makes perfect",
                "I'm not cheap! ~ Craig Mckeachie",
                "When life gives you lemons, make lemonade.",
                "Knowledge is power",
                "To be, or not to be, that is the question.",
                "I think, therefore I am.",
                "The only thing we have to fear is fear itself.",
                "The journey of a thousand miles begins with one step."
        };




        while (true) {
            System.out.println("Choose a number 1-10?");


        try {
            int index = scanner.nextInt();

                if (index > 1 && index < 10) {
                    System.out.println(favQuotes[index - 1]);
                } else {
                    System.out.println("Not Allowed");
                }


            } catch (Exception e) {
                System.out.println("Only numbers 1-10");


            }

            break;
        }

    }
}

