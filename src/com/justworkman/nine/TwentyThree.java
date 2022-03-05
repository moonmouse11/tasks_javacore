package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyThree {

    static Scanner scanner = new Scanner(System.in);

    public static void doubleEven() {
        try {
            System.out.println("Give me your number");
            int number = scanner.nextInt();
            if (number < 100 || number > 999) throw new InputMismatchException();
            int sumEven = sumEven(number);
            int raiseEven = raiseEven(number);
            if (sumEven % 2 == 0 && raiseEven % 2 == 0) {
                System.out.println("It's double even number");
            } else {
                System.out.println("Just a number");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static int raiseEven(int number) {
        int first = number / 100;
        int second = number / 10 % 10;
        int third = number % 10;
        return first * second * third;
    }

    private static int sumEven(int number) {
        int first = number / 100;
        int second = number / 10 % 10;
        int third = number % 10;
        return first + second + third;
    }
}
