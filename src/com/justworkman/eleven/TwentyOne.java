package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyOne {

    private static final Scanner scanner = new Scanner(System.in);

    public static void printInputValue() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            System.out.println("Start");
            for (int i = number + 1; i < number + 18; i++) {
                System.out.print(i + " ");
            }
            System.out.println("\nFinish");
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid value");
        }
    }
}
