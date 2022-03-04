package com.justworkman.eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyEight {

    static Scanner scanner = new Scanner(System.in);

    public static void fractionProblem() {
        try {
            System.out.println("Give me a first number");
            int firstNumber = scanner.nextInt();
            System.out.println("Give me a second number");
            int secondNumber = scanner.nextInt();
            if (firstNumber <= 0 || secondNumber <= 0)
                throw new InputMismatchException();
            if (firstNumber < secondNumber) {
                System.out.println("It's a proper fraction");
            } else if (firstNumber == secondNumber) {
                System.out.println("It's a whole fraction");
            } else {
                System.out.println("It's a improper fraction");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
