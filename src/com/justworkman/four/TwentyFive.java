package com.justworkman.four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyFive {

    static Scanner scanner = new Scanner(System.in);

    public static void barterWithNumber() {
        try {
            System.out.println("Give me a first number");
            int first = scanner.nextInt();
            System.out.println("Give me a second number");
            int second = scanner.nextInt();
                int firstBarter = first % 10;
                int secondBarter = second % 10;
                int firstAnswer = first - firstBarter + secondBarter;
                int secondAnswer = second - secondBarter + firstBarter;
                System.out.println("First number = " + firstAnswer);
                System.out.println("Second number = " + secondAnswer);
        } catch (InputMismatchException exception) {
            System.out.println("Wrong type of number");
        }
    }
}
