package com.justworkman.eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eighteen {

    static Scanner scanner = new Scanner(System.in);

    public static void evenPow() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number < 100 || number > 999) {
                throw new InputMismatchException();
            }
            int answer = 0;
            answer += isPowEven(number);
            System.out.println("Pow of even = " + answer);
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static int isPowEven(int number) {
        if(number == 0) {
            return 0;
        }
        int forReturn = number % 10;
        if (forReturn % 2 == 0) {
            return 1 + isPowEven(number / 10);
        } else {
            return isPowEven(number / 10);
        }
    }
}


