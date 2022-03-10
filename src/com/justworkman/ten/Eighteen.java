package com.justworkman.ten;

import java.util.Random;

public class Eighteen {

    private static Random random = new Random();

    public static void randomProblem() {
        int firstNumber = random.nextInt(899) + 100;
        int secondNumber = random.nextInt(899) + 100;
        int thirdNumber = random.nextInt(899) + 100;
        int min = Math.min(firstNumber, secondNumber);
        if (min > Math.min(firstNumber, thirdNumber)) min = Math.min(firstNumber, thirdNumber);
        int max = Math.max(firstNumber, secondNumber);
        if (max < Math.max(firstNumber, thirdNumber)) max = Math.max(firstNumber, thirdNumber);
        int middle = middleMethod(firstNumber, secondNumber, thirdNumber);
        String answer = "";
        if (max == firstNumber) answer += "First number bigger, ";
        if (max == secondNumber) answer += "Second number bigger, ";
        if (max == thirdNumber) answer += "Third number bigger, ";
        if (middle == firstNumber) answer += "first number middle, ";
        if (middle == secondNumber) answer += "second number middle, ";
        if (middle == thirdNumber) answer += "third number middle, ";
        if (min == firstNumber) answer += "first number lower.";
        if (min == secondNumber) answer += "second number lower.";
        if (min == thirdNumber) answer += "third number lower.";
        System.out.println(answer);
    }

    private static int middleMethod(int firstNumber, int secondNumber, int thirdNumber) {
        int middle;
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            if (secondNumber > thirdNumber) {middle = secondNumber; } else {middle = thirdNumber; }
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            if (firstNumber > thirdNumber) {middle = firstNumber; } else { middle = thirdNumber; }
        } else {
            if (firstNumber > secondNumber) {middle =  firstNumber; } else {middle = secondNumber; }
        }
        return middle;
    }
}
