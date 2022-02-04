package com.justworkman.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirtyOne {

    static Scanner scanner = new Scanner(System.in);

    public static void kineticPower() {
        try {
            System.out.println("Give me a mass");
            int mass = scanner.nextInt();
            System.out.println("Give me a speed");
            int speed = scanner.nextInt();
            double answer = (mass * Math.pow(speed, 2)) / 2;
            System.out.println("Answer: " + answer);
        } catch (InputMismatchException exception) {
            System.out.println("Sorry, not a number");
        }
    }
}
