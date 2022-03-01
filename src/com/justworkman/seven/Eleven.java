package com.justworkman.seven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eleven {

    static Scanner scanner = new Scanner(System.in);

    public static void anotherProblem() {
        try {
            System.out.println("Give me a first number");
            int firstNumber = scanner.nextInt();
            System.out.println("Give me a second number");
            int secondNumber = scanner.nextInt();
            if (firstNumber < secondNumber) {
                System.out.println(firstNumber + " " + secondNumber);
                System.out.println(secondNumber + " " + firstNumber);
            } else {
                System.out.println(secondNumber + " " + firstNumber);
                System.out.println(firstNumber + " " + secondNumber);
            }
        } catch (InputMismatchException exception) {
            System.out.println("It's not a number");
        }
    }

}
