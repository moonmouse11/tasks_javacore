package com.justworkman.four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Five {

    static Scanner scanner = new Scanner(System.in);

    public static void numberWithPlus() {
        try {
            System.out.println("Give me your number");
            int number = scanner.nextInt();
            if (number > 9 && number < 100) {
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(number));
                stringBuilder.insert(1,"0 + ");
                System.out.println("Answer : " + stringBuilder);
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException exception) {
            System.out.println("Wrong input number");
        }
    }
}
