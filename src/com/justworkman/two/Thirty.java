package com.justworkman.two;

import java.util.Scanner;

public class Thirty {

    final static int SECONDS_IN_DAY = 24 * 60 * 60;
    static Scanner scanner = new Scanner(System.in);

    public static void fromMorningToMidnight() {
        try {
            System.out.println("Give me your time now");
            String input = scanner.nextLine();
            String[] inputArray = input.split(":");
            inputArray[0] = inputArray[0].replaceAll(" ", "");
            inputArray[1] = inputArray[1].replaceAll(" ", "");
            int hour = Integer.parseInt(inputArray[0]);
            int minute = Integer.parseInt(inputArray[1]);
            if ((hour > 0 && hour < 24) && (minute > 0 && minute < 60)) {
                int answerMinMorning = hour * 60 + minute;
                int answerSecMorning = answerMinMorning * 60;
                System.out.println("Minutes lost: " + answerMinMorning + " Second lost: " + answerSecMorning);
                int answerSecMidnight = SECONDS_IN_DAY - answerSecMorning;
                System.out.println("Seconds remaining: " + answerSecMidnight);
            } else {
                System.out.println("Number is not a time");
            }
        } catch (NumberFormatException exception) {
            System.out.println("Wrong type of number");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Very wrong type of time");
        }
    }
}
