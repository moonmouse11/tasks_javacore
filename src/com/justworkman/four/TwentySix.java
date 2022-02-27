package com.justworkman.four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentySix {

    static Scanner scanner = new Scanner(System.in);

    public static void leftBarterWithNumber() {
        try {
            System.out.println("Give me a first number");
            int firstNumber = scanner.nextInt();
            System.out.println("Give me a second number");
            int secondNumber = scanner.nextInt();
            String firstString = String.valueOf(firstNumber);
            String secondString = String.valueOf(secondNumber);
            String firstAnswer = secondString.charAt(0) + firstString.substring(1);
            String secondAnswer = firstString.charAt(0) + secondString.substring(1);
            System.out.println("First answer = " + firstAnswer);
            System.out.println("Second answer = " + secondAnswer);
        } catch (InputMismatchException exception) {
            System.out.println("Wrong type of number");
        }
    }
}
