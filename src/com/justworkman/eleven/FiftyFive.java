package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FiftyFive {

    private static final Scanner scanner = new Scanner(System.in);

    public static void nextRowUnknownAndEven() {
        try {
            System.out.println("Give me a first number");
            int firstNumber = scanner.nextInt();
            System.out.println("Give me a second number");
            int secondNumber = scanner.nextInt();
            int min = Math.min(firstNumber, secondNumber);
            int max = Math.max(firstNumber, secondNumber);
            System.out.println("Start");
            System.out.print(min + "+");
            for (int i = 1; i < max - min; i++) {
                if ((min + i) % 2 == 0) System.out.print(min + i + "+");
            }
            System.out.println(max);
            System.out.println("Finish");
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
