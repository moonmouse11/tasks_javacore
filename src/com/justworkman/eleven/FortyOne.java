package com.justworkman.eleven;

public class FortyOne {

    public static void evenNumeric() {
        System.out.println("Start");
        for (int i = 100; i < 1000; i++) {
            if (isNumericEven(i)) System.out.print(i + " ");
        }
        System.out.println("\nFinish");
    }

    private static boolean isNumericEven(int number) {
        int first = number / 100;
        int second = number / 10 % 10;
        int third = number % 10;
        return (first % 2 ==0)&&(second % 2 ==0)&&(third % 2 == 0);
    }
}
