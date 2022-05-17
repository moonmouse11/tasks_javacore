package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentySeven {

    private static final Scanner scanner = new Scanner(System.in);

    public static void sumInArray() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number <= 0 || number > 10) {
                throw new InputMismatchException();
            }
            System.out.println("Start");
            for (int i = 10; i < 100; i++) {
                if (number == sumOfNumerals(i)) {
                    System.out.print(i +" ");
                }
            }
            System.out.println("\nFinish");
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static int sumOfNumerals(int number) {
        int first = number % 10;
        int second = number / 10;
        return first + second;
    }
}
