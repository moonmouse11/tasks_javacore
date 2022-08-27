package com.justworkman.fifteen;

import java.util.Scanner;

public class FortyTwo {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void isFibonacci() {
        try {
            System.out.println("Give me a number");
            String inputNumber = SCANNER.nextLine();
            int number = Integer.parseInt(inputNumber.trim());
            boolean isFibonacci = inArray(number);
            if(isFibonacci) {
                System.out.println("Number in fibonacci array");
            } else {
                System.out.println("Just a number");
            }

        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static boolean inArray(int number) {
        for (int i = 0; i < number; i++) {
            
        }
        return false;
    }
}
