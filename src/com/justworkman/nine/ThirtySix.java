package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirtySix {

    static Scanner scanner = new Scanner(System.in);

    public static void oneNumber() {
        try {
            System.out.println("Give me a first name");
            String firstName = scanner.nextLine();
            System.out.println("Give me second name");
            String secondName = scanner.nextLine();
            if (firstName.equals(secondName)) {
                System.out.println("They are namesakes");
            } else {
                System.out.println("They not namesakes");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid name");
        }
    }
}
