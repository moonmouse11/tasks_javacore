package com.justworkman.twelve;

import java.util.Scanner;

public class Seventeen {

    private static final Scanner scanner = new Scanner(System.in);

    public static void familyNumber() {
        try {
            System.out.println("Give me a first number");
            String inputFirstNumber = scanner.nextLine();
            int firstNumber = Integer.parseInt(inputFirstNumber.trim());
            System.out.println("Give me a second number");
            String inputSecondNumber = scanner.nextLine();
            int secondNumber = Integer.parseInt(inputSecondNumber.trim());
            int firstDividersCounter = getDividers(firstNumber);
            int secondDividersCounter = getDividers(secondNumber);
            if (firstDividersCounter == secondDividersCounter) {
                System.out.println("Numbers relation");
            } else {
                System.out.println("Just a number");
            }
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static int getDividers(int number) {
        int dividersCount = 0;
        for(int i = 1; i <= number / 2 + 1; i++) {
            if(number % i == 0) dividersCount++;
        }
        return dividersCount;
    }
}
