package com.justworkman.ten;

import java.util.Random;

public class Three {

    public static void randomComparison() {
        Random random = new Random();
        int firstRandom = random.nextInt(18) - 9;
        int secondRandom = random.nextInt(18) - 9;
        System.out.println("first " + firstRandom + " second " + secondRandom);
        if (firstRandom > secondRandom) {
            System.out.println("First number bigger");
            System.out.println("Second number lower");
        } else if(firstRandom == secondRandom) {
            System.out.println("They are equals");
        } else {
            System.out.println("Second number bigger");
            System.out.println("First number lower");
        }
    }
}
