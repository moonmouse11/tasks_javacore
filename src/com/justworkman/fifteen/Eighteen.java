package com.justworkman.fifteen;

import java.util.Scanner;

public class Eighteen {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void decrementNumber() {
        try{
            System.out.println("Give me a number");
            String input = SCANNER.nextLine();
            int number = Integer.parseInt(input.trim());
            printIt(number);
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static void printIt(int number) {
        while (number != 0) {
            number = number / 10;
            System.out.println(number);
        }
    }
}
