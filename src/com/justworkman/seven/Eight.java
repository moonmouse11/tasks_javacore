package com.justworkman.seven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eight {

    static Scanner scanner = new Scanner(System.in);

    public static void tableProblem() {
        try {
            System.out.println("How many pupils we have");
            int pupils = scanner.nextInt();
            System.out.println("How many tables in classroom");
            int tables = scanner.nextInt();
            if (pupils < 0 || tables < 0) {
                throw new InputMismatchException();
            }
            if (pupils / 2 <= tables) {
                System.out.println("All fine");
            } else {
                System.out.println("We need more tables");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a suit number");
        }
    }
}
