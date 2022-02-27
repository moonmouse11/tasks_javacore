package com.justworkman.four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fifteen {


    static Scanner scanner = new Scanner(System.in);

    public static void evenPow() {
        try {
            System.out.println("Give me your number");
            int number = scanner.nextInt();
            if (number > 999 && number < 10000) {
                int first = number / 1000;
                int second = number / 100 % 10;
                int third = number / 10 % 10;
                int forth = number % 10;
                int answer = isEven(first) + isEven(second) + isEven(third) + isEven(forth);
                System.out.println("Answer = " + answer);
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException exception) {
            System.out.println("Wrong input number");
        }
    }

    private static int isEven(int number) {
        if (number % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
