package com.justworkman.fourteen;

import java.util.Random;

public class Seven {

    private static final Random RANDOM = new Random();

    public static void minMaxRandom() {
        int [] array = new int[20];
        array = randomForArray(array);
        int maxNumeric = 0;
        int maxNumericNumber = 0;
        for(int number : array) {
            if(sumNumeric(number) > maxNumeric) {
                maxNumeric = sumNumeric(number);
                maxNumericNumber = number;
            }
        }
        System.out.println("Max numeric number: " + maxNumericNumber);
    }

    private static int sumNumeric(int number) {
        int firstNumber = number / 10;
        int secondNumber = number % 10;
        return firstNumber + secondNumber;
    }

    private static int[] randomForArray(int[] array) {
        for(int i = 0; i< array.length; i++) {
            array[i] = RANDOM.nextInt(89) + 10;
        }
        return array;
    }
}
