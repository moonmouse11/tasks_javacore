package com.justworkman.four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Seventeen {

    static Scanner scanner = new Scanner(System.in);

    public static void replaceNumber() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number > 999 && number < 10000) {
                int first = (number % 10) * 1000;
                int last = number / 1000;
                int middle = number % 1000 - number % 10;
                int answer = first + last + middle;
                System.out.println("Answer = " + answer);
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException exception) {
            System.out.println("Wrong input type");
        }
    }
}
