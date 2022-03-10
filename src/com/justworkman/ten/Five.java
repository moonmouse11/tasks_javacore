package com.justworkman.ten;

import java.util.Random;

public class Five {

    static Random random = new Random();

    public static void randomFromRandom() {
        int base = random.nextInt(89) + 10;
        System.out.println("Base " + base);
        int firstRandom = random.nextInt(base);
        int secondRandom = random.nextInt(base);
        int thirdRandom = random.nextInt(base);
        System.out.println(firstRandom + " " + secondRandom + " " + thirdRandom);
    }
}
