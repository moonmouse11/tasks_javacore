package com.justworkman.eleven;

public class ThirtyOne {

    public static void positiveSevenRemainder() {
        System.out.println("Start");
        for (int i = 10; i < 100; i++) {
            if (i % 10 == 7) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nFinish");
    }
}
