package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sixteen {

    static Scanner scanner = new Scanner(System.in);

    public static void dayProblem() {
        try {
            System.out.println("Give me your hours");
            int hours = scanner.nextInt();
            if (hours < 0 || hours > 23) throw new InputMismatchException();
            String answer = "";
            if (hours < 6 || hours >= 22) answer = "night";
            if (hours >= 6 && hours < 10) answer = "morning";
            if (hours >= 10 && hours < 18) answer = "day";;
            if (hours >=18 && hours < 22) answer = "evening";
            System.out.println("Now is " + answer);
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid time");
        }
    }
}
