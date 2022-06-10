package com.justworkman.thirteen;

import java.util.Scanner;

public class Five {

    private static final Scanner scanner = new Scanner(System.in);

    public static void baseOfNumber() {
        try {
            System.out.println("Give me a number");
            String inputNumber = scanner.nextLine();
            int number = Integer.parseInt(inputNumber.trim());
            if(number <= 0) throw new NumberFormatException();
            int baseOfNumber = getBase(number);
            System.out.println("Base of number = " + baseOfNumber);
        }catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static int getBase(int number) {
        int base = 0;
        for(int i = 1; i < number; i++) {
            base += i;
        }
        return base;
    }
}
