package com.justworkman.twelve;

import java.util.Random;

public class Five {

    private static final Random random = new Random();

    public static void fifteenNumbers() {
        int [] array = new int[15];
        array = randomForArray(array);
        printArray(array);
        printHowMuchPositive(array);
        printHowMuchEven(array);
        printHowMuchAreNumerals(array);
    }

    private static void printHowMuchAreNumerals(int[] array) {
        int numeralsCount = 0;
        for (int num : array) {
            if (num / 10 == 0) numeralsCount++;
        }
        System.out.println("Numerals number in array " + numeralsCount);
    }

    private static void printHowMuchEven(int[] array) {
        int evenCount = 0;
        for (int num : array) {
            if(num % 2 == 0) evenCount++;
        }
        System.out.println("Even numbers in array " + evenCount);
    }

    private static void printHowMuchPositive(int[] array) {
        int positiveCount = 0;
        for (int num : array) {
            if(num >= 0) positiveCount++;
        }
        System.out.println("Positive numbers in array " + positiveCount);
    }

    private static void printArray(int[] array) {
        System.out.println("Start");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nFinish");
    }

    private static int[] randomForArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) - 25;
        }
        return array;
    }
}
