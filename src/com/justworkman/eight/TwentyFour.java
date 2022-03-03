package com.justworkman.eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyFour {

    static Scanner scanner = new Scanner(System.in);

    public static void switchNumber() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number < 100 || number > 999) {
                throw new InputMismatchException();
            }
            int answer = 0;
            if (number < 500) {
                int first = number % 10;
                int second = number / 10 % 10;
                answer = (number / 100) * 100 + first * 10 + second;
            } else {
                int first = number % 10;
                int second = number / 100;
                answer = first * 100 + (number / 10 % 10 * 10) + second;
            }
            System.out.println("Answer + " + answer);
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
