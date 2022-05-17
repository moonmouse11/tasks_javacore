package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ThirtyEight {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    public static void sqrtProblem() {
        try {
            System.out.println("Give me your number");
            int number = scanner.nextInt();
            if (number <= 0) throw new InputMismatchException();
            int[] array = randomInArray(new int[15]);
            for (int num : array) {
                if (num % number == 0) {
                    System.out.println(num + " " + (int) Math.abs(Math.sqrt(num / 100)));
                } else {
                    System.out.println(num + " " + (int) Math.sqrt(num % 100 / 10));
                }
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid positive number");
        }
    }

    private static int[] randomInArray(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(899) + 100;
        }
        return ints;
    }
}
