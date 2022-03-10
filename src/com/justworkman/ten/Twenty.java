package com.justworkman.ten;

import java.util.Random;

public class Twenty {

    private static Random random = new Random();

    public static void numeralInNumber() {
        int numeralRandom = random.nextInt(10);
        int numberRandom = random.nextInt(899) + 100;
        int max = maxNumber(numberRandom);
        if (numeralRandom <= max) {
            int answer = max - numeralRandom;
            System.out.println("Number bigger");
            System.out.println("Answer = " + answer);
        } else {
            System.out.println("Numeral bigger");
            int answer = numeralRandom - max;
            System.out.println("Answer = " + answer);
        }
    }

    private static int maxNumber(int number) {
        int first = number / 100;
        int second = number / 10 % 10;
        int third = number % 10;
        int max = Math.max(first, second);
        max = Math.max(max, third);
        return max;
    }
}
