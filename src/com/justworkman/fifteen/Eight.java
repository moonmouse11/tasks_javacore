package com.justworkman.fifteen;

import java.util.Scanner;

public class Eight {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void untilNeedSum() {
        int sum = 0;
        int count = 0;
        while(sum < 150) {
            try{
                System.out.println("Give me a number");
                String inputNUmber = SCANNER.nextLine();
                int number = Integer.parseInt(inputNUmber.trim());
                count++;
                sum += number;
            } catch (NumberFormatException exception) {
                System.out.println("Not a valid number");
            }
        }
        System.out.println("Count of inputs: " + count);
        System.out.println("Sum of inputs: " + sum);
    }
}
