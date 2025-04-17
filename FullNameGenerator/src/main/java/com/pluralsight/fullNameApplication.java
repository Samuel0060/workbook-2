package com.pluralsight;

import java.util.Scanner;

public class fullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me name. \nFirst name: ");
        String first = scanner.nextLine();

        System.out.println("Middle name (Press Enter to skip): ");
        String middle = scanner.nextLine();

        System.out.println("Last name: ");
        String last = scanner.nextLine();

        System.out.println("Do you have a suffix (ex. Jr, PhD, etc). If so type it ");
        String suffix = scanner.nextLine();

        String full = fullName(first, middle, last, suffix);

        System.out.println("" + full);

    }

    public static String fullName(String first, String middle, String last, String  suffix) {
        String result = first;

        if (!middle.isBlank()) {
            result += " " + middle;
        }

        result += " " + last;

        if (!suffix.isBlank()) {
            result += ", " + suffix;
        }
        return result;
    }
}
