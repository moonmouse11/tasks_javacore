package com.justworkman.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ten {
    public static void simpleAnswer() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Give me first integer");
            int first = scanner.nextInt();
            System.out.println("Give me second integer");
            int second = scanner.nextInt();
            System.out.println("first param: " + first + " second param: " + second);
            System.out.println("Composition = " + first * second);
            System.out.println("Amount = " + (first + second));
        } catch (InputMismatchException e) {
            System.out.println("Sorry.");
        }
        }
    }
