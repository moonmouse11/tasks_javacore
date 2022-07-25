package com.justworkman.fifteen;

import java.util.Scanner;

public class Six {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void numberCountAndSum() {
        int count = 0;
        int number = 0;
        int sum = 0;
        System.out.println("Give me a number");
        while(number != 999) {
            try {
                String inputNumber = SCANNER.nextLine();
                number = Integer.parseInt(inputNumber.trim());
                count++;
                sum += Math.abs(number);
            }catch (NumberFormatException exception) {
                System.out.println("Not a valid number");
            }
        }
        System.out.println("Counter of input numbers: " + count);
        System.out.println("Sum of input numbers: " + sum);
    }
}
