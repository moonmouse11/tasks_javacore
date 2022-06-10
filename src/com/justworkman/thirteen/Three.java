package com.justworkman.thirteen;

import java.util.Random;

public class Three {

    private static final Random random = new Random();

    public static void twentyRandom(){
        int [] array = new int[20];
        array = randomForArray(array);
        printIt(array);
        int sum = sumAllNumbers(array);
        System.out.println("Sum of numbers = " + sum);
    }

    private static void printIt(int[] array) {
        System.out.println("Start");
        for(int number : array) {
            System.out.print(number + "\t");
        }
        System.out.println("\nFinish");
    }

    private static int sumAllNumbers(int[] array) {
        int sum = 0;
        for(int number : array) {
            if(number % 2 ==0) sum += number;
        }
        return sum;
    }

    private static int[] randomForArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(89) + 10;
        }
        return array;
    }
}
