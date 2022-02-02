package com.justworkman.one;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Six {
    public static void simpleScanner() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Give me first integer");
            int first = scanner.nextInt();
            System.out.println("Give me second integer");
            int second = scanner.nextInt();
            int answer = first * 10 + second;
            System.out.println("Answer: " + answer);
        } catch (InputMismatchException exception) {
            System.out.println("You miss");
        }
    }
}
