package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eleven {

    static Scanner scanner = new Scanner(System.in);

    public static void flatNumber() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number < 100 || number > 999) throw new InputMismatchException();
            int first = number / 100;
            int second = number / 10 % 10;
            int third = number % 10;
            if (first == second && second == third) {
                System.out.println("It's a flat number");
            } else {
                System.out.println("Not a flat number");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
