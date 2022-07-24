package com.justworkman.fourteen;

import java.util.Random;

public class Four {

    private static final Random RANDOM = new Random();

    public static void minAndMaxRandom() {
        int[] array = new int[50];
        array = randomForArray(array);
        int min = 0;
        int max = 0;
        for(int number : array) {
            if(number < 0 && number < min) min = number;
            if(number > 0 && number > max) max = number;
            if(number == 0) System.out.println("Can't afford");
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    private static int[] randomForArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(80) - 40;
        }
        return array;
    }
}
