package com.justworkman.twelve;

import java.util.Scanner;

public class Four {

    private static final Scanner scanner = new Scanner(System.in);
    private static int count = 0;
    private static int numberBelow = 0;

    public static void seventeenNumbers() {
        for (int i = 1; i < 18; i++) {
            try {
                System.out.println("Give me a " + i + " number");
                String input = scanner.nextLine();
                int number = Integer.parseInt(input.trim());
                if(number > numberBelow) count++;
                numberBelow = number;
            } catch (NumberFormatException exception) {
                System.out.println("Not a valid number");
                i--;
            }
        }
        System.out.println(count + " numbers a bigger than number before");
    }
}
