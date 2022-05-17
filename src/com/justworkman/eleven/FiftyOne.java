package com.justworkman.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FiftyOne {

    private static final Scanner scanner = new Scanner(System.in);

    public static void rowWithPlus() {
        try {
            System.out.println("Give me a number");
            int inputNumber = scanner.nextInt();
            if(inputNumber <= 0) throw new InputMismatchException();
            System.out.println("Start");
            for (int i =1; i <= inputNumber; i++) {
                if (i != inputNumber) { System.out.print(i + "+");}
                else { System.out.println(i);}
            }
            System.out.println("Finish");
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }
}
