package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirtyOne {

    static Scanner scanner = new Scanner(System.in);

    public static void centuryProblem() {
        try {
            System.out.println("Give me your century");
            int century = scanner.nextInt();
            if (century < 1000 || century > 9999) throw new InputMismatchException();
            String centuryName = centuryName(century);
            System.out.println(centuryName + " century");
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid time");
        }
    }

    private static String centuryName(int century) {
        century = century / 100;
        switch (century) {
            case 10:
                return "Ten";
            case 11:
                return "Eleven";
            case 12:
                return "Twelve";
            case 13:
                return "Thirteen";
            case 14:
                return "Fourteen";
            case 15:
                return "Fifteen";
            case 16:
                return "Sixteen";
            case 17:
                return "Seventeen";
            case 18:
                return "Eighteen";
            case 19:
                return "Nineteen";
            case 20:
                return "Twenty";
            case 21:
                return "Twenty One";
            default:
                return "Not in this time";
        }
    }
}
