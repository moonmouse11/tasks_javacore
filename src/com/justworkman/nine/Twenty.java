package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Twenty {

    static Scanner scanner = new Scanner(System.in);

    public static void secondsProblem() {
        try {
            System.out.println("Give me your seconds");
            int seconds = scanner.nextInt();
            if (seconds < 0 || seconds > 3600) throw new InputMismatchException();
            int minutes = seconds / 60;
            int secondRemainder = seconds % 60;
            if (minutes == 0) {
                System.out.println("Answer " + secondRemainder + " seconds");
            } else {
                System.out.println("Answer " + minutes + " minutes " + secondRemainder + " seconds");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid second");
        }
    }
}
