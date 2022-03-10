package com.justworkman.ten;

import java.util.Random;

public class Seventeen {

    private static Random random = new Random();
    private static final double MAX = 10.5;

    public static void rightTriangleProblem() {
        double firstLeg = random.nextDouble(MAX - 1) + 1;
        double secondLeg = random.nextDouble(MAX - 1) + 1;
        double hypotenuse = Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2));
        double square = 0.5 * firstLeg * secondLeg;
        double perimeter = firstLeg + secondLeg + hypotenuse;
        System.out.println("First leg = " + Math.round(firstLeg));
        System.out.println("Second leg = " + Math.round(secondLeg));
        System.out.println("Hypotenuse = " + Math.round(hypotenuse));
        System.out.println("Square = " + Math.round(square));
        System.out.println("Perimeter = " + Math.round(perimeter));
    }

}
