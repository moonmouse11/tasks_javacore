package com.justworkman.three;

import com.justworkman.otherres.ColorConsole;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Four {

    private static Scanner scanner = new Scanner(System.in);
    private static final double DOLLAR_COURSE = 76.63;
    private static final double EURO_COURSE = 86.65;

    public static void converterProblem() {
        try {
            System.out.println("Give me your money in rub");
            int rubMoney = scanner.nextInt();
            double dollarMoney = rubMoney / DOLLAR_COURSE;
            double euroMoney = rubMoney / EURO_COURSE;
            System.out.println(ColorConsole.ANSI_YELLOW + "Dollar = " + dollarMoney);
            System.out.println(ColorConsole.ANSI_GREEN + "Euro = " + euroMoney);
        } catch (InputMismatchException exception) {
            System.out.println("It's not a money");
        }
    }
}
