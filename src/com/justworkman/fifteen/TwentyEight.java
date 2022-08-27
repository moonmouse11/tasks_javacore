package com.justworkman.fifteen;

import java.util.Scanner;

public class TwentyEight {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void lengthInNumber() {
        try {
            System.out.println("Give me a number");
            String inputNumber = SCANNER.nextLine();
            long number = Long.parseLong(inputNumber.trim());
            System.out.println("Count of numeric " + inputNumber.trim().length());
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }
}
