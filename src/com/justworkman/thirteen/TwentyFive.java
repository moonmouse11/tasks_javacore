package com.justworkman.thirteen;

import java.util.Random;

public class TwentyFive {
    private static final Random random = new Random();
    public static void randomProblem() {
        int [] array = new int[25];
        array = randomForArray(array);
        int firstNumber= array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] % firstNumber == 0) {
                System.out.println("Find number: " + array[i] + " index: " + (i + 1));
            }
        }
    }

    private static int[] randomForArray(int[] array) {
        for(int i = 0; i< array.length; i++) {
            array[i] = random.nextInt(89) + 10;
        }
        return array;
    }
}
