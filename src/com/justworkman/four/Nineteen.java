package com.justworkman.four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nineteen {

    static Scanner scanner = new Scanner(System.in);

    public static void replaceNumberLeft() {
        try {
            System.out.println("Give me your number");
            int number = scanner.nextInt();
            if (number > 999 && number < 10000) {
                int first = number % 10;
                String answer = first + String.valueOf(number).substring(0, String.valueOf(number).length() - 1);
                System.out.println(answer);
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException exception) {
            System.out.println("Wrong type of number");
        }
    }
}
