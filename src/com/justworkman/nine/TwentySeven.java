package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentySeven {
    static Scanner scanner = new Scanner(System.in);

    public static void innerNumber() {
        try {
            System.out.println("Give me a decade number");
            int innerNumber = scanner.nextInt();
            if (innerNumber < 10 || innerNumber > 99) throw new InputMismatchException();
            System.out.println("Give me a thousand number");
            int wholeNumber = scanner.nextInt();
            if (wholeNumber < 1000 || wholeNumber > 9999) throw new InputMismatchException();
            int howMuch = 0;
            howMuch += howMuch(wholeNumber, innerNumber);
            System.out.println("We meet inner number in whole " + howMuch + " times");
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static int howMuch(int wholeNumber, int innerNumber) {
        if (wholeNumber < 10) return 0;
        if (wholeNumber % 100 == innerNumber) {
            return 1 + howMuch(wholeNumber / 10, innerNumber);
        } else {
            return howMuch(wholeNumber / 10, innerNumber);
        }
    }
}
