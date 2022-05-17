package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sixty {

    private static final Scanner scanner = new Scanner(System.in);

    public static void powRow() {
        try {
            System.out.println("Give me pow number");
            int powRow = scanner.nextInt();
            System.out.println("Start");
            for(int i = 1; i <= powRow; i++) {
                System.out.print(Math.pow(2, i) + " ");
            }
            System.out.println("\nFinish");
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
