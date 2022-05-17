package com.justworkman.eleven;

public class FortySix {

    public static void divideProblem() {
        System.out.println("Start");
        for (int i = 100; i < 1000; i++) {
            if(isRightDivide(i)) System.out.print(i + " ");
        }
        System.out.println("\nFinish");
    }

    private static boolean isRightDivide(int number) {
        int first = number % 100;
        int second = number / 100;
        return first % second == 0;
    }
}
