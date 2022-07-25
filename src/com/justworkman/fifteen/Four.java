package com.justworkman.fifteen;

import java.util.Scanner;

public class Four {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void plusOrMinus() {
        int number = -1;
        System.out.println("Give me a number");
        while(number != 0) {
            try{
                String inputNumber = SCANNER.nextLine();
                number = Integer.parseInt(inputNumber.trim());
                if(number < 0) System.out.println("Minus");
                if(number > 0) System.out.println("PLus");
            } catch (NumberFormatException exception) {
                System.out.println("Not a valid number. Try again");
            }
        }
    }
}
