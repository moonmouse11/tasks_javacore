package com.justworkman.fifteen;

import java.util.Scanner;

public class TwentyNine {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void sumOfNumeric() {
        try {
            System.out.println("Give me a number");
            String inputNumber = SCANNER.nextLine();
            long number = Long.parseLong(inputNumber.trim());
            int sum = sumIt(number);
            System.out.println("Sum of numeric " + sum);
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static int sumIt(long number) {
        int sum = 0;
        while (number != 0) {
            int numeric = (int) number % 10;
            sum += numeric;
            number = number / 10;
        }
        return sum;
    }
}
