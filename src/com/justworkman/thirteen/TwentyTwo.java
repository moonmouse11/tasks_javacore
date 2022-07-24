package com.justworkman.thirteen;

public class TwentyTwo {
    public static void armstrongNumber() {
        int count = 0;
        int sum = 0;
        for(int i = 100; i < 1000; i++) {
            if(i == cubeFunc(i)) {
                System.out.println("Armstrong number: " + i);
                count++;
                sum+=i;
            }
        }
        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
    }

    private static int cubeFunc(int number) {
        int firstNumber = number / 100;
        int secondNumber = number / 10 % 10;
        int thirdNumber = number % 10;
        return (int) Math.pow(firstNumber+secondNumber+thirdNumber, 3);
    }
}
