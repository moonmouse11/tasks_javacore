package com.justworkman.fourteen;

import java.util.Scanner;

public class Six {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void mediumProblem() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 1; i<= 27; i++) {
            try {
                System.out.println("Give me a number");
                String inputNumber = SCANNER.nextLine();
                int number = Integer.parseInt(inputNumber.trim());
                if(number < min) min = number;
                if(number > max) max = number;
                sum += number;
            } catch (NumberFormatException exception) {
                i--;
                System.out.println("Not a valid number");
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        int medium = Math.abs((min + max) / 2);
        System.out.println("Medium: " + medium);
        int mediumForArray = sum / 27;
        System.out.println("Medium for array: " + mediumForArray);
    }
}
