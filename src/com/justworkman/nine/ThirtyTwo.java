package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirtyTwo {

    static Scanner scanner = new Scanner(System.in);

    public static void leapYearProblem() {
        try {
            System.out.println("Give me your year");
            int year = scanner.nextInt();
            if (year < 1900 || year > 2030) throw new InputMismatchException();
            boolean isLeap = false;
            for (int i = 1900; i < 2032; i += 4) {
                if (i == year) {
                    isLeap = true;
                }
            }
            if (isLeap) {
                System.out.println("It's a leap year");
            } else {
                System.out.println("Just another year");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid date");
        }
    }
}
