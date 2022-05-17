package com.justworkman.eleven;

import java.util.Random;

public class Nine {

    private static final Random random = new Random();

    public static void randomArrayDividerBy3() {
        int min = 27;
        int max = 73;
        int [] randomArray = new int[20];
        randomArray = randomIn(randomArray, min, max);
        printWithDivider(randomArray);

    }

    private static void printWithDivider(int[] randomArray) {
        System.out.println("Start");
        for(int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] % 3 == 0) {
                System.out.print(randomArray[i] + "# ");
            } else {
                System.out.print(randomArray[i] + " ");
            }
        }
        System.out.println("\nFinish");
    }

    private static int[] randomIn(int[] randomArray, int min, int max) {
        for(int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(max - min) + min;
        }
        return randomArray;
    }
}
