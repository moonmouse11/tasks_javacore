package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirtyThree {


    static Scanner scanner = new Scanner(System.in);

    public static void fractionProblem() {
        try {
            System.out.println("Give me a numerator");
            int numerator = scanner.nextInt();
            System.out.println("Give me a denominator");
            int denominator = scanner.nextInt();
            if (denominator <= 0 || numerator < 0) throw new InputMismatchException();
            if (numerator < denominator) {
                System.out.println("Correct fraction " + numerator + "/" + denominator);
            } else if (numerator == denominator){
                System.out.println("Full number 1");
            } else {
                int whole = numerator / denominator;
                int remainder = numerator % denominator;
                System.out.println("Answer " + whole + " " + remainder + "/" + denominator);
            }
        }catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
