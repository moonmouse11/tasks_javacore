package com.justworkman.thirteen;

import java.util.Scanner;

public class TwentySeven {

    private static final Scanner scanner = new Scanner(System.in);

    public static void rowProblem() {
        try {
            System.out.println("Give me a first number");
            String firstInput = scanner.nextLine();
            int firstNumber = Integer.parseInt(firstInput);
            System.out.println("Give me a second number");
            String secondInput = scanner.nextLine();
            int secondNumber = Integer.parseInt(secondInput);
            System.out.println("Give me a third number");
            String thirdInput = scanner.nextLine();
            int thirdNumber = Integer.parseInt(thirdInput);
            if (secondNumber - firstNumber == thirdNumber - secondNumber) {
                int row = thirdNumber - secondNumber;
                int result = thirdNumber + row;
                System.out.println("It's a row!");
                for(int i = 1; i <= 14; i++) {
                    System.out.print(result + " ");
                    result += row;
                }
            } else {
                System.out.println("Sorry. Not a row.");
            }
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }
}
