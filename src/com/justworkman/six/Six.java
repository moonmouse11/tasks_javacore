package com.justworkman.six;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Six {

    static Scanner scanner = new Scanner(System.in);

    public static void whatNumberIs() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number == 0) {
                System.out.println("It's a zero");
            } else if (number > 0) {
                System.out.println("It's a positive number");
            } else {
                System.out.println("It's a negative number");
            }
        } catch (InputMismatchException exception) {
            System.out.println("It's not a number");
        }
    }
}
