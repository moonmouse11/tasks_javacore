package com.justworkman.six;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fourteen {

    static Scanner scanner = new Scanner(System.in);

    public static void positiveDivider() {
        try {
            System.out.println("Give me a numerator");
            int numerator = scanner.nextInt();
            System.out.println("Give me a denominator");
            int denominator = scanner.nextInt();
            if (denominator == 0) {
                System.out.println("Illegal fraction");
            } else {
                if (numerator * denominator >= 0) {
                    System.out.println("Positive fraction");
                } else {
                    System.out.println("Negative fraction");
                }
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a number");
        }
    }
}

