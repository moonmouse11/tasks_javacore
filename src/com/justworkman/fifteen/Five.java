package com.justworkman.fifteen;

import java.util.Scanner;

public class Five {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void numberCount() {
        int count = 0;
        int number = 0;
        System.out.println("Give me a number");
        while(number != 999) {
            try {
                String inputNumber = SCANNER.nextLine();
                number = Integer.parseInt(inputNumber.trim());
                count++;
            }catch (NumberFormatException exception) {
                System.out.println("Not a valid number");
            }
        }
        System.out.println("Counter of input numbers: " + count);
    }
}
