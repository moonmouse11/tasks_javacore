package com.justworkman.eleven;

import java.util.Random;

public class ThirtySeven {

    private static final Random random = new Random();

    public static void randomRow() {
        int [] array = returnRandomArray(new int[20]);
        for(int num : array) {
            if(num == 0);
            if(num < 0)
                System.out.println(num + " " + Math.pow(num, 2));
            else
                System.out.println(num + " " + Math.abs(Math.sqrt(num)));
        }
    }

    private static int[] returnRandomArray(int[] ints) {
        for(int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(36) - 18;
        }
        return ints;
    }


}
