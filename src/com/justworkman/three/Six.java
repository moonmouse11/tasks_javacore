package com.justworkman.three;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Six {

    static Scanner scanner = new Scanner(System.in);

    public static void numbersToRise() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            System.out.println("Next in array = " + (number + 2));
            System.out.println("Next in array = " + (number + 4));
        } catch (InputMismatchException exception) {
            System.out.println("Not a number");
        }
    }
}
