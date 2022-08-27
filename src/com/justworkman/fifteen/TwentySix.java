package com.justworkman.fifteen;

import java.util.Random;
import java.util.Scanner;

public class TwentySix {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    public static void containsNumeric() {
        try {
            System.out.println("Give me a number");
            String inputNumber = SCANNER.nextLine();
            int randomNumber = RANDOM.nextInt(10);
            int number = Integer.parseInt(inputNumber.trim());
            if (number <= 0) throw new NumberFormatException();
            System.out.println("Random numeric " + randomNumber);
            if (inputNumber.trim().contains(String.valueOf(randomNumber))) {
                System.out.println("Number contains numeric");
            } else {
                System.out.println("Random numeric not contains in input number");
            }
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }
}