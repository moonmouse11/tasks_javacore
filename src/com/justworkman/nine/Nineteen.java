package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nineteen {

    static Scanner scanner = new Scanner(System.in);

    public static void squareProblem(){
        try {
            System.out.println("Give me first side");
            int firstSide = scanner.nextInt();
            System.out.println("Give me a second side");
            int secondSide = scanner.nextInt();
            if (firstSide <= 0 || secondSide <= 0) throw new InputMismatchException();
            if (firstSide == secondSide) {
                System.out.println("It's a square");
            } else {
                System.out.println("It's a rectangle");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid side of figure");
        }
    }
}
