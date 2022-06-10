package com.justworkman.thirteen;

import java.util.Scanner;

public class Six {

    private static final Scanner scanner = new Scanner(System.in);

    public static void exitingNumber() {
        try {
            System.out.println("Give me a number");
            String inputNumber = scanner.nextLine();
            int number = Integer.parseInt(inputNumber.trim());
            if (number <= 0) throw new NumberFormatException();
            String answer = isExiting(number) ? "It a exiting number" : "Just a number";
            System.out.println(answer);
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static boolean isExiting(int number) {
        int sumOfDividers = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sumOfDividers += i;
        }
        return number == sumOfDividers;
    }
}
