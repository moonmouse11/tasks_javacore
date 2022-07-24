package com.justworkman.fourteen;

import java.util.Random;

public class Eight {

    private static final Random RANDOM = new Random();

    public static void minNumberRandom() {
        int[] array = new int[15];
        array = randomForArray(array);
        int minNumeric = Integer.MAX_VALUE;
        int minNumericNumber = 0;
        for(int number : array) {
            if(sumOfNumeric(number) < minNumeric) {
                minNumeric = sumOfNumeric(number);
                minNumericNumber = number;
            }
        }
        System.out.println("Min numeric number: " + minNumericNumber);
    }

    private static int sumOfNumeric(int number) {
        int firstNumeric = number / 100;
        int secondNumeric = number / 10 % 10;
        int thirdNumeric = number % 10;
        return firstNumeric + secondNumeric + thirdNumeric;
    }

    private static int[] randomForArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(899) + 100;
        }
        return array;
    }
}
