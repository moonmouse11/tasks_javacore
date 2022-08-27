package com.justworkman.fifteen;

import java.util.Scanner;

public class Forty {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void maxDivider() {
        try {
            System.out.println("Give me a number");
            String inputNumber = SCANNER.nextLine();
            int number = Integer.parseInt(inputNumber.trim());
            int count = 0;
            for (int i = number - 1; i > 1; i--) {
                if (number % i == 0) {
                    count++;
                    System.out.println("We found that number " + i);
                    break;
                }
            }
            if (count == 0) System.out.println("That number doesn't exist");

        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }


}
