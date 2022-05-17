package com.justworkman.eleven;

public class FortyTwo {

    public static void printSomeNumber() {
        System.out.println("Start");
        for (int i = -999; i < 1000; i++) {
            if (isHundreds(i) && isRemainderAndSum(i)) System.out.print(i + " ");
        }
        System.out.println("\nFinish");
    }

    private static boolean isRemainderAndSum(int number) {
        int sum = number / 100 + number % 10 + number / 10 % 10;
        return number % sum == 0;
    }

    private static boolean isHundreds(int number) {
        return number / 100 != 0;
    }
}
