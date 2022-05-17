package com.justworkman.eleven;

public class Eighteen {

    public static void printWithZero() {
        System.out.println("Start");
        for (int i = 9999; i > 999; i--) {
            if ( i % 100 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nFinish");
    }
}
