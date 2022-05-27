package com.justworkman.twelve;

import java.util.Scanner;

public class Six {

    private static final Scanner scanner = new Scanner(System.in);

    public static void findDividers() {
        try {
            System.out.println("Give me a number");
            String inputNumber = scanner.nextLine();
            int number = Integer.parseInt(inputNumber.trim());
            int dividerCount = 0;
            for(int i = 10; i < 100; i++) {
                if(number % i == 0) dividerCount++;
            }
            System.out.println("Count of dividers " + dividerCount);
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }
}
