package com.justworkman.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirtyThree {

    static Scanner scanner = new Scanner(System.in);

    public static void trapezoidSquare() {
        try {
            System.out.println("Give me low base");
            int low = scanner.nextInt();
            System.out.println("Give me high base");
            int high = scanner.nextInt();
            System.out.println("Give me a height");
            int height = scanner.nextInt();
            double square = ((low + high) * height) * 0.5;
            System.out.println("Answer: " + square);
        } catch (InputMismatchException exception) {
            System.out.println("Try another figure");
        }
    }
}
