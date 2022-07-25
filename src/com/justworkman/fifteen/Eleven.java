package com.justworkman.fifteen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eleven {

    private static final Scanner SCANNER = new Scanner(System.in);

    private static int decadePair = 0;
    private static int numericPair = 0;

    public static void sumOfNumeric() {
        while (true) {
            try {
                System.out.println("Give me a pair");
                String inputNumber = SCANNER.nextLine();
                String[] pairs = inputNumber.split(" ");
                if (pairs.length == 1) throw new InputMismatchException();
                int firstNumber = Integer.parseInt(pairs[0]);
                int secondNumber = Integer.parseInt(pairs[1]);
                if (firstNumber == secondNumber) break;
                if (firstNumber < 10 || secondNumber < 10) throw new InputMismatchException();
                sumFirstPair(firstNumber, secondNumber);
                sumSecondPair(firstNumber, secondNumber);
            } catch (NumberFormatException | InputMismatchException exception) {
                System.out.println("Not a valid numbers. Try again.");
            }
        }
        System.out.println("Decade pair sum: " + decadePair);
        System.out.println("Numeric pair sum: " + numericPair);
    }

    private static void sumFirstPair(int first, int second) {
        int firstDecade = first / 10;
        int secondDecade = second / 10;
        decadePair = decadePair + firstDecade + secondDecade;
    }

    private static void sumSecondPair(int first, int second) {
        int firstNumeric = first % 10;
        int secondNumeric = second % 10;
        numericPair = numericPair + firstNumeric + secondNumeric;
    }
}
