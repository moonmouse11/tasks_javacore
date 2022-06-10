package com.justworkman.thirteen;

import java.util.Scanner;

public class Nineteen {

    private static final Scanner scanner = new Scanner(System.in);

    public static void stableNumber() {
        try {
            System.out.println("Give me a number");
            String inputNumber = scanner.nextLine();
            int number = Integer.parseInt(inputNumber.trim());
            if(number < 10 || number > 99 || number*2 > 99) throw new NumberFormatException();
            int first = sumNumerals(number);
            int second = sumNumerals(number * 2);
            String answer = first==second ? "This is a stable number" : "Just a number";
            System.out.println(answer);
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static int sumNumerals(int number) {
        return number/10 + number % 10;
    }
}
