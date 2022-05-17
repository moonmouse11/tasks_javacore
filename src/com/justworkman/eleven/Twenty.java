package com.justworkman.eleven;

public class Twenty {

    public static void printAnotherDivider() {
        System.out.println("Start");
        for (int i = 100; i < 1000; i++) {
            if (i % 80 == 45)
                System.out.print(i + " ");
        }
        System.out.println("\nFinish");
    }
}
