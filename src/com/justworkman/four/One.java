package com.justworkman.four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class One {

    static Scanner scanner = new Scanner(System.in);

    public static void numberWithSpace() {
        try {
            System.out.println("Give me number");
            int number = scanner.nextInt();
            if (number < 100 && number > 9) {
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(number));
                stringBuilder.insert(1, " ");
                System.out.println("Answer: " + stringBuilder);
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException exception) {
            System.out.println("Wrong input data.");
        }
    }
}
