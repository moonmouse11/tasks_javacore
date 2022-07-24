package com.justworkman.thirteen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyNine {

    private static final Scanner scanner = new Scanner(System.in);

    public static void studentsProblem() {

        for (int i = 1; i <= 12; i++) {
            try {
                System.out.println("Input for " + i + " person");
                System.out.println("Give me a first exam result");
                String firstInput = scanner.nextLine();
                int firstResult = Integer.parseInt(firstInput.trim());
                if (firstResult > 50 || firstResult < 0) throw new InputMismatchException();
                System.out.println("Give me a second exam result");
                String secondInput = scanner.nextLine();
                int secondResult = Integer.parseInt(secondInput.trim());
                if(secondResult > 50 || secondResult < 0) throw new InputMismatchException();
                int result = firstResult + secondResult;
                if (result >= 80) System.out.println(i + " person go to the final");
                System.out.println(i + " person result = " + result);
            } catch (InputMismatchException | NumberFormatException exception) {
                i--;
                System.out.println("Not a valid input");
            }
        }
    }
}
