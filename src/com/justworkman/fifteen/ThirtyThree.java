package com.justworkman.fifteen;

import java.util.Scanner;

public class ThirtyThree {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void powRow() {
        try {
            System.out.println("Give me a number");
            String inputNumber = SCANNER.nextLine();
            int number = Integer.parseInt(inputNumber.trim());
            if(number == 1) throw new NumberFormatException();
            while (number < 1000) {
                System.out.print(number+", ");
                number = (int) Math.pow(number, 2);
            }
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }
}
