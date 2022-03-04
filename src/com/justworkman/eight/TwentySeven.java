package com.justworkman.eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentySeven {

    static Scanner scanner = new Scanner(System.in);

    public static void biggerNumerals() {
        try {
            System.out.println("Give me a first number");
            int firstNumber = scanner.nextInt();
            System.out.println("Give me a second number");
            int secondNumber = scanner.nextInt();
            if (firstNumber < 0 || secondNumber < 0)
                throw new InputMismatchException();
            int firstRemainder = firstNumber % 10;
            int secondRemainder = secondNumber % 10;
            if (firstRemainder < secondRemainder) {
                System.out.println("Bigger answer = " + secondNumber);
            } else if (firstRemainder > secondRemainder) {
                System.out.println("Bigger answer = " + firstNumber);
            } else {
                System.out.println("They are equals");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid variant");
        }
    }
}
