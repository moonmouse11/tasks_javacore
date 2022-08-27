package com.justworkman.fifteen;

public class ThirtyEight {

    public static void bigSumDivider() {
        for (int i = 99; i > 9; i--) {
            int sum = getSum(i);
            if (i % sum == 0) {
                System.out.println("We found number " + i);
                break;
            }
        }
    }

    private static int getSum(int number) {
        int firstNumber = number % 10;
        int secondNumber = number / 10;
        return firstNumber + secondNumber;
    }
}
