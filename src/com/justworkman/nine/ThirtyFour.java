package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirtyFour {

    static Scanner scanner = new Scanner(System.in);

    public static void characterProblem() {
        try {
            System.out.println("Give me a first character");
            String firstCharacter = scanner.next();
            if (firstCharacter.length() != 1) throw new InputMismatchException();
            System.out.println("Give me a first character");
            String secondCharacter = scanner.next();
            if (secondCharacter.length() != 1) throw new InputMismatchException();
            char first = firstCharacter.charAt(0);
            char second = secondCharacter.charAt(0);
            if (first == second) {
                System.out.println("Equals symbols");
            } else {
                System.out.println("Not equals");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid data");
        }
    }
}