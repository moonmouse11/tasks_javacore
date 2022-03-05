package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eight {

    static Scanner scanner = new Scanner(System.in);

    public static void luckyTicket() {
        try {
            System.out.println("Give me a number of ticket");
            int ticketNumber = scanner.nextInt();
            if (ticketNumber < 100000 || ticketNumber > 999999) {
                throw new InputMismatchException();
            }
            int firstPart = ticketNumber / 1000;
            int secondPart = ticketNumber % 1000;
            int firstSum = sum(firstPart);
            int secondSum = sum(secondPart);
            if (firstSum == secondSum && firstSum % 2 == 0) {
                System.out.println("It's a lucky ticket");
            } else {
                System.out.println("It's not lucky ticket");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a number of ticket");
        }

    }

    private static int sum(int number) {
        int sum = number / 100 + number / 10 % 10 + number % 10;
        return sum;
    }
}
