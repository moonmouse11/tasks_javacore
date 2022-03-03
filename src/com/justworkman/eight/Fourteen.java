package com.justworkman.eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fourteen {

    static Scanner scanner = new Scanner(System.in);

    public static void numbersProblems() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number < 0 || number > 99) {
                throw new InputMismatchException();
            }
            int first = number / 10;
            int second = number % 10;
            if (first > second) {
                System.out.println("True");
            } else if (first < second) {
                System.out.println("False");
            } else {
                System.out.println("They equals");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
