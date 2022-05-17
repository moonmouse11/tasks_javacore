package com.justworkman.eleven;

public class Seventeen {

    public static void printRemainderSeven() {
        System.out.println("Start");
        for (int i = 100; i < 1000; i++) {
            if (i % 10 == 7) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nFinish");
    }
}
