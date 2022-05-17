package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FortyNine {

    private static final Scanner scanner = new Scanner(System.in);

    public static void numericInNumber() {
        try {
            System.out.println("Give me a number");
            int inputNumber = scanner.nextInt();
            if(inputNumber <= 10 || inputNumber > 99) throw new InputMismatchException();
            System.out.println("Start");
            for (int i = 1000; i < 10000; i++) {
                if (haveAMatch(i, inputNumber)) System.out.print(i + " ");
            }
            System.out.println("\nFinish");
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static boolean haveAMatch(int rowNumber, int inputNumber) {
        return rowNumber / 10 == inputNumber || rowNumber % 100 == inputNumber;
    }
}
