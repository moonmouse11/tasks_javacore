package com.justworkman.thirteen;

import java.util.Scanner;

public class Seventeen {
    private static final Scanner scanner = new Scanner(System.in);

    public static void fibonacciNumbers() {
        try {
            System.out.println("Give me your number in Fibonacci list");
            String inputNumber = scanner.nextLine();
            int number = Integer.parseInt(inputNumber.trim());
            if (number < 1) throw new NumberFormatException();
            int[] fibonacci = new int[number];
            int sum = 1;
            fibonacci[0] = 0;
            fibonacci[1] = 1;
            System.out.println("Start");
            System.out.print(fibonacci[0] + " " + fibonacci[1] + " ");
            for (int i = 2; i < number; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                System.out.print(fibonacci[i] + " ");
                sum += fibonacci[i];
            }
            System.out.println("\nFinish");
            System.out.println("Answer " + sum);
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }
}
