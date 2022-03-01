package com.justworkman.seven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Five {

    static Scanner scanner = new Scanner(System.in);

    public static void positiveNumber() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number >= 0) {
                System.out.println("It's positive number");
            } else {
                System.out.println("It's negative number");
            }
        } catch (InputMismatchException exception) {
            System.out.println("It's not a number");
        }
    }
}
