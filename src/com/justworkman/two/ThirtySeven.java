package com.justworkman.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirtySeven {

    private static Scanner scanner = new Scanner(System.in);

    public static void pupilProblem() {
        try {
            System.out.println("Give me name");
            String name = scanner.nextLine();
            System.out.println("Give me surname");
            String surname = scanner.nextLine();
            System.out.println("Name " + name + " " + surname);
            System.out.println("Surname " + surname + " " + name);
        } catch (InputMismatchException exception) {
            System.out.println("Something wrong");
        }
    }
}
