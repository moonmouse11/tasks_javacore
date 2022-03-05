package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyNine {

    static Scanner scanner = new Scanner(System.in);

    public static void ratherNumeralInNumber() {
        try {
            System.out.println("Give me your number");
            int number = scanner.nextInt();
            if (number < 100 || number > 999) throw new InputMismatchException();
            int first = number / 100;
            int second = number / 10 % 10;
            int third = number % 10;
            int count = isEquals(first, second) + isEquals(second, third) + isEquals(first, third);
            System.out.println("Answer = " + count + " different numerals");
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static int isEquals(int first, int second) {
        return (first != second) ? 1 :  0;
    }
}
