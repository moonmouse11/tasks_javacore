package com.justworkman.eleven;

public class FortySeven {

    public static void strangeMethod() {
        System.out.println("Start");
        for (int i = 100; i < 1000; i++) {
            if (isSqrt(i) && isNotReverse(i) && notHaveAZero(i))
                System.out.print(i + " ");
        }
        System.out.println("\nFinish");
    }

    private static boolean isSqrt(int number) {
        double answer = Math.sqrt(number * reverseNumber(number));
        return answer % 1 == 0.00;
    }

    private static boolean isNotReverse(int number) {
        return number != reverseNumber(number);
    }

    private static int reverseNumber(int number) {
        StringBuffer reverse = new StringBuffer(String.valueOf(number)).reverse();
        return Integer.parseInt(String.valueOf(reverse));
    }

    private static boolean notHaveAZero(int number) {
        return number % 100 != 0;
    }
}
