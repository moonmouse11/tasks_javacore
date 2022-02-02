package com.justworkman.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fourteen {
    public static void upOnTen() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a number.");
            int number = scanner.nextInt();
            int upOnTen = number + 10;
            System.out.println("Answer: " + upOnTen);
        }catch (InputMismatchException exception) {
            System.out.println("You miss");
        }
    }
}
