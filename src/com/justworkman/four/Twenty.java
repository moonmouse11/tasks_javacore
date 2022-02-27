package com.justworkman.four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Twenty {

    static Scanner scanner = new Scanner(System.in);

    public static void replaceNumberRight() {
        try {
            System.out.println("Give me your number");
            int number = scanner.nextInt();
            if (number > 99 && number < 1000) {
                int first = number / 100;
                String answer = String.valueOf(number).substring(1) + first;
                System.out.println(answer);
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException exception) {
            System.out.println("Wrong type of number");
        }
    }
}
