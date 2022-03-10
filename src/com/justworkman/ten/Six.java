package com.justworkman.ten;

import java.util.Random;

public class Six {

    static Random random = new Random();

    public static void randomFromRandomLower() {
        int base = random.nextInt(89) + 10;
        System.out.println("Base " + base);
        int firstRandom = random.nextInt(100 - base) + base;
        int secondRandom = random.nextInt(100 - base) + base;
        int thirdRandom = random.nextInt(100 - base) + base;
        System.out.println(firstRandom + " " + secondRandom + " " + thirdRandom);
    }

}
