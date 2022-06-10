package com.justworkman.thirteen;

import java.util.Scanner;

public class Nine {

    private static final Scanner scanner = new Scanner(System.in);

    public static void doubleDividerRelation() {
        try {
            System.out.println("Give me a first number");
            String inputFirstNumber = scanner.nextLine();
            int firstNumber = Integer.parseInt(inputFirstNumber.trim());
            if (firstNumber <= 0) throw new NumberFormatException();
            System.out.println("Give me a second number");
            String inputSecondNumber = scanner.nextLine();
            int secondNumber = Integer.parseInt(inputSecondNumber.trim());
            if (secondNumber <= 0) throw new NumberFormatException();
            int bothDividers = bothDividers(firstNumber, secondNumber);
            if (isEven(bothDividers)) {
                System.out.println("Even-relation numbers");
            } else {
                System.out.println("Just a numbers");
            }

        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static int bothDividers(int firstNumber, int secondNumber) {
        int min = Math.min(firstNumber, secondNumber);
        int sumDividers = 0;
        for (int i = 1; i <= min; i++) {
            if(firstNumber % i == 0 && secondNumber % i == 0) sumDividers += i;
        }
        return sumDividers;
    }
}
