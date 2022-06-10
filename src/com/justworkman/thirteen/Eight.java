package com.justworkman.thirteen;

import java.util.Scanner;

public class Eight {

    private static final Scanner scanner = new Scanner(System.in);

    public static void doubleDivide() {
        try {
            System.out.println("Give me a number");
            String inputNumber = scanner.nextLine();
            int number = Integer.parseInt(inputNumber.trim());
            if (number <= 0) throw new NumberFormatException();
            int sumOfDividers = sumOfDividers(number);
            int countOfDividers = countOfDividers(number);
            if (number % countOfDividers == 0 && sumOfDividers % countOfDividers == 0) {
                System.out.println("It's a double divide number");
            } else {
                System.out.println("Just a number");
            }
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
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
            if (number % i == 0) sum += i;
        }
        return sum;
    }

}
