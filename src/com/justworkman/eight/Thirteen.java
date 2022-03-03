package com.justworkman.eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Thirteen {

    static Scanner scanner = new Scanner(System.in);

    public static void equalsInNumber() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number < 0 || number > 99) {
                throw new InputMismatchException();
            } else {
                int first = number / 10;
                int second = number % 10;
                if (second == first) {
                    System.out.println("Equals numbers");
                } else {
                    System.out.println("Not equals");
                }
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
