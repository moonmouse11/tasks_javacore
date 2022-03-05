package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Seventeen {

    static Scanner scanner = new Scanner(System.in);

    public static void triangleProblem() {
        try {
            System.out.println("Give me a first angle");
            int firstAngle = scanner.nextInt();
            System.out.println("Give me a second angle");
            int secondAngle = scanner.nextInt();
            System.out.println("Give me a third angle");
            int thirdAngle = scanner.nextInt();
            int allTogether = firstAngle + secondAngle + thirdAngle;
            if (allTogether == 180) {
                System.out.println("They in one triangle");
            } else {
                System.out.println("Sorry, not in one");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid angle");
        }
    }
}
