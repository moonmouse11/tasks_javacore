package com.justworkman.six;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Five {

    static Scanner scanner = new Scanner(System.in);

    public static void zeroOrNot() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number == 0) {
                System.out.println("It's a zero");
            } else {
                System.out.println("It's not a zero");
            }
        } catch (InputMismatchException exception) {
            System.out.println("It's not a number");
        }
    }
}
