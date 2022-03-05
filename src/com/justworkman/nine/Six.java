package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Six {

    static Scanner scanner = new Scanner(System.in);

    public static void triangleProblem() {
        try {
            System.out.println("Give me a first side");
            int firstSide = scanner.nextInt();
            System.out.println("Give me a second side");
            int secondSide = scanner.nextInt();
            System.out.println("Give me a third side");
            int thirdSide = scanner.nextInt();
            if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0)
                throw new InputMismatchException();
            if ((firstSide + secondSide) > thirdSide && (firstSide + thirdSide) > secondSide && (secondSide + thirdSide) > firstSide) {
                System.out.println("It' s may be a triangle");
            } else {
                System.out.println("It's not a triangle");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid side of triangle");
        }
    }
}
