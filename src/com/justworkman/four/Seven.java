package com.justworkman.four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Seven {

    static Scanner scanner = new Scanner(System.in);

    public static void numberProblem() {
        try {
            System.out.println("Give me a number");
            int scan = scanner.nextInt();
            if (scan > 9 && scan < 100) {
                StringBuilder reverse = new StringBuilder(String.valueOf(scan));
                int answer = 8 + Integer.parseInt(String.valueOf(reverse.reverse()));
                System.out.println("Answer = " + answer);
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException exception) {
            System.out.println("Wrong input number");
        }
    }
}
