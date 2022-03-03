package com.justworkman.eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Twenty {

    static Scanner scanner = new Scanner(System.in);

    public static void isZeroIn() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number < 100 || number > 999) {
                throw new InputMismatchException();
            }
            int answer = 0;
            answer += haveAZero(number);
            System.out.println("Zero in number = " + answer);
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static int haveAZero(int number) {
        if (number == 0) return 0;
        int zero = number % 10;
        if (zero == 0) {
            return 1 + haveAZero(number / 10);
        } else {
            return haveAZero(number / 10);
        }
    }
}
