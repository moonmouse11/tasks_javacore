package com.justworkman.fifteen;

import java.util.Scanner;

public class Nine {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void powRow() {
        try {
            System.out.println("Give me a number");
            String inputNumber = SCANNER.nextLine();
            int number = Integer.parseInt(inputNumber.trim());
            for (int i = number; i < number * number; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("End of row");
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }
}
