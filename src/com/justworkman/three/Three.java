package com.justworkman.three;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Three {
    private static Scanner scanner = new Scanner(System.in);

    public static void lengthProblem() {
        try {
            System.out.println("Give me your length in inch");
            int inch = scanner.nextInt();
            double centimeter = inch * 2.54;
            System.out.println("Centimeter = " + centimeter);
        } catch (InputMismatchException exception) {
            System.out.println("Not a number");
        }
    }
}
