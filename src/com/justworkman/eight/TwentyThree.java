package com.justworkman.eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyThree {

    static Scanner scanner = new Scanner(System.in);

    public static void raiseOrNot() {
        try {
            System.out.println("Give me a first number");
            int firstNumber = scanner.nextInt();
            System.out.println("Give me a second number");
            int secondNumber = scanner.nextInt();
            if (firstNumber < 0 || secondNumber < 0) {
                throw new InputMismatchException();
            }
            if (firstNumber > secondNumber) {
                firstNumber--;
                secondNumber++;
                System.out.println("First = " + firstNumber);
                System.out.println("Second = " + secondNumber);
            } else if (firstNumber < secondNumber) {
                firstNumber++;
                secondNumber--;
                System.out.println("First = " + firstNumber);
                System.out.println("Second = " + secondNumber);
            } else {
                firstNumber++;
                secondNumber++;
                System.out.println("First = " + firstNumber);
                System.out.println("Second = " + secondNumber);
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
