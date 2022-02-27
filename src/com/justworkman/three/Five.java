package com.justworkman.three;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Five {

    static Scanner scanner = new Scanner(System.in);

    public static void triangleMethod() {
        try {
            System.out.println("Give me first leg");
            double firstLeg = scanner.nextDouble();
            System.out.println("Give me a second leg");
            double secondLeg = scanner.nextInt();
            System.out.println("Give me a hypotenuse");
            double hypotenuse = scanner.nextDouble();
            double perimeter = hypotenuse + firstLeg + secondLeg;
            double square = (firstLeg * secondLeg) / 2;
            System.out.println("Triangle perimeter = " + perimeter);
            System.out.println("Triangle square = " + square);
        } catch (InputMismatchException exception) {
            System.out.println("Not a number.");
        }
    }
}
