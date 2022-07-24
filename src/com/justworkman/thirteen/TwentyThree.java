package com.justworkman.thirteen;

public class TwentyThree {
    public static void anotherProblem() {
        int count = 0;
        int sum = 0;
        for(int i = 10; i < 100; i++) {
            if(doubleSumNumeric(i) == raiseNumeric(i)){
                System.out.println("Find number: " + i);
                sum+=i;
                count++;
            }
        }
        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
    }

    private static int raiseNumeric(int number) {
        int firstNumber = number / 10;
        int secondNumber = number % 10;
        return firstNumber * secondNumber;
    }

    private static int doubleSumNumeric(int number) {
        int firstNumber = number / 10;
        int secondNumber= number % 10;
        return 2 * (firstNumber + secondNumber);
    }
}
