package com.justworkman.thirteen;

import java.util.Scanner;

public class Thirteen {

    private static final Scanner scanner = new Scanner(System.in);

    public static void pupilsProblem() {
        double sumOfGoodGrades = 0;
        double sumOfBadGrades = 0;
        int goodPupilsCount = 0;
        int badPupilsCount = 0;
        for (int i = 1; i <= 30; i++) {
            try {
                System.out.println("Give me a grade of " + i + " pupil");
                String inputGrade = scanner.nextLine();
                int grade = Integer.parseInt(inputGrade.trim());
                if (grade <= 0 || grade > 5) throw new NumberFormatException();
                if (grade <= 2) {
                    badPupilsCount++;
                    sumOfBadGrades += grade;
                } else {
                    goodPupilsCount++;
                    sumOfGoodGrades += grade;
                }
            } catch (NumberFormatException exception) {
                System.out.println("Not a valid grade");
                i--;
            }
        }
        if (goodPupilsCount != 0 && badPupilsCount != 0) {
            System.out.println("Good pupils count " + goodPupilsCount + " average grade " + (sumOfGoodGrades / goodPupilsCount));
            System.out.println("Bad pupils count " + badPupilsCount + " average grade " + (sumOfBadGrades / badPupilsCount));
        } else if (badPupilsCount == 0){
            System.out.println("All fork work well");
            System.out.println("Average grade " + (sumOfGoodGrades / goodPupilsCount));
        } else {
            System.out.println("Very bad test work");
        }
    }
}
