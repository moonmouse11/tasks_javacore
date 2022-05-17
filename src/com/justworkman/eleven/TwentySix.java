package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentySix {

    private static final Scanner scanner = new Scanner(System.in);

    public static void negativeArray() {
        try {
            System.out.println("Give me number");
            int number = scanner.nextInt();
            if (number <= 0) {
                throw new InputMismatchException();
            }
            System.out.println("Start");
            for (int i = (number * -1) + 1; i < number; i++) {
                System.out.print(i + " ");
            }
            System.out.println("\nFinish");
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
