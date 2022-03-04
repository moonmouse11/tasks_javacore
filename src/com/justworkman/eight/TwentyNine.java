package com.justworkman.eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyNine {

    static Scanner scanner = new Scanner(System.in);

    public static void equalsFraction() {
        try {
            System.out.println("Give me a first numerator");
            int firstNumerator = scanner.nextInt();
            System.out.println("Give me a first denominator");
            int firstDenominator = scanner.nextInt();
            System.out.println("Give me a second numerator");
            int secondNumerator = scanner.nextInt();
            System.out.println("Give me a second denominator");
            int secondDenominator = scanner.nextInt();
            if (firstDenominator == 0 || secondDenominator == 0)
                throw new InputMismatchException();
            float firstFraction = firstNumerator / firstDenominator;
            float secondFraction = secondNumerator / secondDenominator;
            if (firstFraction == secondFraction) {
                System.out.println("They are equals");
            } else {
                System.out.println("They don't equals");
            }
        }catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
