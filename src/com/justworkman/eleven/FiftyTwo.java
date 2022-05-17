package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FiftyTwo {

    private static final Scanner scanner = new Scanner(System.in);

    public static void rowWithPlusAndMinus() {
        try {
            System.out.println("Give me a number");
            int inputNumber = scanner.nextInt();
            if (inputNumber <= 0) throw new InputMismatchException();
            System.out.println("Start");
            for (int i = 0; i < inputNumber; i++) {
                if (i == 0) {
                    System.out.print(inputNumber + "+");
                } else if (i == inputNumber - 1) {
                    System.out.println("1");
                } else {
                    System.out.print((inputNumber - i) + "+");
                }
            }
            System.out.println("Finish");
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
