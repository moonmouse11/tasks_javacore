package com.justworkman.eleven;

public class ThirtyNine {

    public static void anotherRowProblem() {
        System.out.println("Start");
        for(int i = 10; i < 100; i++) {
            if (upperTen(i)) System.out.print(i + " ");
        }
        System.out.println("\nFinish");
    }

    private static boolean upperTen(int number) {
        int first = number / 10;
        int second = number % 10;
        return first * second >= 10;
    }
}
