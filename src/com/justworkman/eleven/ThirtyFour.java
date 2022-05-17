package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirtyFour {

    private static final Scanner scanner = new Scanner(System.in);

    public static void nextNumbers() {
        try {
            System.out.println("Give me your number");
            int number = scanner.nextInt();
            System.out.println("Start");
            for (int i = number + 1; i < number + 19; i++) {
                System.out.print(i + " ");
            }
            System.out.println("\nFinish");
        }catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
