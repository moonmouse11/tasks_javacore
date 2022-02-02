package com.justworkman.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyFour {

    static Scanner scanner = new Scanner(System.in);

    public static void rectanglePerimeterAndSquare() {
        try {
            System.out.println("Give me a height");
            int height = scanner.nextInt();
            System.out.println("Give me a width");
            int width = scanner.nextInt();
            int perimeter = 2 * (height + width);
            int square = height * width;
            System.out.printf("%s " + perimeter + "\n", "Perimeter:");
            System.out.printf("%s " + square + "\n", "Square:");
        } catch (InputMismatchException exception) {
            System.out.println("Wrong type");
        }
    }
}
