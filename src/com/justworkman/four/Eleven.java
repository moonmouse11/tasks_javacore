package com.justworkman.four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eleven {

    static Scanner scanner = new Scanner(System.in);

    public static void lengthOfNumber() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number > 9 && number < 100) {
                int first = number / 10;
                int second = number % 10;
                int length = first - second;
                System.out.println("Answer = " + length);
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException exception) {
            System.out.println("Wrong input number");
        }
    }
}
