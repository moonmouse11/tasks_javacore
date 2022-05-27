package com.justworkman.twelve;

import java.util.Scanner;

public class Eighteen {

    private static final Scanner scanner = new Scanner(System.in);

    public static void gradeOfRelation() {
        try {
            System.out.println("Give me a first number");
            String inputFirstNumber = scanner.nextLine();
            int firstNumber = Integer.parseInt(inputFirstNumber.trim());
            System.out.println("Give me a second number");
            String inputSecondNumber = scanner.nextLine();
            int secondNumber = Integer.parseInt(inputSecondNumber.trim());
            int max = Math.max(firstNumber, secondNumber);
            int relationCount = 0;
            for(int i = 2; i < max; i++) {
                if(firstNumber % i == 0 && secondNumber % i == 0) relationCount++;
            }
            System.out.println("Relation count of numbers " + relationCount);
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }
}
