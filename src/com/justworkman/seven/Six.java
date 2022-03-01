package com.justworkman.seven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Six {

    static Scanner scanner = new Scanner(System.in);

    public static void equalsNumber() {
        try {
            System.out.println("Give me a first number");
            int firstNumber = scanner.nextInt();
            System.out.println("Give me a second number");
            int secondNumber = scanner.nextInt();
            System.out.println(secondNumber == firstNumber ? "It's equals" : "Not equals");
        } catch (InputMismatchException exception) {
            System.out.println("It's not a number");
        }
    }
}
