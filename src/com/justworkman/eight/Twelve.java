package com.justworkman.eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Twelve {

    static Scanner scanner = new Scanner(System.in);

    public static void degreesProblem() {
        try {
            System.out.println("Give me your grade");
            int grade = scanner.nextInt();
            if (grade < 0 || grade > 5) {
                throw new InputMismatchException();
            }
            System.out.println("Grade : " + grade);
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid grade");
        }
    }
}
