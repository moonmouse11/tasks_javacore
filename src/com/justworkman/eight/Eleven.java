package com.justworkman.eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eleven {

    static Scanner scanner = new Scanner(System.in);

    public static void pupilsProblem() {
        try {
            System.out.println("How many pupils in the class");
            int pupils = scanner.nextInt();
            System.out.println("How many chair in the classroom");
            int chairs = scanner.nextInt();
            if (pupils <= 0 || chairs <= 0)
                throw new InputMismatchException();
            if (pupils > chairs) {
                int answer = pupils - chairs;
                System.out.println("We need more chairs " + answer);
            } else if (pupils < chairs) {
                int answer = chairs - pupils;
                System.out.println("Chairs free " + answer);
            } else {
                System.out.println("No problem here");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
