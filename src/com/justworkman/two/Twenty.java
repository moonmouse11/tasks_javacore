package com.justworkman.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Twenty {
    static Scanner scanner = new Scanner(System.in);

    public static void negativeForYou() {
        System.out.println("Give me a integer");
        try {
            int number = scanner.nextInt();
            int answer = number * -1;
            System.out.println("Answer: " + answer);
        } catch (InputMismatchException exception) {
            System.out.println("Wrong type.");
        }
    }
}
