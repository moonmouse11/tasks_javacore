package com.justworkman.six;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Four {

    static Scanner scanner = new Scanner(System.in);

    public static void positiveNumber() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number > 0) {
                System.out.println("Answer = " + number * 2);
            } else {
                System.out.println("Not a positive number");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a number");
        }
    }
}
