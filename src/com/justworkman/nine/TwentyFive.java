package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyFive {

    static Scanner scanner = new Scanner(System.in);

    public static void pitNumber() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number < 100 || number > 999) throw new InputMismatchException();
            int first = number / 100;
            int second = number / 10 % 10;
            int third = number % 10;
            if (second < first && second < third) {
                System.out.println("It's a pit number");
            } else {
                System.out.println("Just a number");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
