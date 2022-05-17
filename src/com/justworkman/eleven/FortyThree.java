package com.justworkman.eleven;

public class FortyThree {

    public static void dividedByThree() {
        System.out.println("Start");
        for (int i = 10; i < 100; i++) {
            if (isDivided(i)) System.out.print(i + " ");
        }
        System.out.println("\nFinish");
    }

    private static boolean isDivided(int number) {
        int first = number / 10;
        int second = number % 10;
        return first % 3 == 0 && second % 3 == 0;
    }
}
