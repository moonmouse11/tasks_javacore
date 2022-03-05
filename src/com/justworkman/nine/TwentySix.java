package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentySix {

    static Scanner scanner = new Scanner(System.in);

    public static void innerNumber() {
        try {
            System.out.println("Give me a decade number");
            int innerNumber = scanner.nextInt();
            if (innerNumber < 10 || innerNumber > 99) throw new InputMismatchException();
            System.out.println("Give me a thousand number");
            int wholeNumber = scanner.nextInt();
            if (wholeNumber < 1000 || wholeNumber > 9999) throw new InputMismatchException();
            if (isInner(wholeNumber, innerNumber)) {
                System.out.println("It's a inner");
            } else {
                System.out.println("Not inner");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static boolean isInner(int wholeNumber, int innerNumber) {
        if (wholeNumber % 100 == innerNumber) return true;
        if (wholeNumber / 100 == innerNumber) return true;
        return wholeNumber / 10 % 100 == innerNumber;
    }
}
