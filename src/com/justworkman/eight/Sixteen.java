package com.justworkman.eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sixteen {

    static Scanner scanner = new Scanner(System.in);

    public static void symmetricalNumber() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number < 100 || number > 999) {
                throw new InputMismatchException();
            }
            int first = number / 100;
            int second = number % 10;
            if (first == second) {
                System.out.println("It's a symmetrical number");
            } else {
                System.out.println("Not a symmetrical number");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
