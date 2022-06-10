package com.justworkman.thirteen;

import java.util.Scanner;

public class Ten {

    private static final Scanner scanner = new Scanner(System.in);

    public static void gradeOfRelation() {
        try {
            System.out.println("Give me a first number");
            String inputFirstNumber = scanner.nextLine();
            int firstNumber = Integer.parseInt(inputFirstNumber.trim());
            if (firstNumber <= 0) throw new NumberFormatException();
            System.out.println("Give me a second number");
            String inputSecondNumber = scanner.nextLine();
            int secondNumber = Integer.parseInt(inputSecondNumber.trim());
            if (secondNumber <= 0) throw new NumberFormatException();
            int gradeOfRelation = gradOfRelation(firstNumber, secondNumber);
            System.out.println("Grade of relation of numbers " + gradeOfRelation);
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static int gradOfRelation(int firstNumber, int secondNumber) {
        int min = Math.min(firstNumber, secondNumber);
        int sum = 0;
        for (int i = 1; i < min; i++) {
            if(firstNumber % i == 0 && secondNumber % i == 0) sum += i;
        }
        return sum;
    }
}
