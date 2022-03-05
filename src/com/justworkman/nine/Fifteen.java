package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fifteen {

    static Scanner scanner = new Scanner(System.in);

    public static void monthProblem() {
        try {
            System.out.println("Give me a number of month");
            int month = scanner.nextInt();
            String answer = switchMonth(month);
            System.out.println("Now is a " + answer);
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid month");
        }
    }

    private static String switchMonth(int month) {
        switch (month) {
            case 12:
            case 1:
            case 2:
                return "winter";
            case 3:
            case 4:
            case 5:
                return "spring";
            case 6:
            case 7:
            case 8:
                return "summer";
            case 9:
            case 10:
            case 11:
                return "autumn";
            default:
                throw new InputMismatchException();
        }
    }
}
