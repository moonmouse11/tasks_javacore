package com.justworkman.fifteen;

import java.util.Scanner;

public class Fourteen {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static int length = 0;
    private static int sumOfNumeric = 0;
    public static void numberProblem() {
        try {
            System.out.println("Give me a number");
            String input = SCANNER.nextLine();
            int number = Integer.parseInt(input.trim());
            length = input.trim().length();
            sumOfNumeric = sumIt(number);
            System.out.println("Length of number: " + length);
            System.out.println("Sum of numeric: " + sumOfNumeric);

        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static int sumIt(int number) {
        int sum = 0;
        while(number != 0) {
            int numeric = number % 10;
            sum += numeric;
            number = number / 10;
        }
        return sum;
    }
}
