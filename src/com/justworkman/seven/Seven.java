package com.justworkman.seven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Seven {

    static Scanner scanner = new Scanner(System.in);

    public static void classroomProblem() {
        try {
            System.out.println("How many pupils in class");
            int pupils = scanner.nextInt();
            System.out.println("How many chairs in classroom");
            int chairs = scanner.nextInt();
            if (pupils < 0 || chairs < 0) {
                throw new InputMismatchException();
            }
            if (pupils <= chairs) {
                System.out.println("All fine");
            } else {
                System.out.println("We need more chairs");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a suit number");
        }
    }
}
