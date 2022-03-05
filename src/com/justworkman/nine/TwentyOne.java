package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyOne {

    static Scanner scanner = new Scanner(System.in);

    public static void secondsProblem() {
        try {
            System.out.println("Give me your seconds");
            int seconds = scanner.nextInt();
            if (seconds < 0 || seconds > 86400) throw new InputMismatchException();
            if (seconds < 60) {
                System.out.println("Answer " + seconds + " seconds");
            } else if (seconds < 3600){
                int minutes = seconds / 60;
                int secondsRemainder = seconds % 60;
                System.out.println("Answer " + minutes + " minutes " + secondsRemainder + " seconds");
            } else {
                int hours = seconds / 3600;
                int remainder = seconds % 3600;
                int minutesRemainder = remainder / 60;
                int secondsRemainder = remainder % 60;
                System.out.println("Answer " + hours + " hours " + minutesRemainder + " minutes " + secondsRemainder + " seconds");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid seconds");
        }
    }
}
