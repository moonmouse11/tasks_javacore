package com.justworkman.eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nineteen {

    static Scanner scanner = new Scanner(System.in);

    public static void pairSymmetrical() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number < 1000 || number > 9999 ) {
                throw new InputMismatchException();
            }
            int firstPair = number / 100;
            int secondPair = number % 100;
            if (firstPair == secondPair) {
                System.out.println("They are pair symmetrical");
            } else {
                System.out.println("No, they don't");
            }

        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
