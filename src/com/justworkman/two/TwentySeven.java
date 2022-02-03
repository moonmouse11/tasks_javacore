package com.justworkman.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentySeven {
    static Scanner scanner = new Scanner(System.in);

    public static void weightProblem() {
        try {
            System.out.println("Give me weight in grams");
            double weight = scanner.nextInt();
            double kilo = weight / 1000;
            System.out.println("Answer: " + kilo + " kilogram");
        } catch (InputMismatchException exception) {
            System.out.println("Sorry. You miss");
        }
    }
}
