package com.justworkman.thirteen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Thirty {

    private static final Scanner scanner = new Scanner(System.in);

    public static void factoryProblem() {
        for (int i = 1; i <= 120; i++) {
            try {
                System.out.println("Give me a ball length");
                String lengthInput = scanner.nextLine();
                int ballLength = Integer.parseInt(lengthInput.trim());
                System.out.println("Give me a ball mass");
                String massInput = scanner.nextLine();
                int ballMass = Integer.parseInt(massInput.trim());
                if (ballLength < 22 || ballLength > 26) throw new InputMismatchException();
                if (ballMass < 71 || ballMass > 77) throw new InputMismatchException();
                System.out.println("Valid ball, go to the next");
            } catch (NumberFormatException | InputMismatchException exception) {
                System.out.println("Nat a valid ball, go to the next");
            }
        }
    }
}
