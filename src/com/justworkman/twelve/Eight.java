package com.justworkman.twelve;

public class Eight {

    public static void numberStepThree() {
        int countNumber = 0;
        System.out.println("Start");
        for(int i = 10; i < 100; i = i + 3) {
            System.out.print(i + " ");
            countNumber++;
        }
        System.out.println("\nFinish");
        System.out.println("Count of numbers " + countNumber);
    }
}
