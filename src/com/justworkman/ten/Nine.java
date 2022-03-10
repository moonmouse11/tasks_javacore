package com.justworkman.ten;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Nine {

    static Random random = new Random();

    public static void guessRandom() {
        try {
            int number = random.nextInt(89) + 10;
            System.out.println("Guess number " + number);
            int randomNumber = random.nextInt(11) + number - (11 / 2);
            if (randomNumber == number) {
                System.out.println("Here the match");
            } else if (randomNumber > number) {
                System.out.println("No. Computer think bigger " + randomNumber);
            } else {
                System.out.println("No. Computer think lower " + randomNumber);
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
