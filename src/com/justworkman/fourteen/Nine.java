package com.justworkman.fourteen;

import java.util.Random;

public class Nine {

    private static final Random RANDOM = new Random();

    public static void minIndex() {
        int[] array = new int[24];
        array = randomForArray(array);
        int max = Integer.MIN_VALUE;
        int indexNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexNumber = i;
            }
        }
        System.out.println("Index of max number: " + indexNumber);
    }

    private static int[] randomForArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(899) + 100;
        }
        return array;
    }
}
