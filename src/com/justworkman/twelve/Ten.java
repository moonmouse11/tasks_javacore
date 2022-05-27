package com.justworkman.twelve;

import java.util.Scanner;

public class Ten {

    private static final Scanner scanner = new Scanner(System.in);

    public static void pupilsProblem() {
        try {
            System.out.println("Give me a number of pupils");
            String pupilsInput = scanner.nextLine();
            int pupilsNumber = Integer.parseInt(pupilsInput.trim());
            int failNumber = 0;
            for (int i = 1; i <= pupilsNumber; i++) {
                try {
                    System.out.println("Give me a " + i + " pupil degree");
                    String degreeInput = scanner.nextLine();
                    int degree = Integer.parseInt(degreeInput.trim());
                    if (degree <= 2) failNumber++;
                } catch (NumberFormatException exception) {
                    System.out.println("Not a valid degree");
                    i--;
                }
            }
            if (failNumber >= pupilsNumber / 2) System.out.println("Class fail control test");
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number of pupils");
        }
    }
}
