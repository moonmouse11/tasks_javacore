package com.justworkman.thirteen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyEight {

    private static final Scanner scanner = new Scanner(System.in);

    public static void rowProblem() {
        try {
            System.out.println("Give me a first pair");
            String firstInput = scanner.nextLine();
            String[] firstPair = firstInput.split(" ");
            if(firstPair.length == 1) throw new InputMismatchException();
            int firstNumber = Integer.parseInt(firstPair[0].trim());
            int firstIndex = Integer.parseInt(firstPair[1].trim());
            System.out.println("Give me a second pair");
            String secondInput = scanner.nextLine();
            String[] secondPair = secondInput.split(" ");
            if(secondPair.length == 1) throw new InputMismatchException();
            int secondNumber = Integer.parseInt(secondPair[0].trim());
            int secondIndex = Integer.parseInt(secondPair[1].trim());
            if(firstIndex < 0 || secondIndex < 0) throw new InputMismatchException();
            int remainder = secondIndex - firstIndex;
            if(Math.abs(remainder) == 1) {
                System.out.println("They are neighbors");
            }
            System.out.println("Start row");
            double row = (double)(secondNumber - firstNumber) / remainder;
            for(double i = firstNumber; i <= secondNumber; i = i + row) {
                System.out.println(i);
            }
            System.out.println("Finish row");
        }catch (NumberFormatException | InputMismatchException exception) {
            System.out.println("Not a valid input");
        }
    }
}
