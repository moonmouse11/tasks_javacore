package com.justworkman.four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eighteen {

    static Scanner scanner = new Scanner(System.in);

    public static void replaceNumber() {
        try {
            System.out.println("Give me your number");
            int number = scanner.nextInt();
            if (number > 99  && number < 1000) {
                int first = number % 10;
                String answer = first + String.valueOf(number).substring(0,2);
                System.out.println(answer);
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException exception) {
            System.out.println("Wrong type of number" + exception.getMessage());
        }
    }
}
