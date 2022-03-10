package com.justworkman.ten;

import java.util.Random;

public class Sixteen {

    private static Random random = new Random();
    private static final int MIN = 17;
    private static final int MAX = 94;

    public static void anotherRandom() {
        int firstNumber = random.nextInt(MAX - MIN) + MIN;
        int secondNumber = random.nextInt(MAX - MIN) + MIN;
        if (firstNumber == secondNumber) {
            System.out.println("They are equals");
        } else if (firstNumber > secondNumber) {
            System.out.println("First number bigger " + firstNumber);
        } else {
            System.out.println("Second number bigger " + secondNumber);
        }
        int minimal = minimal(firstNumber, secondNumber);
        System.out.println("Minimal = " + minimal);
    }

    private static int minimal(int firstNumber, int secondNumber) {
        return Math.min(minNumeral(firstNumber), minNumeral(secondNumber));
    }

    private static int minNumeral(int number) {
        int first = number / 10;
        int second = number % 10;
        return Math.min(first, second);
    }
}
