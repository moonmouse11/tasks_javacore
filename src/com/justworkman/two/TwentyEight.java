package com.justworkman.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyEight {
    static Scanner scanner = new Scanner(System.in);

    public static void marineProblem() {
        try {
            System.out.println("Give me a floats, marine.");
            int floats = scanner.nextInt();
            double meters = floats * 185.2;
            double kilometers = meters / 1000;
            System.out.println("Answer in meters: " + meters);
            System.out.println("Answer int kilometers: " + kilometers);
        } catch (InputMismatchException exception) {
            System.out.println("Wrong. Capitan don't like it.");
        }
    }
}
