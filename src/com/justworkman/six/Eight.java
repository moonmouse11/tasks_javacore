package com.justworkman.six;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eight {

    static Scanner scanner = new Scanner(System.in);

    public static void twoNumbersProblem() {
        try {
            System.out.println("Give me a first number");
            int firstNumber = scanner.nextInt();
            System.out.println("Give me a second number");
            int secondNumber = scanner.nextInt();
            if (firstNumber > secondNumber) {
                int answer = firstNumber + secondNumber;
                System.out.println("Answer = " + answer);
            } else if (firstNumber < secondNumber) {
                int answer = firstNumber * secondNumber;
                System.out.println("Answer = " + answer);
            } else {
                System.out.println("They are equals");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a number");
        }
    }
}
