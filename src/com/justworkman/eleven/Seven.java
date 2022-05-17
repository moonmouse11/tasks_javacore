package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Seven {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    public static void randomArray() {
        try {
            System.out.println("Give me first integer");
            int first = scanner.nextInt();
            System.out.println("Give me a second integer");
            int second = scanner.nextInt();
            int[] array = new int[20];
            array = random(array, first, second);
            printIt(array);
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static void printIt(int[] array) {
        System.out.println("Start");
        for (int i = 0; i < array.length; i++) {
            System.out.println("# " + (i + 1) + " value " + array[i]);
        }
        System.out.println("Finish");
    }

    private static int[] random(int[] array, int first, int second) {
        int min = Math.min(first, second);
        int max = Math.max(first, second);
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min) + min;
        }
        return array;
    }
}

