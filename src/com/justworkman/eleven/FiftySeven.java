package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FiftySeven {

    private static final Scanner scanner = new Scanner(System.in);

    public static void rowRaise() {
        try {
            System.out.println("Give me a number");
            int inputNumber = scanner.nextInt();
            System.out.println("Start");
            for (int i = 0; i < 15; i++) {
                System.out.print(1 + i*inputNumber + "#");
            }
            System.out.println("\nFinish");
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
