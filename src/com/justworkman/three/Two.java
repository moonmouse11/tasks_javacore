package com.justworkman.three;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Two {

    private static Scanner scanner = new Scanner(System.in);

    public static void lengthProblem() {
        try {
            System.out.println("Give me your length in centimeter");
            int centimeter = scanner.nextInt();
            double inch = centimeter / 2.54;
            System.out.println("Inch = " + inch);
        } catch (InputMismatchException exception) {
            System.out.println("Not a number");
        }
    }
}
