package com.justworkman.six;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nine {

    static Scanner scanner = new Scanner(System.in);

    public static void evenBeautiful() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number > 99 && isEven(number)) {
                System.out.println("It's a beautiful even");
            } else {
                System.out.println("Not a beautiful");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a number");
        }
    }

    private static boolean isEven(int number) {
        int procedure = number % 10;
        if (procedure % 2 == 0) {
            if (number / 10 == 0) {
                return true;
            } else {
                return isEven(number / 10);
            }
        }
        return false;
    }
}
