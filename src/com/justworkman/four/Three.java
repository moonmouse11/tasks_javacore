package com.justworkman.four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Three {

    static Scanner scanner = new Scanner(System.in);

    public static void reverseNumberWithSpace() {
        try {
            System.out.println("Give me your number");
            int number = scanner.nextInt();
            if (number > 9 && number < 100) {
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(number));
                stringBuilder.insert(1, " ").reverse();
                System.out.println("Answer : " + stringBuilder);
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException exception) {
            System.out.println("Wrong input number");
        }
    }
}
