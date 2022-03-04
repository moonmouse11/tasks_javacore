package com.justworkman.eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Thirty {

    static Scanner scanner = new Scanner(System.in);

    public static void wholeDivider() {
        try {
            System.out.println("Give me a numerator");
            int numerator = scanner.nextInt();
            System.out.println("Give me a denominator");
            int denominator = scanner.nextInt();
            if (numerator < 0 || denominator <= 0 || numerator < denominator)
                throw new InputMismatchException();
            if (numerator == denominator) {
                System.out.println("Whole number");
            } else {
                int whole = numerator / denominator;
                int fraction = numerator % denominator;
                System.out.println("Answer = " + whole + " " + fraction + "/" + denominator);
            }
        } catch (InputMismatchException exception) {
            System.out.println("Can't calculate");
        }
    }
}
