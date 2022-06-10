package com.justworkman.thirteen;

import java.util.Scanner;

public class Sixteen {

    private static final Scanner scanner = new Scanner(System.in);

    public static void mathProgression () {
        try {
            System.out.println("Give me your number");
            String inputNumber = scanner.nextLine();
            int number = Integer.parseInt(inputNumber.trim());
            if(number <= 0) throw new NumberFormatException();
            double sum = 0;
            for (int i = 1; i <= number; i++) {
                double index = Math.sqrt(2 * i - 1);
                sum += index;
                System.out.println("Index of progression " + index);
            }
            System.out.println("Sum of progression " + sum);
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }
}
