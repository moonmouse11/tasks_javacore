package com.justworkman.thirteen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirtyOne {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void schoolProblem() {
        for (int i = 1; i <= 40; i++) {
            try {
                System.out.println(i + " pupil now");
                System.out.println("Give me a Math grade");
                String mathInput = SCANNER.nextLine();
                int mathGrade = Integer.parseInt(mathInput.trim());
                System.out.println("Give me a CS grade");
                String CSInput = SCANNER.nextLine();
                int CSGrade = Integer.parseInt(CSInput.trim());
                int result = mathGrade + CSGrade;
                if(mathGrade < 0 || mathGrade > 5 && CSGrade < 0 || CSGrade > 5) throw new InputMismatchException();
                if(result < 7) {
                    System.out.println("Pupil not allowed");
                } else if (mathGrade > CSGrade){
                    System.out.println("Go to math class");
                } else if (mathGrade < CSGrade) {
                    System.out.println("Go to CS class");
                } else {
                    System.out.println("Go whatever they want");
                }
            } catch (NumberFormatException | InputMismatchException exception) {
                i--;
                System.out.println("Not a valid data for pupil. Try again.");
            }
        }


    }
}
