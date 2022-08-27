package com.justworkman.fifteen;

import java.util.Scanner;

public class TwentyFive {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void firstNumeric() {
        try {
            System.out.println("Give me a number");
            String inputNumber = SCANNER.nextLine();
            if (inputNumber.contains("-")) throw new NumberFormatException();
            int number = Integer.parseInt(inputNumber.substring(0, 1));
            if(number == 0) throw new NumberFormatException();
            System.out.println("First numeric = " + number);
        } catch (NumberFormatException exception) {
            System.out.println("Nat a valid number.");
        }
    }

}
