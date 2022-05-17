package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FiftyEight {

    private static final Scanner scanner = new Scanner(System.in);

    public static void scannerInCycle() {
        try {
            System.out.println("Give me a number for cycle");
            int repeat = scanner.nextInt();
            System.out.println("Start");
            for (int i = 1; i <= repeat; i++) {
                System.out.println("Row number " + i);
                int inputNumber = scannerForCycle();
                if (inputNumber > 0) {
                    System.out.println(Math.pow(inputNumber, 2));
                } else {
                    System.out.println("Miss it");
                }
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static int scannerForCycle() {
        try {
            int input = scanner.nextInt();
            return input;
        } catch (InputMismatchException exception) {
            System.out.println("You miss");
            return scanner.nextInt();
        }
    }
}
