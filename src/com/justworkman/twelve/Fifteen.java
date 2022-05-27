package com.justworkman.twelve;

import java.util.Scanner;

public class Fifteen {

    private static final Scanner scanner = new Scanner(System.in);

    public static void divideProblem() {
        try {
            System.out.println("Give me a number");
            String inputNumber = scanner.nextLine();
            int number = Integer.parseInt(inputNumber.trim());
            if (number < 0) throw new NumberFormatException();
            System.out.println("Start dividers");
            for(int i = 2; i <= number / 2 + 1; i++) {
                if (number % i == 0) System.out.print(i + " ");
            }
            System.out.println("\nFinish");
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }
}
