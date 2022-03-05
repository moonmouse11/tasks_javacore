package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirtyFive {

    static Scanner scanner = new Scanner(System.in);

    public static void inAlphabet() {
        try {
            System.out.println("Give me a symbol");
            String symbol = scanner.nextLine();
            if(symbol.length() != 1) throw new InputMismatchException();
            char character = symbol.charAt(0);
            if ('A' <= character && character <= 'z'){
                System.out.println("It's cyrillic symbol");
            } else {
                System.out.println("Not a cyrillic symbol");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid data");
        }
    }
}
