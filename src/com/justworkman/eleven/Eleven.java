package com.justworkman.eleven;

import java.util.Random;

public class Eleven {

    private static final Random random = new Random();

    public static void randomDividedFive() {
        int[] array = new int[11];
        array = randomIt(array);
        printIt(array);
    }

    private static void printIt(int[] array) {
        System.out.println("Start");
        for (int j : array) {
            if (j % 5 == 0) {
                System.out.print(j + "(" + numberPlus(j) + ")");
            } else {
                System.out.print(j + "[" + numberRaise(j) + "]");
            }
        }
        System.out.println("\nFinish");
    }

    private static int numberRaise(int i) {
        int first = i / 10;
        int second = i % 10;
        return first * second;
    }

    private static int numberPlus(int i) {
        int first = i / 10;
        int second = i % 10;
        return first + second;
    }

    private static int[] randomIt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(89) + 10;
        }
        return array;
    }
}
