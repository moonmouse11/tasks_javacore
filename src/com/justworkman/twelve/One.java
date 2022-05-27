package com.justworkman.twelve;

import java.util.InputMismatchException;
import java.util.Scanner;

public class One {

    private static final Scanner scanner = new Scanner(System.in);
    private static int positiveCount = 0;

    public static void tenNumbers() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Give me a " + (i + 1) + " number");
                String answer = scanner.nextLine();
                int number = Integer.parseInt(answer.trim());
                if (number >= 0) positiveCount++;
            } catch (NumberFormatException exception) {
                System.out.println("Try another format");
                i--;
            }
        }
        System.out.println("Count of positive numbers " + positiveCount);
    }
}
