package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Thirty {

    static Scanner scanner = new Scanner(System.in);

    public static void numeralInNumber() {
        try {
            System.out.println("Give me your number");
            int number = scanner.nextInt();
            if (number < 100 || number > 999) throw new InputMismatchException();
            int first = number / 100;
            int second = number / 10 % 10;
            int third = number % 10;
            int count = isDivide(number, first) + isDivide(number, second) + isDivide(number, third);
            System.out.println("Dividers by the numerals by " + count);
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static int isDivide(int full, int numeral) {
        if (numeral == 0) return 0;
        return (full % numeral == 0) ? 1 : 0;
    }
}


