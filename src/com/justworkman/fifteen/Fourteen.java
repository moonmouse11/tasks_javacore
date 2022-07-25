package com.justworkman.fifteen;

import java.util.Scanner;

public class Fourteen {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void numberProblem() {
        try {
            System.out.println("Give me a number");
            String input = SCANNER.nextLine();

        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }
}
