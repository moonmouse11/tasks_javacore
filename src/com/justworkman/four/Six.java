package com.justworkman.four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Six {

    static Scanner scanner = new Scanner(System.in);

    public static void numberWithPlus() {
        try {
            System.out.println("Give me your number");
            int number = scanner.nextInt();
            if (number > 99 && number < 1000) {
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(number));
                stringBuilder.insert(2,"0 + ").insert(1,"00 + ");
                System.out.println("Answer : " + stringBuilder);
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException exception) {
            System.out.println("Wrong input number");
        }
    }
}
