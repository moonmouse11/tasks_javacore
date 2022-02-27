package com.justworkman.three;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eight {

    static Scanner scanner = new Scanner(System.in);

    public static void triangleProblem() {
        try {
            System.out.println("Give me a base");
            double base = scanner.nextDouble();
            System.out.println("Give me a height");
            double height = scanner.nextDouble();
            double square = (base * height) / 2;
            double perimeter = 2 * (base + height);
            System.out.println("Square of triangle " + square);
            System.out.println("Perimeter of figure " + perimeter);
        } catch (InputMismatchException exception) {
            System.out.println("Sorry? wrong number");
        }
    }
}
