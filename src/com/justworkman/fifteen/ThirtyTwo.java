package com.justworkman.fifteen;

import java.util.ArrayList;
import java.util.Scanner;

public class ThirtyTwo {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static ArrayList<Long> longList = new ArrayList<>();

    public static void fiveCountEvenInNotEvenIndex() {
        int evenCount = 0;
        int evenIndex = 1;
        while (evenCount < 5) {
            try {
                System.out.println("Give me a number");
                String inputNumber = SCANNER.nextLine();
                long number = Long.parseLong(inputNumber.trim());
                if(number % 2 == 0 && evenIndex % 2 != 0) {
                    evenCount++;
                }
                longList.add(number);
                evenIndex++;
            } catch (NumberFormatException exception) {
                System.out.println("Not a valid number");
            }
        }
        longList.forEach(num -> System.out.println("Input " + num));
    }
}
