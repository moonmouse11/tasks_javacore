package com.justworkman.ten;

import java.util.Random;

public class Fourteen {

    static Random random = new Random();

    public static void fiveRandom() {
        int first = random.nextInt(10) * 10;
        int second = random.nextInt(10) * 10;
        int third = random.nextInt(10) * 10;
        int four = random.nextInt(10) * 10;
        int five = random.nextInt(10) * 10;
        System.out.println(first + " " + second + " " + third + " " + four + " " + five);
    }
}
