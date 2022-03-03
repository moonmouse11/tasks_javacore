package com.justworkman.eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Seventeen {

    static Scanner scanner = new Scanner(System.in);

    public static void doubleEven() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if(number < 100 || number > 999) {
                throw new InputMismatchException();
            }
            boolean firstTrue = isEven(number);
            boolean secondTrue = isSumEven(number);
            if (firstTrue && secondTrue) {
                System.out.println("It's a double even number");
            } else {
                System.out.println("Not a double even");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static boolean isSumEven(int number) {
        int first = number / 100;
        int second = number / 10 % 10;
        int third = number % 10;
        int sum = first + second + third;
        return sum % 2 == 0;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
