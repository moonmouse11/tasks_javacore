package com.justworkman.three;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Seven {

    static Scanner scanner = new Scanner(System.in);

    public static void numbersToLow() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            number--;
            System.out.println("Number now = " + number);
            number--;
            System.out.println("Number now = " + number);
            number--;
            System.out.println("Number now = " + number);
        } catch (InputMismatchException exception) {
            System.out.println("Not a number");
        }
    }
}
