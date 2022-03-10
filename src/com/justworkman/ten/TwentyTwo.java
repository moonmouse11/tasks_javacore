package com.justworkman.ten;

import java.util.Random;

public class TwentyTwo {

    static Random random = new Random();

    public static void shortProblem() {
        int firstPointX = random.nextInt(60) - 30;
        int secondPointX = random.nextInt(60) - 30;
        int firstPointY = random.nextInt(60) - 30;
        int secondPointY = random.nextInt(60) - 30;
        double length = lengthProblem(firstPointX,firstPointY , secondPointX, secondPointY);
        int lengthABS = (int) length;
        double corner = cornerProblem(firstPointX,firstPointY , secondPointX, secondPointY);
        boolean isCross = isCross(firstPointX,firstPointY , secondPointX, secondPointY);

        printPoints(firstPointX, firstPointY,secondPointX,secondPointY);

        System.out.println("Full length = " + length);
        System.out.println("Not full length = " + lengthABS);
        System.out.println("Is cross " + isCross);
        System.out.println("Corner degrees = " + corner);

    }

    private static void printPoints(int firstPointX, int firstPointY, int secondPointX, int secondPointY) {
        System.out.println("First point " + firstPointX + " " + firstPointY);
        System.out.println("Second point " + secondPointX + " " + secondPointY);
    }

    private static boolean isCross(int firstPointX, int firstPointY, int secondPointX, int secondPointY) {
        if (firstPointX == 0 || firstPointY == 0 || secondPointX == 0 || secondPointY == 0) return true;
        if (firstPointX > 0 && secondPointX < 0 ||firstPointX < 0 && secondPointX > 0) return true;
        if (firstPointY > 0 && secondPointY < 0 ||firstPointY < 0 && secondPointY > 0) return true;
        return false;
    }

    private static double cornerProblem(int firstPointX, int firstPointY, int secondPointX, int secondPointY) {
        int XLength = calc(firstPointX,secondPointX);
        int YLength = calc(firstPointY,secondPointY);
        return Math.toDegrees(Math.atan2(Math.abs(YLength), Math.abs(XLength)));
    }

    private static double lengthProblem(int firstPointX, int firstPointY, int secondPointX, int secondPointY) {
        int XLength = calc(firstPointX,secondPointX);
        int YLength = calc(firstPointY,secondPointY);
        return Math.sqrt(Math.pow(XLength, 2) + Math.pow(YLength,2));

    }

    private static int calc(int firstPoint, int secondPoint) {
        if (firstPoint >= 0 && secondPoint >= 0 || firstPoint <= 0 && secondPoint <= 0) {
            return Math.abs(firstPoint - secondPoint);
        } else {
            return Math.abs(firstPoint) + Math.abs(secondPoint);
        }
    }
}
