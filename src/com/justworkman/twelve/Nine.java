package com.justworkman.twelve;

public class Nine {

    public static void beautifulNumber() {
        System.out.println("Start");
        for(int i = 100; i < 1000; i++) {
            if (trimPow(i) == middlePow(i)) System.out.print(i + " ");
        }
        System.out.println("\nFinish");
    }

    private static int middlePow(int number) {
        int middleNumber = number / 10 % 10;
        return (int)Math.pow(middleNumber, 2);
    }

    private static int trimPow(int number) {
        int firstNumber = number / 100;
        int secondNumber = number % 10;
        return (int)(Math.pow(firstNumber,2) + Math.pow(secondNumber, 2));
    }
}
