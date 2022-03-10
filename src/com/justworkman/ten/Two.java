package com.justworkman.ten;

import java.util.Random;

public class Two {

    public static void randomBigger() {
        Random random = new Random();
        int firstRandom = random.nextInt(18) - 9;
        int secondRandom = random.nextInt(18) - 9;
        System.out.println("First = " + firstRandom + " Second = " + secondRandom);
        if (firstRandom > secondRandom) {
            System.out.println("First number bigger");
        } else if (firstRandom == secondRandom) {
            System.out.println("They are equals");
        } else {
            System.out.println("Second number bigger");
        }
    }
}
