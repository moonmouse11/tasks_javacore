package com.justworkman.twelve;

import java.util.Scanner;

public class Seven {

    private static final Scanner scanner = new Scanner(System.in);

    public static void twentyNineNext() {
        try {
            System.out.println("Give me a main number");
            String input = scanner.nextLine();
            int firstNumber = Integer.parseInt(input.trim());
            int equalsCount = 0;
            int lowerCount = 0;
            for (int i = 1; i < 30; i++) {
                try {
                    System.out.println("Give me a " + i + " number");
                    String inputNumber = scanner.nextLine();
                    int number = Integer.parseInt(inputNumber.trim());
                    if (number == firstNumber) equalsCount++;
                    if (number < firstNumber) lowerCount++;
                } catch (NumberFormatException exception) {
                    System.out.println("Not a valid number");
                    i--;
                }
            }
            System.out.println("Equals count " + equalsCount);
            System.out.println("Lower count " + lowerCount);
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid first number");
        }
    }
}
