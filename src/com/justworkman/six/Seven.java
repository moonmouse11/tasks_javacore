package com.justworkman.six;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Seven {

    static Scanner scanner = new Scanner(System.in);

    public static void positiveHundred() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number > 99) {
                System.out.println("Answer = " + (number + 1));
            } else {
                System.out.println("Without changes = " + number);
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a number");
        }
    }
}
