package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ten {

    static Scanner scanner = new Scanner(System.in);

    public static void anotherInterestingTask() {
        try {
            System.out.println("Give me first number");
            int firstNumber = scanner.nextInt();
            System.out.println("Give me a second number");
            int secondNumber = scanner.nextInt();
            System.out.println("Give me a third number");
            int thirdNumber = scanner.nextInt();
            System.out.println(inSwitchDecide(firstNumber, secondNumber, thirdNumber));
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static String inSwitchDecide(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber == secondNumber && firstNumber == thirdNumber) return "Equals numbers";
        if (firstNumber == secondNumber) {
            if (thirdNumber > firstNumber) return "Third number bigger, other equals";
            return "Third number lower, other equals";
        } else if (secondNumber == thirdNumber) {
            if (firstNumber < secondNumber) return "First number lower, other equals";
            return "First number bigger, other equals";
        } else if (firstNumber == thirdNumber) {
            if (secondNumber < firstNumber) return "Second number lower, other equals";
            return "Second number lower, other equals";
        } else if (firstNumber < secondNumber && thirdNumber < secondNumber) {
            if (thirdNumber < firstNumber) return "Second number bigger, first in center, third lower";
            return "Second number bigger, third in center, first lower";
        } else if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            if (thirdNumber < secondNumber) return "First number bigger, second in center, third lower";
            return "First number bigger, third in center, second lower";
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            if (secondNumber < firstNumber) return "Third number bigger, first in center, second lower";
            return "Third number bigger, second in center, first lower";
        } else {
            return "Error";
        }
    }
}
