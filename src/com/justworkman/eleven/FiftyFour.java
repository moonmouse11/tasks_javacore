package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FiftyFour {

    private static final Scanner scanner = new Scanner(System.in);

    public static void nextRowUnknown() {
        try {
            System.out.println("Give me a first number");
            int firstNumber = scanner.nextInt();
            System.out.println("Give me a second number");
            int secondNumber = scanner.nextInt();
            int min = Math.min(firstNumber,secondNumber);
            int max = Math.max(firstNumber,secondNumber);
            System.out.println("Start");
            System.out.print(min + "+");
            for (int i = 1; i < max - min; i++) {
                System.out.print(min + i + "+");
            }
            System.out.println(max);
            System.out.println("Finish");
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
