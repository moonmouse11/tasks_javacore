package com.justworkman.twelve;

import com.justworkman.twelve.circle.Circle;
import com.justworkman.twelve.circle.Point;

import java.util.Scanner;

public class Nineteen {

    private static final Scanner scanner = new Scanner(System.in);
    private static int pointInRoundCount = 0;

    public static void circleProblem() {

        Circle circle = getACircle();
        for (int i = 1; i <= 15; i++) {
            Point point = getAPoint();
            if(circle.inCircle(point)) {
                System.out.println("Point in circle!");
                pointInRoundCount++;
            }
        }
        System.out.println("Points in the circle " + pointInRoundCount);

    }

    private static Point getAPoint() {
        try {
            System.out.println("Create a point");
            System.out.println("Give me a X point");
            String inputXPoint = scanner.nextLine();
            int XPoint = Integer.parseInt(inputXPoint.trim());
            System.out.println("Give me a Y point");
            String inputYPoint = scanner.nextLine();
            int YPoint = Integer.parseInt(inputYPoint.trim());
            return new Point(XPoint, YPoint);
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid point");
            return getAPoint();
        }
    }

    private static Circle getACircle() {
        try {
            System.out.println("Create a circle");
            System.out.println("Give me a X point");
            String inputXPoint = scanner.nextLine();
            int XPoint = Integer.parseInt(inputXPoint.trim());
            System.out.println("Give me a Y point");
            String inputYPoint = scanner.nextLine();
            int YPoint = Integer.parseInt(inputYPoint.trim());
            System.out.println("Give me a round");
            String inputRound = scanner.nextLine();
            int round = Integer.parseInt(inputRound.trim());
            return new Circle(XPoint, YPoint, round);
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid circle");
            return getACircle();
        }
    }
}
