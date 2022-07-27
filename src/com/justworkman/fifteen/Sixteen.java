package com.justworkman.fifteen;

import java.util.Scanner;

public class Sixteen {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static int nonEvenCount = 0;
    private static int sumOfNumeric = 0;

    public static void nonEvenNumberProblem() {
        try {
            System.out.println("Give me a number");
            String input = SCANNER.nextLine();
            int number = Integer.parseInt(input.trim());
            sumOfNumeric = sumIt(number);
            System.out.println("Non even count: " + nonEvenCount);
            System.out.println("Sum of non even numeric: " + sumOfNumeric);

        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static int sumIt(int number) {
        int sum = 0;
        while (number != 0) {
            int numeric = number % 10;
            if (numeric % 2 != 0) {
                nonEvenCount++;
                sum += numeric;
            }
            number = number / 10;
        }
        return sum;
    }
}
