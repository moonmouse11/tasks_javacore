package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fifty {

    private static final Scanner scanner = new Scanner(System.in);

    public static void anotherNumeralProblem() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number < 10 || number > 100) throw new InputMismatchException();
            int count = 0;
            System.out.println("Start");
            for (int i = 1000; i < 10000; i++) {
                if(sumOfNumeric(i / 100) == number && sumOfNumeric(i % 100) == number){
                    System.out.print(i + " ");
                    count++;
                }
            }
            if (count != 0) {
                System.out.println("\nFinish");
            } else {
                System.out.println("We don't have that numbers. Try another");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static int sumOfNumeric(int number) {
        int first = number / 10;
        int second = number % 10;
        return first + second;
    }
}
