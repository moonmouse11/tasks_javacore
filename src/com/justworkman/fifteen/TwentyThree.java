package com.justworkman.fifteen;

import java.util.Scanner;

public class TwentyThree {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void evenAndNotEvenLines() {
        try{
            System.out.println("Give me a long number.");
            String inputNumber = SCANNER.nextLine();
            long number = Long.parseLong(inputNumber.trim());
            String evenLine = evenLine(number);
            String notEvenLine = notEvenLine(number);
            System.out.println("Even line: " + evenLine);
            System.out.println("Not even line: " + notEvenLine);
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number.");
        }
    }

    private static String notEvenLine(long number) {
        String forReturn = "";
        while (number != 0) {
            long numeric = number % 10;
            number = number / 10;
            if(numeric % 2 != 0) {
                forReturn = forReturn.concat(String.valueOf(numeric)).concat(" ");
            }
        }
        return forReturn;
    }

    private static String evenLine(long number) {
        String forReturn = "";
        while (number != 0) {
            long numeric = number % 10;
            number = number / 10;
            if(numeric % 2 == 0) {
                forReturn = forReturn.concat(String.valueOf(numeric)).concat(" ");
            }
        }
        return forReturn;
    }
}
