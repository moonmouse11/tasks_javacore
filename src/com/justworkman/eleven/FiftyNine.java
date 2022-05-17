package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FiftyNine {

    private static final Scanner scanner = new Scanner(System.in);

    public static void nextRowUnknown() {
        try {
            System.out.println("Give me a A number");
            int numberA = scanner.nextInt();
            System.out.println("Give me a B number");
            int numberB = scanner.nextInt();
            int min = Math.min(numberA,numberB);
            int max = Math.max(numberA,numberB);
            System.out.println("Start");
            for (int i = min; i < max; i++) {
                System.out.print(i + "+");
            }
            System.out.println(max);
            System.out.println("Finish");
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
