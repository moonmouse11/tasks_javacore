package com.justworkman.six;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eleven {

    static Scanner scanner = new Scanner(System.in);

    public static void sightProblem() {
        try {
            System.out.println("Give me a first number");
            int firstNumber = scanner.nextInt();
            System.out.println("Give me a second number");
            int secondNumber = scanner.nextInt();
            if (firstNumber == 0 || secondNumber == 0) {
                System.out.println("Zero problem");
            } else if (firstNumber < 0 && secondNumber < 0 || firstNumber > 0 && secondNumber > 0) {
                System.out.println("Sight are equals");
            } else {
                System.out.println("Sight are not equals");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a number");
        }
    }
}
