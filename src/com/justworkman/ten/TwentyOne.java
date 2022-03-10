package com.justworkman.ten;

import java.util.Random;

public class TwentyOne {

    private static Random random = new Random();


    public static void coordinateProblem() {
        int xPoint = random.nextInt(60) - 30;
        int yPoint = random.nextInt(60) - 30;
        System.out.println("Point X "  + xPoint);
        System.out.println("Point Y "  + yPoint);
        whatQuarter(xPoint, yPoint);
        whatHorde(xPoint, yPoint);
        lengthToPoint(xPoint, yPoint);
        corner(xPoint, yPoint);
    }

    private static void corner(int xPoint, int yPoint) {
        double corner = Math.toDegrees(Math.atan2(Math.abs(yPoint), Math.abs(xPoint)));
        System.out.println("Corner =  " + corner);
    }

    private static void lengthToPoint(int xPoint, int yPoint) {
        double length = Math.sqrt(Math.pow(Math.abs(xPoint), 2) + Math.pow(Math.abs(yPoint), 2));
        System.out.println("Length to center " + length);
    }

    private static void whatHorde(int xPoint, int yPoint) {
        if (Math.abs(xPoint) > Math.abs(yPoint)) {
            System.out.println("Closer to Y");
        } else if (Math.abs(xPoint) == Math.abs(yPoint)) {
            System.out.println("Length equals");
        } else {
            System.out.println("Closer to X");
        }
    }

    private static void whatQuarter(int xPoint, int yPoint) {
        String answer = "";
        if (xPoint > 0 && yPoint > 0) answer = "first";
        if (xPoint < 0 && yPoint > 0) answer = "second";
        if (xPoint < 0 && yPoint < 0) answer = "third";
        if (xPoint < 0 && yPoint < 0) answer = "fourth";
        System.out.println("Point in " + answer + " quarter");
    }
}
