package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyTwo {

    static Scanner scanner = new Scanner(System.in);

    public static void moneyProblem() {
        try {
            System.out.println("Give me your money");
            int money = scanner.nextInt();
            if (money < 0) throw new YouAreOwnMeException();
            int hundreds = money / 100;
            int moneyRemainder = money % 100;
            int fifty = moneyRemainder / 50;
            moneyRemainder = moneyRemainder % 50;
            int tens = moneyRemainder / 10;
            moneyRemainder = moneyRemainder % 10;
            System.out.println("Hundreds " + hundreds + " fifty " + fifty + " tens " + tens);
            System.out.println("Remainder " + moneyRemainder);
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid money");
        } catch (YouAreOwnMeException exception) {
            System.out.println("You are own me");
        }
    }

    static class YouAreOwnMeException extends RuntimeException {

    }
}
