package com.justworkman.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nineteen {

    static Scanner scanner = new Scanner(System.in);

    public static void newTask() {
        System.out.println("Give me the integer");
        try {
            int number = scanner.nextInt();
            int previousNumber = number - 1;
            int finalNumber = number + 1;
            System.out.println(previousNumber + " " + number + " " + finalNumber);
        } catch (InputMismatchException exception) {
            System.out.println("Try again");
        }
    }
}
