package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FiftyThree {

    private static final Scanner scanner = new Scanner(System.in);

    public static void nextRow() {
        try {
            System.out.println("Give me a first number");
            int firstNumber = scanner.nextInt();
            System.out.println("Give me a second number bigger");
            int secondNumber = scanner.nextInt();
            System.out.println("Start");
            System.out.print(firstNumber + "+");
            for (int i = 1; i < secondNumber - firstNumber; i++) {
                System.out.print(firstNumber + i + "+");
            }
            System.out.println(secondNumber);
            System.out.println("Finish");
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
