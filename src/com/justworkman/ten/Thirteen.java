package com.justworkman.ten;

import java.util.Random;

public class Thirteen {

    static Random random = new Random();

    public static void boneGame() {
        int firstPlayerResult = 0;
        int secondPlayerResult = 0;
        for (int i = 0; i < 10; i++) {
            int firstBone = random.nextInt(6) + 1;
            int secondBone = random.nextInt(6) + 1;
            System.out.println((i + 1) + " round");
            firstPlayerResult += firstBone;
            secondPlayerResult += secondBone;
            System.out.println("First player score : " + firstPlayerResult);
            System.out.println("Second player score : " + secondPlayerResult);
        }
        if (firstPlayerResult == secondPlayerResult) {
            System.out.println("Nobody winner");
        } else if (firstPlayerResult > secondPlayerResult) {
            System.out.println("First player win");
        } else {
            System.out.println("Second player win");
        }
    }
}
