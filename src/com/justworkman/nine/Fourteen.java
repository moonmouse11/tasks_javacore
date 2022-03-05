package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fourteen {

    static Scanner scanner = new Scanner(System.in);

    public static void gradeProblem() {
        try {
            System.out.println("Give me your grade");
            int grade = scanner.nextInt();
            System.out.println("Your grade is " + switchGrade(grade));
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid grade");
        }
    }

    private static String switchGrade(int grade) {
        switch (grade) {
            case 1 :
            case 2 :
                return "not satisfying";
            case 3:
                return "satisfying";
            case 4:
                return "good";
            case 5:
                return "excellent";
            default:
                throw new InputMismatchException();
        }
    }
}
