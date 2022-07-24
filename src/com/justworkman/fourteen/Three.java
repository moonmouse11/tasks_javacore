package com.justworkman.fourteen;

import java.util.Random;

public class Three {

    private static final Random RANDOM = new Random();

    public static void randomProblem() {
        int [] array = new int[50];
        array = randomForArray(array);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int number : array) {
            if(number < min) min = number;
            if(number > max) max = number;
        }
        System.out.println("Min of array: " + min);
        System.out.println("Max of array: " + max);
    }

    private static int[] randomForArray(int[] array) {
        for(int i = 0; i< array.length; i++) {
            array[i] = RANDOM.nextInt(80) - 40;
        }
        return array;
    }
}
