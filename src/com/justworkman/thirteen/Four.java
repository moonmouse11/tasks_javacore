package com.justworkman.thirteen;

import java.util.Scanner;

public class Four {

    private static final Scanner scanner = new Scanner(System.in);

    public static void dividerProblem() {
        try {
            System.out.println("Give me your number");
            String inputNumber = scanner.nextLine();
            int number = Integer.parseInt(inputNumber.trim());
            if (number <= 0) throw new NumberFormatException();
            printDividers(number);
            System.out.println("Count of dividers " + countOfDividers(number));
            System.out.println("Sum of dividers " + sumOfDividers(number));
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static void printDividers(int number) {
        System.out.println("Start");
        for (int i = 1; i <= number; i++) {
            if(number % i == 0) System.out.print(i + "\t");
        }
        System.out.println("\nFinish");
    }

    private static int countOfDividers(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if(number % i == 0) count++;
        }
        return count;
    }

    private static int sumOfDividers(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if(number % i == 0) sum += i;
        }
        return sum;
    }
}
