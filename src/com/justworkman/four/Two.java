package com.justworkman.four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Two {

    static Scanner scanner = new Scanner(System.in);

    public static void numberWithSpace() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number > 99 && number < 1000) {
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(number));
                stringBuilder.insert(1, " ");
                stringBuilder.insert(3, " ");
                System.out.println("Answer: " + stringBuilder);
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException exception) {
            System.out.println("Wrong input number");
        }
    }
}
