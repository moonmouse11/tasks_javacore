package com.justworkman.eleven;

public class ThirtyThree {

    public static void rowElevenRemainder() {
        System.out.println("Start");
        for(int i = 100; i < 1000; i++) {
            if(i % 11 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nFinish");
    }
}
