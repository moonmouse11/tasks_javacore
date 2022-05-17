package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyTwo {

    private static final Scanner scanner = new Scanner(System.in);

    public static void printShortNumber() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            System.out.println("Start");
            for (int i = number - 10; i > (number - 10) - (17 * 6); i = i - 6) {
                System.out.print(i + " ");
            }
            System.out.println("\nFinish");
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
