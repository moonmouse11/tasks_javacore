package com.justworkman.fifteen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Seventeen {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void numericIntoNumber() {
        try {
            System.out.println("Give me a number");
            String inputNumber = SCANNER.nextLine();
            int number = Integer.parseInt(inputNumber.trim());
            System.out.println("Give me a numeric");
            String inputNumeric = SCANNER.nextLine();
            int numeric = Integer.parseInt(inputNumeric.trim());
            if(numeric > 10 || numeric < 0) throw new InputMismatchException();
            if(isIn(number, numeric)) {
                System.out.println("Numeric in number");
            } else {
                System.out.println("Numeric not in number");
            }
        } catch (NumberFormatException | InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static boolean isIn(int number, int numeric) {
        while (number != 0) {
            int toEquals = number % 10;
            if(toEquals == numeric) return true;
            number = number / 10;
        }
        return false;
    }
}


