package com.justworkman.eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyOne {

    static Scanner scanner = new Scanner(System.in);

    public static void raiseNumber() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if(number < 0) {
                throw new InputMismatchException();
            }
            int answer = 0;
            int last = number % 10;
            if (last >= 5) {
                answer = (number / 10 + 1) * 10;
            } else {
                answer = (number / 10) * 10;
            }
            System.out.println("Answer = " + answer);
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
