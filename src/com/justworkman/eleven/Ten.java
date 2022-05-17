package com.justworkman.eleven;

import java.util.Random;

public class Ten {

    private static final Random random = new Random();

    public static void percentNear() {
        int [] array = new int[19];
        array = randomIt(array);
        printWithZero(array);
    }

    private static void printWithZero(int[] array) {
        System.out.println("Start");
        for(int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.print(array[i] + " ");
            } else {
                System.out.print("%" + array[i] + "% ");
            }
        }
        System.out.println("\nFinish");
    }

    private static int[] randomIt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(19) - 9;
        }
        return array;
    }
}
