package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyFour {

    private static final Scanner scanner = new Scanner(System.in);

    public static void progressiveNumberXTwo() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            System.out.println("Start");
            for (int i = 0; i > (number * 2) * -8; i = i - 8) {
                System.out.print(i + " ");
            }
            System.out.println("\nFinish");
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
