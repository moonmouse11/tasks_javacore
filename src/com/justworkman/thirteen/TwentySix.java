package com.justworkman.thirteen;

import java.util.Random;

public class TwentySix {

    private static final Random random = new Random();

    public static void nextRandomProblem() {
        int[] array = new int[15];
        array = randomForArray(array);
        for (int i = 1; i < array.length; i++) {
            if (array[i] < 0 && array[i - 1] < 0) {
                System.out.println("Find number " + array[i] + " index " + i);
            } else if (array[i] > 0 && array[i - 1] > 0) {
                System.out.println("Find number " + array[i] + " index " + i);
            }
        }

    }

    private static int[] randomForArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(60) - 30;
        }
        return array;
    }
}
