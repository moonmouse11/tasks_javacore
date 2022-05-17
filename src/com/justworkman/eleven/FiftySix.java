package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FiftySix {

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
            for (int i = min; i < max; i++) {
                System.out.print(i + "+");
            }
            System.out.println(max);
            System.out.println("Finish");
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
