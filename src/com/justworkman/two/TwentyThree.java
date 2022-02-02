package com.justworkman.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyThree {

    static Scanner scanner = new Scanner(System.in);

    public static void anotherThingWithPow() {
        try {
            System.out.println("Give me first integer");
            int first = scanner.nextInt();
            System.out.println("Give me second integer");
            int second = scanner.nextInt();
            int firstPow = (int) Math.pow(first, 2);
            int secondPow = (int) Math.pow(second, 2);
            int sumPow = firstPow + secondPow;
            System.out.println("First pow: " + firstPow);
            System.out.println("Second pow: " + secondPow);
            System.out.println("Pow amount:" + sumPow);
        } catch (InputMismatchException exception) {
            System.out.println("Wrong input");
        }
    }
}
