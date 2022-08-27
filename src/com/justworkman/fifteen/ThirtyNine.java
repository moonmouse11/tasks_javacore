package com.justworkman.fifteen;

import java.util.Scanner;

public class ThirtyNine {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void minDivider() {
        try {
            System.out.println("Give me a number");
            String inputNumber = SCANNER.nextLine();
            int number = Integer.parseInt(inputNumber.trim());
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    if (i == number) {
                        System.out.println("It's a simple number");
                    } else {
                        System.out.println("We found that number " + i);
                        break;
                    }
                }
            }
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }
}
