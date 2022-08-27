package com.justworkman.fifteen;

import java.util.Scanner;

public class ThirtySix {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void numberIsPow() {
        try {
            System.out.println("Give me a number");
            String inputNumber = SCANNER.nextLine();
            long number = Long.parseLong(inputNumber.trim());
            int pow = 0;
            int numeric = 0;
            while (pow < number) {
                numeric++;
                pow = (int) Math.pow(numeric, 2);
            }
            if (pow == number) {
                System.out.println("We found that number " + numeric);
            } else {
                System.out.println("No, that number doesn't exist");
            }
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }
}
