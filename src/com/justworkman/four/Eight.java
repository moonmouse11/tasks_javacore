package com.justworkman.four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eight {

    static Scanner scanner = new Scanner(System.in);

    public static void numberProblem() {
        try {
            System.out.println("Give me a number");
            int scan = scanner.nextInt();
            if (scan > 99 && scan < 1000) {
                StringBuilder reverse = new StringBuilder(String.valueOf(scan));
                int answer = Integer.parseInt(String.valueOf(reverse.reverse())) - 20;
                System.out.println("Answer = " + answer);
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException exception) {
            System.out.println("Wrong input number");
        }
    }
}
