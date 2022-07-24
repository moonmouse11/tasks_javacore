package com.justworkman.thirteen;

public class Twenty {
    public static void decimalProblem() {
        int count = 0;
        int sum = 0;
        for (int i = 10; i < 99; i++) {
            if (func(i) == Math.pow(i, 2)) {
                System.out.println("Find number " + i);
                count++;
                sum += i;
            }
        }
        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
    }

    private static double func(int i) {
        int firstNumber = i / 10;
        int secondNUmber = i % 10;
        return Math.pow(firstNumber+secondNUmber, 3);
    }
}
