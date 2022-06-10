package com.justworkman.thirteen;

import java.util.Scanner;

public class Seven {

    private static final Scanner scanner = new Scanner(System.in);

    public static void doubleEven() {
        try {
            System.out.println("Give me a number");
            String inputNumber = scanner.nextLine();
            int number = Integer.parseInt(inputNumber.trim());
            if (number <= 0) throw new NumberFormatException();
            int sumOfDividers = sumOfDividers(number);
            if (isEven(number) && isEven(sumOfDividers)) {
                System.out.println("It's a double even number");
            } else {
                System.out.println("Just a number");
            }
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static int sumOfDividers(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) sum += i;
        }
        return sum;
    }

    private static boolean isEven(int number) {
        return (number & 2) == 0;
    }
}
