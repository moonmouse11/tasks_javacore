package com.justworkman.eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirtyTwo {

    static Scanner scanner = new Scanner(System.in);

    public static void evenProblem() {
        try {
            System.out.println("Give me your first number");
            int firstNumber = scanner.nextInt();
            if (firstNumber < 0)
                throw new InputMismatchException();
            System.out.println("Give me a second number");
            if (firstNumber % 2 == 0) {
                double secondNumber = scanner.nextDouble();
                double answer = secondNumber * firstNumber;
                System.out.println("Answer = " + answer);
            } else {
                int secondNumber = scanner.nextInt();
                int answer = firstNumber + secondNumber;
                System.out.println("Answer = " + answer);
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
