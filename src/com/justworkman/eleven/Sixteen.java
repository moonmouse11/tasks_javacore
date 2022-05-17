package com.justworkman.eleven;

public class Sixteen {

    public static void printWithSquare() {
        System.out.println("Start");
        for (int i = 10; i < 100; i++) {
            if (i % 4 == 0) {
                System.out.print(i + "# ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nFinish");
    }
}
