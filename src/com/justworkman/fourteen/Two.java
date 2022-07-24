package com.justworkman.fourteen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Two {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void anotherCompetitionProblem() {
        double max = Double.MAX_EXPONENT;
        int sportsman = 0;
        for(int i = 1; i <= 5; i++) {
            try {
                System.out.println("Give me result");
                String inputResult = SCANNER.nextLine();
                double result = Double.parseDouble(inputResult.trim());
                if(result < 0) throw new InputMismatchException();
                if(max > result) {
                    max = result;
                    sportsman = i;
                }
                System.out.println(i + " person result = " + result);
            } catch (NumberFormatException | InputMismatchException exception) {
                System.out.println("Not a valid result");
            }
        }
        System.out.println("Best result: " + max + " by " + sportsman + " person");
    }
}
