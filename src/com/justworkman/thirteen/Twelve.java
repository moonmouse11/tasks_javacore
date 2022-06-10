package com.justworkman.thirteen;

import java.util.Scanner;

public class Twelve {

    private static final Scanner scanner = new Scanner(System.in);

    public static void pupilsProblem() {
        double sumOfGrades = 0;
        int badGrades = 0;
        for (int i = 1; i <= 30; i++) {
            try {
                System.out.println("Give me a grade of " + i + " pupil");
                String inputGrade = scanner.nextLine();
                int grade = Integer.parseInt(inputGrade.trim());
                if (grade < 0 || grade > 5) throw new NumberFormatException();
                if (grade <= 2) badGrades++;
                sumOfGrades += grade;
            } catch (NumberFormatException exception) {
                System.out.println("Not a valid grade");
                i--;
            }
        }
        System.out.println("Count of bad grades " + badGrades);
        System.out.println("Average grade " + (sumOfGrades / 30));
    }
}
