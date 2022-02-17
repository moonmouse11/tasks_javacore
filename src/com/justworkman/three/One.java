package com.justworkman.three;

import java.util.InputMismatchException;
import java.util.Scanner;

public class One {

    private static Scanner scanner = new Scanner(System.in);

    public static void fahrenheitProblem() {
        try {
            System.out.println("Give me your temperature in fahrenheit");
            int fahrenheit = scanner.nextInt();
            float celsius = 5 * (fahrenheit - 32) / 9;
            System.out.println("Temperature " + celsius + " degrees in celsius");
        } catch (InputMismatchException exception) {
            System.out.println("It not a temperature");
        }
    }
}
