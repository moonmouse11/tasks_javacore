package com.justworkman.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sixteen {

    static Scanner scanner = new Scanner(System.in);

    public static void simpleMath() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            System.out.println("First answer: " + (number + 6));
            System.out.println("Second answer: " + (number - 12));
        }catch (InputMismatchException e) {
            System.out.println("No answer");
        }
    }

}
