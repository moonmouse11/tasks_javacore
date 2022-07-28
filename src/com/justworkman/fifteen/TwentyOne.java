package com.justworkman.fifteen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyOne {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void inputSumOfSum() {
        try {
            System.out.println("Give me a number.");
            String inputNumber = SCANNER.nextLine();
            int number = Integer.parseInt(inputNumber.trim());
            if (number <= 0) throw new InputMismatchException();
            int sum = sumNumeric(number);
            System.out.println("Sum: " + sum);
            while (sum > 9) {
                sum = sumNumeric(sum);
                System.out.println("Sum of sum: " + sum);
            }
        } catch (NumberFormatException | InputMismatchException exception) {
            System.out.println("Not a valid number.");
        }
    }

    private static int sumNumeric(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
