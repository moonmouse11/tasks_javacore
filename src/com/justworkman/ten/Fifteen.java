package com.justworkman.ten;

import java.util.Random;

public class Fifteen {

    private static Random random = new Random();
    private static final int MIN = 250;
    private static final int MAX = 746;

    public static void anotherTask() {
        int number = random.nextInt(MAX - MIN) + MIN;
        System.out.println("Number " + number);
        int max = max(number);
        int min = min(number);
        int count = repeat(number);
        print(max, min, count);
    }

    private static void print(int max, int min, int count) {
        System.out.println("Max numeral " + max);
        System.out.println("Min numeral " + min);
        System.out.println("Repeats " + count);

    }

    private static int repeat(int number) {
        int first = number / 100;
        int second = number / 10 % 10;
        int third = number % 10;
        int count = 0;
        if(first == second) count++;
        if(second == third) count++;
        if(first == third) count++;
        return count;
    }

    private static int min(int number) {
        int first = number / 100;
        int second = number / 10 % 10;
        int third = number % 10;
        int min = first;
        if (min > second) min = second;
        if (min > third) min = third;
        return min;
    }

    private static int max(int number) {
        int first = number / 100;
        int second = number / 10 % 10;
        int third = number % 10;
        int max = first;
        if (max < second) max = second;
        if (max < third) max = third;
        return max;
    }
}
