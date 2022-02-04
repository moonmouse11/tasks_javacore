package com.justworkman.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirtyTwo {

    static Scanner scanner = new Scanner(System.in);

    public static void alteredNumber() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            System.out.println("Answer: " + number * (-1));
        } catch (InputMismatchException exception) {
            System.out.println("Not a number");
        }
    }
}
