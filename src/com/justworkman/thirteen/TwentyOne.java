package com.justworkman.thirteen;

public class TwentyOne {
    public static void anotherDecimalProblem() {
        int count = 0;
        int sum = 0;
        for (int i = 10; i < 100; i++) {
            if (i == func(i)) {
                System.out.println("Find number: " + i);
                count++;
                sum += i;
            }
        }
        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
    }

    private static int func(int number) {
        int firstNumber = number / 10;
        int secondNumber = number % 10;
        return 3 * (firstNumber * secondNumber);
    }
}
