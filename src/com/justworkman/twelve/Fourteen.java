package com.justworkman.twelve;

import java.util.Random;

public class Fourteen {

    private static final Random random = new Random();

    public static void balancedArray() {
        int[] array = new int[30];
        array = randomForArray(array);
        printIt(array);
        int positiveCount = positiveCounter(array);
        System.out.println("Positive count " + positiveCount);
        int negativeCount = negativeCounter(array);
        System.out.println("Negative count " + negativeCount);
        if (positiveCount == negativeCount) {
            System.out.println("Array is balanced");
        } else {
            System.out.println("Array not balanced");
        }
    }

    private static int[] randomForArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(40) - 20;
        }
        return array;
    }

    private static void printIt(int[] array) {
        System.out.println("Start");
        for(int number : array) {
            System.out.print(number + " ");
        }
        System.out.println("\nFinish");
    }

    private static int positiveCounter(int[] array) {
        int count = 0;
        for(int number : array){
            if(number > 0) count++;
        }
        return count;
    }

    private static int negativeCounter(int[] array) {
        int count = 0;
        for(int number : array){
            if(number < 0) count++;
        }
        return count;
    }
}
