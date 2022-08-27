package com.justworkman.fifteen;

import java.util.Random;
import java.util.Scanner;

public class TwentySeven {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    public static void numericInNumberIndex() {
        try {
            System.out.println("Give me a number");
            String inputNumber = SCANNER.nextLine();
            long number = Long.parseLong(inputNumber.trim());
            int randomNumeric = RANDOM.nextInt(10);
            System.out.println("Random numeric " + randomNumeric);
            if (contains(number, randomNumeric)) {
                String index = getIndex(number, randomNumeric);
                int count = getCount(number, randomNumeric);
                System.out.println("Count of numeric in number " + count);
                System.out.println("Index " + index);
            } else {
                System.out.println("Random numeric not contains in number");
            }
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static int getCount(long number, int randomNumeric) {
        int count = 0;
        while(number != 0) {
            int numeric = (int) number % 10;
            if(numeric == randomNumeric) count++;
            number = number / 10;
        }
        return count;
    }

    private static String getIndex(long number, int randomNumeric) {
        StringBuilder returnIndex = new StringBuilder();
        int index = String.valueOf(number).length();
        while(number != 0) {
            int numeric = (int) number % 10;
            if(numeric == randomNumeric) {
                returnIndex.append(index).append(" ");
            }
            index--;
            number = number / 10;
        }
        return returnIndex.reverse().toString();
    }

    private static boolean contains(long number, int randomNumeric) {
        while (number != 0) {
            int numeric = (int) number % 10;
            if (numeric == randomNumeric) return true;
            number = number / 10;
        }
        return false;
    }
}
