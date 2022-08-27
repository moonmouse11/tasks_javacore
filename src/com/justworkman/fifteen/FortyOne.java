package com.justworkman.fifteen;

import java.util.Scanner;

public class FortyOne {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void decrementNumber() {
        try {
            System.out.println("Give me a first number");
            String firstInput = SCANNER.nextLine();
            int firstNumber = Integer.parseInt(firstInput.trim());
            System.out.println("Give me a second number");
            String secondInput = SCANNER.nextLine();
            int secondNumber = Integer.parseInt(secondInput.trim());
            int big = Math.max(firstNumber, secondNumber);
            int small = Math.min(firstNumber, secondNumber);
            int count = 0;
            while (big > small) {
                if (big % 2 == 0) {
                    big = big / 2;
                    if (big > small) {
                        System.out.println("Is even " + big);
                        count++;
                    }
                } else {
                    big = big - 1;
                    System.out.println("Not even " + big);
                    count++;
                }
            }
            System.out.println("Count of decrement " + count);
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }
}
