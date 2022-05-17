package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Thirty {

    private static final Scanner scanner = new Scanner(System.in);

    public static void lowerPow() {
        try {
            System.out.println("Give me a positive number");
            int number = scanner.nextInt();
            if (number <= 0) {
                throw new InputMismatchException();
            }
            System.out.println("Start");
            for(int i = 10; i < 100; i++) {
                if(powNumeric(i) < number){
                    System.out.print(i + " ");
                }
            }
            System.out.println("\nFinish");
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static int powNumeric(int number) {
        int first = number / 10;
        int second = number % 10;
        return first * second;
    }
}
