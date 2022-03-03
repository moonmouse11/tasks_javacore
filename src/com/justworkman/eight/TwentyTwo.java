package com.justworkman.eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyTwo {

    static Scanner scanner = new Scanner(System.in);

    public static void upToDownTo() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            String answer = "";
            if (number < 0) {
                throw new InputMismatchException();
            }
            if(isEven(number)) {
                number = (number / 10 + 1) * 10;
                answer = "Up to ";
            } else {
                number = number / 10 * 10;
                answer = "Down to ";
            }
            System.out.println(answer + number);
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
