package com.justworkman.four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ten {

    static Scanner scanner = new Scanner(System.in);

    public static void weightOfNumber() {
        try {
            System.out.println("Give me your number");
            int number = scanner.nextInt();
            if (number > 99 && number < 1000) {
                int first = number / 100;
                int second = number / 10 % 10;
                int third = number % 10;
                int answer = first + second + third;
                System.out.println("Answer = " + answer);
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException exception) {
            System.out.println("Wrong input number");
        }
    }
}
