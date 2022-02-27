package com.justworkman.four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sixteen {

    static Scanner scanner = new Scanner(System.in);

    public static void replaceNumber() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number > 99 && number < 1000) {
                StringBuilder answer = new StringBuilder(String.valueOf(number)).reverse();
                System.out.println("Answer = " + answer);
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException exception) {
            System.out.println("Wrong input type");
        }
    }
}
