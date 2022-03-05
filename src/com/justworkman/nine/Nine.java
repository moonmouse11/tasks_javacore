package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nine {

    static Scanner scanner = new Scanner(System.in);

    public static void linearEquationCoefficient() {
        try {
            System.out.println("Give me a first coefficient");
            int firstCoefficient = scanner.nextInt();
            System.out.println("Give me a second coefficient");
            int secondCoefficient = scanner.nextInt();
            float answer = (secondCoefficient * (-1)) / firstCoefficient;
            System.out.println("Answer = " + answer);
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid coefficient");
        } catch (ArithmeticException exception) {
            System.out.println("Not have a answer");
        }
    }
}
