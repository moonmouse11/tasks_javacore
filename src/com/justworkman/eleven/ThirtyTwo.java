package com.justworkman.eleven;

public class ThirtyTwo {

    public static void positiveSevenRemainderLower() {
        System.out.println("Start");
        for (int i = 100; i > 10; i--) {
            if (i % 10 == 7) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nFinish");
    }
}
