package com.justworkman.six;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Twelve {

    static Scanner scanner = new Scanner(System.in);

    public static void discriminant() {
        try {
            System.out.println("Give me a first index");
            int firstIndex = scanner.nextInt();
            System.out.println("Give me a second index");
            int secondIndex = scanner.nextInt();
            System.out.println("Give me a third index");
            int thirdIndex = scanner.nextInt();
            double discriminant = Math.pow(secondIndex, 2) - 4 * firstIndex * thirdIndex;
            if (discriminant < 0) {
                System.out.println("We have a answer");
            } else {
                System.out.println("No, answer doesn't exist");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a number");
        }
    }
}
