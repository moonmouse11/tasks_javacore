package com.justworkman.eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentySix {

    static Scanner scanner = new Scanner(System.in);

    public static void palindromeNumber() {
        try {
            System.out.println("Give me a number");
            long number = scanner.nextLong();
            if (number < 0)
                throw new InputMismatchException();
            String forReverse = String.valueOf(number);
            StringBuffer reverse =  new StringBuffer(String.valueOf(number)).reverse();
            String finalReverse = String.valueOf(reverse);
            if(forReverse.equals(finalReverse)) {
                System.out.println("It's a palindrome number");
            } else {
                System.out.println("Just a number");
            }
        }catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
