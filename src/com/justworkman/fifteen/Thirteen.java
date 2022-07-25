package com.justworkman.fifteen;

import java.util.ArrayList;
import java.util.Scanner;

public class Thirteen {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static ArrayList<Integer> integers = new ArrayList<>();
    public static void arrayRow() {
        while(true) {
            try {
                System.out.println("Give me a number");
                String inputNumber = SCANNER.nextLine();
                int number = Integer.parseInt(inputNumber.trim());
                if (integers.size() != 0) {
                    if(number < integers.get(integers.size() - 1)){
                        break;
                    }
                }
                integers.add(number);
            } catch (NumberFormatException exception) {
                System.out.println("Not a valid number. Try again.");
            }
        }
        System.out.println("Numbers count: " + integers.size());
    }

}
