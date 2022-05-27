package com.justworkman.twelve;

import java.util.Scanner;

public class Two {

    private static final Scanner scanner = new Scanner(System.in);
    private static int evenCount = 0;
    private static int notEvenCount = 0;

    public static void fifteenNumbers() {
        for (int i = 0; i < 15; i++) {
            try {
                System.out.println("Give me a " + (i + 1) + " number");
                String answer = scanner.nextLine();
                int number = Integer.parseInt(answer.trim());
                if (number % 2 == 0) evenCount++;
                if (number % 2 != 0) notEvenCount++;
            } catch (NumberFormatException exception) {
                System.out.println("Try another format");
                i--;
            }
        }
        System.out.println("Count of even numbers " + evenCount);
        System.out.println("Count of not even numbers " + notEvenCount);
    }
}
