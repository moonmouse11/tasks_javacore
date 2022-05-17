package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyFive {

    private static final Scanner scanner = new Scanner(System.in);

    public static void raiseFromUser() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number <= 0)
                throw new InputMismatchException();
            System.out.println("Start");
            for(int i = 0; i <= number; i++) {
                System.out.print(i + " ");
            }
            System.out.println("\nFinish");
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
