package com.justworkman.ten;

import java.util.Random;

public class Seven {

    static Random random = new Random();

    public static void randomAgain() {
        int first = random.nextInt(89) + 10;
        int second = random.nextInt(89) + 10;
        if (first < second) {
            System.out.println("Second is bigger");
            int firstRandom = random.nextInt(second - first) + first;
            int secondRandom = random.nextInt(second - first) + first;
            int thirdRandom = random.nextInt(second - first) + first;
            System.out.println(firstRandom + " " + secondRandom + " " + thirdRandom);
        } else if (first > second) {
            System.out.println("First is bigger");
            int firstRandom = random.nextInt(first - second) + second;
            int secondRandom = random.nextInt(first - second) + second;
            int thirdRandom = random.nextInt(first - second) + secondRandom;
            System.out.println(firstRandom + " " + secondRandom + " " + thirdRandom);
        } else {
            System.out.println("Can't randomize");
        }
    }
}
