package com.justworkman.one;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Seven {
    public static void simpleDivider() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Give me integer.");
            int x = scanner.nextInt();
            int answer = x / 3;
            System.out.println("Answer: " + answer);
        } catch (InputMismatchException exception) {
            System.out.println("You miss");
        }
    }
}
