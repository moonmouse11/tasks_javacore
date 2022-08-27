package com.justworkman.fifteen;

import java.util.Scanner;

public class Thirty {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void zeroInNumber() {
        try {
            System.out.println("Give me a number");
            String inputNumber = SCANNER.nextLine().trim();
            long number = Long.parseLong(inputNumber);
            int countZero = countIt(number);
            if(countZero == 0) {
                System.out.println("No zero in number");
            } else {
                System.out.println("Count of zero in number " + countZero);
            }
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static int countIt(long number) {
        int count = 0;
        while (number != 0) {
            int numeric = (int) number % 10;
            if(numeric == 0) count++;
            number = number / 10;
         }
        return count;
    }
}
