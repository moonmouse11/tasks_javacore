package com.justworkman.ten;

import java.util.Random;

public class One {

    public static void randomNumber() {
        Random random = new Random();
        int number = random.nextInt(89) + 10;
        System.out.println("Random number " + number);
    }
}
