package com.justworkman.thirteen;

import java.util.Random;

public class TwentyFour {

    private static final Random random = new Random();

    public static void randomArray() {
        int[] array = new int[20];
        array = randomForArray(array);
        int firstNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < firstNumber) {
                System.out.print("-" + array[i] + " ");
            } else if (array[i] > firstNumber) {
                System.out.print("+" + array[i] + " ");
            } else {
                System.out.print("=" + array[i] + " ");
            }
        }
    }

    private static int[] randomForArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(19) + 30;
        }
        return array;
    }
}
