package com.justworkman.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eighteen {

    static Scanner scanner = new Scanner(System.in);

    public static void printPow() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            int pow = (int) Math.pow(number, 2);
            System.out.println(number + " & " + pow);
        } catch (InputMismatchException exception) {
            System.out.println("No pow, sorry.");
        }
    }
}
