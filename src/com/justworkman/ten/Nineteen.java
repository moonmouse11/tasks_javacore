package com.justworkman.ten;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Nineteen {

    private static Random random = new Random();

    public static void negativeProblem() {
        int numbers [] = new int[random.nextInt(40) + 10];
        numbers = randomForArray(numbers);
        int count = howMuch(numbers);
        printIt(numbers);
        System.out.println("Count = " + count);
    }

    private static int howMuch(int[] numbers) {
        boolean isNegative = numbers[0] >= 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (isNegative) {
                if (numbers[i] < 0) {
                    count++;
                    isNegative = false;
                }
            } else {
                if (numbers[i] >= 0) {
                    count++;
                    isNegative = true;
                }
            }
        }
        return count;
    }

    private static int[] randomForArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i ++) {
            numbers[i] = ThreadLocalRandom.current().nextInt(100) - 50;
        }
        return numbers;
    }

    private static void printIt(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
