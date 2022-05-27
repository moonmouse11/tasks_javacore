package com.justworkman.twelve;

import java.util.Scanner;

public class Three {

    private static final Scanner scanner = new Scanner(System.in);
    private static int count = 0;

    public static void twelveNumbers() {
        try {
            System.out.println("Give me a 1 number");
            String firstScanner = scanner.nextLine();
            int first = Integer.parseInt(firstScanner.trim());
            for (int i = 2; i < 13; i++) {
                try {
                    System.out.println("Give me a " + i + " number");
                    String nextNumber = scanner.nextLine();
                    int number = Integer.parseInt(nextNumber.trim());
                    if (number > first) count++;
                } catch (NumberFormatException exception) {
                    System.out.println("Not a valid number");
                    i--;
                }
            }
            System.out.println("Count of numbers bigger than first " + count);
        } catch (NumberFormatException exception) {
            System.out.println("Not a number for equality");
        }
    }
}
