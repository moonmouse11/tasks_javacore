package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyEight {

    private static final Scanner scanner = new Scanner(System.in);

    public static void sumInArray() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number <= 0) {
                throw new InputMismatchException();
            }
            System.out.println("Start");
            for(int i = 100; i < 1000; i++) {
                if(number == sumOfNumber(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println("\nFinish");
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static int sumOfNumber(int number) {
        int first = number / 100;
        int second = number / 10 % 10;
        int third = number % 10;
        return first + second + third;
    }
}
