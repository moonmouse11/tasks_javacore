package com.justworkman.eleven;

public class Nineteen {

    public static void numbersDividerFive() {
        System.out.println("Start");
        for (int i = 99; i > 9; i--) {
            if (i % 5 == 0)
                System.out.print(i + " ");
        }
        System.out.println("\nFinish");
    }
}
