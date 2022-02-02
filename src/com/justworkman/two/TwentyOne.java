package com.justworkman.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyOne {

    static Scanner scanner = new Scanner(System.in);

    public static void nextNumbers() {
        System.out.println("Give me a integer");
        try {
            int number = scanner.nextInt();
            int number2 = number + 1;
            int number3 = number2 + 1;
            int number4 = number3 + 1;
            System.out.println("First: " + number2);
            System.out.println("Second: " + number3);
            System.out.println("Third: " + number4);
        } catch (InputMismatchException exception) {
            System.out.println("Wrong type");
        }
    }
}
