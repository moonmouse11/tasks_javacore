package com.justworkman.two;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ThirtyEight {

    static Scanner scanner = new Scanner(System.in);

    public static void documentationProblem() {
        try {
            System.out.println("Give me you whole name");
            String wholeName = scanner.nextLine();
            String [] operators = wholeName.split(" ");
            char first = operators[0].toUpperCase().charAt(0);
            char second = operators[1].toUpperCase().charAt(0);
            char third = operators[2].toUpperCase().charAt(0);
            String answer = first + String.valueOf(second) + third;
            System.out.println(answer);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Not a whole name");
        } catch (InputMismatchException exception) {
            System.out.println("Try another way");
        }
    }

}
