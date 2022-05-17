package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirtyFive {

    private static final Scanner scanner = new Scanner(System.in);

    public static void nextNotEvenNumbers() {
        try {
            System.out.println("Give me your number");
            int number = scanner.nextInt();
            System.out.println("Start");
            int count = 0;
            for (int i = number + 1; ; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                    count++;
                }
                if (count == 25) break;
            }
            System.out.println("\nFinish");
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
