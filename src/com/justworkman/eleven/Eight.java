package com.justworkman.eleven;

import java.util.Random;
import java.util.Scanner;

public class Eight {

    private static final Random random = new Random();

    public static void randomArrayWithQuestion() {
        int min = -20;
        int max = 35;
        int [] randomArray = new int[15];
        randomArray = randomInArray(randomArray, min, max);
        printWithQuestion(randomArray);
    }

    private static void printWithQuestion(int[] randomArray) {
        System.out.println("Start");
        for(int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] < 0) {
                System.out.print(randomArray[i] + "? ");
            } else {
                System.out.print(randomArray[i] + " ");
            }
        }
        System.out.println("\nFinish");
    }

    private static int[] randomInArray(int[] randomArray, int min, int max) {
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(max - min) + min;
        }
        return randomArray;
    }
}
