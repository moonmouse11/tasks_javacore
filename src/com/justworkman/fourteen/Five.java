package com.justworkman.fourteen;

import java.util.Scanner;

public class Five {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void minMaxMedium() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= 12; i++) {
            try {
                System.out.println("Give me a number");
                String inputNumber = SCANNER.nextLine();
                int number = Integer.parseInt(inputNumber.trim());
                if(number < min) min = number;
                if(number > max) max = number;
            } catch (NumberFormatException exception) {
                i--;
                System.out.println("Not a valid number");
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        int medium = Math.abs((min + max) / 2);
        System.out.println("Medium: " + medium);
    }
}
