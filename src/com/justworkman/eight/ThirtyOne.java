package com.justworkman.eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirtyOne {

    static Scanner scanner = new Scanner(System.in);

    public static void evenProblem() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number < 100 || number > 999)
                throw new InputMismatchException();
            if (number % 2 == 0) {
                int first = number / 100;
                int second = number / 10 % 10;
                int third = number % 10;
                int answer = even(first) * 100 + even(second) * 10 + even(third);
                System.out.println("Answer = " + answer);
            } else {
                int first = number / 100;
                int second = number / 10 % 10;
                int third = number % 10;
                int answer = notEven(first) * 100 + notEven(second) * 10 + notEven(third);
                System.out.println("Answer = " + answer);
                System.out.println("Answer = " + answer);
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static int notEven(int numeral) {
        if (numeral % 2 == 0) {
            return numeral - 1;
        } else {
            return numeral + 1;
        }
    }

    private static int even(int numeral) {
        if (numeral % 2 == 0) {
            return numeral + 1;
        } else {
            return numeral - 1;
        }
    }
}
