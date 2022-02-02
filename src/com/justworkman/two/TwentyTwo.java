package com.justworkman.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyTwo {
    static Scanner scanner = new Scanner(System.in);

    public static void somethingWithNumbers() {
        try {
            System.out.println("Give me first integer");
            int first = scanner.nextInt();
            System.out.println("Give me second integer");
            int second = scanner.nextInt();
            int amount = first + second;
            int produced = first * second;
            int remainderFirst = first - second;
            int remainderSecond = second - first;
            System.out.println("Amount: " + amount);
            System.out.println("Produced: " + produced);
            System.out.println("First remainder: " + remainderFirst);
            System.out.println("Second remainder: " + remainderSecond);
        } catch (InputMismatchException exception) {
            System.out.println("Wrong type. Try again");
        }
    }
}
