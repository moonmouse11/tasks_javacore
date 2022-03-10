package com.justworkman.ten;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Four {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void randomFromScanner() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            int firstRandom = random.nextInt(number);
            int secondRandom = random.nextInt(number);
            int thirdRandom = random.nextInt(number);
            System.out.println("first " + firstRandom);
            System.out.println("second " + secondRandom);
            System.out.println("third " + thirdRandom);
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
