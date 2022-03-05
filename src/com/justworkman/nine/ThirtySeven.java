package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirtySeven {

    static Scanner scanner = new Scanner(System.in);

    public static void namesakesOrNot() {
        try {
            System.out.println("Give me first name");
            String firstName = scanner.nextLine();
            System.out.println("Give me first surname");
            String firstSurname = scanner.nextLine();
            System.out.println("Give me a second name");
            String secondName = scanner.nextLine();
            System.out.println("give me a second surname");
            String secondSurname = scanner.nextLine();
            if (firstName.equals(secondName) && firstSurname.equals(secondSurname)) {
                System.out.println("Full namesake");
            } else if (firstName.equals(secondName)) {
                System.out.println("Only name namesake");
            } else if (secondSurname.equals(firstSurname)) {
                System.out.println("Only surname namesake");
            } else {
                System.out.println("Not a namesake");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Mot a valid data");
        }
    }
}
