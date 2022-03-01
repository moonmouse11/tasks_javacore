package com.justworkman.seven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ten {

    static Scanner scanner = new Scanner(System.in);

    public static void anotherProblem() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Answer = " + (number * (-1)));
            } else {
                System.out.println("Answer = 0");
            }
        } catch (InputMismatchException exception) {
            System.out.println("It's not a number");
        }
    }

}
