package com.justworkman.fifteen;

import java.util.Scanner;

public class ThirtyFive {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void reverseNumber() {
        try {
            System.out.println("Give me a number");
            String inputNumber = SCANNER.nextLine();
            long number = Long.parseLong(inputNumber.trim());
            StringBuilder forReverse = new StringBuilder();
            forReverse.append(number);
            System.out.println("Reverse number " + forReverse.reverse());
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }
}
