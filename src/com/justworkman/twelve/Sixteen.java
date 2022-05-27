package com.justworkman.twelve;

import java.util.Scanner;

public class Sixteen {
    private static final Scanner scanner = new Scanner(System.in);

    public static void divideSimpleProblem() {
        try {
            System.out.println("Give me a number");
            String inputNumber = scanner.nextLine();
            int number = Integer.parseInt(inputNumber.trim());
            if (number < 0) throw new NumberFormatException();
            int counter = 0;
            for(int i = 2; i <= number / 2 + 1; i++) {
                if (number % i == 0) counter++;
            }
            if(counter == 0) {
                System.out.println("It's a simple number");
            } else {
                System.out.println("Just a number");
            }
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }
}
