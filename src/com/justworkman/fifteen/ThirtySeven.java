package com.justworkman.fifteen;

import java.util.Scanner;

public class ThirtySeven {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void minSumNumber() {
        try {
            System.out.println("Give me a number");
            String inputNumber = SCANNER.nextLine();
            int number = Integer.parseInt(inputNumber.trim());
            int answer = 0;
            for(int i = 10; i <= 99; i++) {
                int sum = getSum(i);
                if(sum == number) {
                    answer = i;
                    break;
                }
            }
            if(answer == 0) {
                System.out.println("That number doesn't exist");
            } else {
                System.out.println("We found it " + answer);
            }
        }catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }

    private static int getSum(int number) {
        int firstNumber = number % 10;
        int secondNumber = number / 10;
        return firstNumber + secondNumber;
    }
}
