package com.justworkman.thirteen;

import java.util.Scanner;

public class Fifteen {

    private static final Scanner scanner = new Scanner(System.in);

    public static void numeralsBetween() {
        try {
            System.out.println("Give me a number");
            String inputNumber = scanner.nextLine();
            int number = Integer.parseInt(inputNumber.trim());
            if(number < 10 || number > 99 || oneNumeral(number)) throw new NumberFormatException();
            int firstNumeral = number / 10;
            int secondNumeral = number % 10;
            int min = Math.min(firstNumeral, secondNumeral);
            int max = Math.max(firstNumeral,secondNumeral);
            int between = 0;
            for (int i = min; i <= max; i++) {
                between +=i;
            }
            System.out.println("Between numerals " + between);
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static boolean oneNumeral(int number) {
        int firstNumeral = number / 10;
        int secondNumeral = number % 10;
        return firstNumeral == secondNumeral;
    }
}
