package com.justworkman.six;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ten {

    static Scanner scanner = new Scanner(System.in);

    public static void decadeProblem() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number > 9 && number < 100) {
                anotherMethod(number);
            } else {
                System.out.println("Not a suit number");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a number");
        }
    }

    private static void anotherMethod(int number) {
        int first = number / 10;
        int second = number % 10;
        if (number > (first * second)) {
            System.out.println("Number is bigger");
        } else if (number < (first * second)) {
            System.out.println("Number is lower");
        } else {
            System.out.println("Number is equals");
        }
    }
}
