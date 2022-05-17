package com.justworkman.eleven;

public class Forty {

    public static void anotherRowProblem() {
        System.out.println("Start");
        for (int i = 100; i < 1000; i++) {
            if (rightNumeric(i)) System.out.print(i + " ");
        }
        System.out.println("\nFinish");
    }

    private static boolean rightNumeric(int number) {
        int first = (number / 100) * (number % 10);
        int second = (int) Math.pow((number % 100 / 10), 2);
        return first == second;
    }
}
