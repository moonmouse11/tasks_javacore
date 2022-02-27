package com.justworkman.four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Twelve {

    static Scanner scanner = new Scanner(System.in);

    public static void lengthOfNumber() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number > 99 && number < 1000) {
                int first = (number / 100) * 100;
                int second = (number % 10) * (number / 10 % 10);
                int answer = first - second;
                System.out.println("Answer = " + answer);
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException exception) {
            System.out.println("Wrong input number");
        }
    }
}
