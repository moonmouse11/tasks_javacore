package com.justworkman.ten;

import java.util.Random;

public class Eleven {

    static Random random = new Random();

    public static void twentyOneGame() {
        int firstCard = random.nextInt(9) + 2;
        int secondCard = random.nextInt(9) + 2;
        int thirdCard = random.nextInt(9) + 2;
        int result = firstCard + secondCard + thirdCard;
        if (result == 21) {
            System.out.println("Computer have a goal");
        } else if (result > 21){
            System.out.println("Computer have to much " + result);
        } else {
            System.out.println("Not enough " + result);
        }

    }
}
