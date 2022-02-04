package com.justworkman.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyNine {

    static Scanner scanner = new Scanner(System.in);

    public static void timeProblem() {
        try {
            System.out.println("Give me a number of hours");
            int hours = scanner.nextInt();
            int minutes = hours * 60;
            int second = minutes * 60;
            System.out.println("Seconds in hours: " + second);
        } catch (InputMismatchException exception) {
            System.out.println("Wrong input.");
        }
    }
}
