package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Five {

    static Scanner scanner = new Scanner(System.in);

    public static void flatProblem() {
        try {
            System.out.println("Give me a flat number");
            int flatNumber = scanner.nextInt();
            if (flatNumber <= 0 )
                throw new InputMismatchException();
            int floor = flatNumber / 3;
            int side = flatNumber % 3;
            System.out.println("Floor " + floor + " side " + whatSide(side));
        }catch (InputMismatchException exception) {
            System.out.println("Not a valid number of flat");
        }
    }

    private static String whatSide(int side) {
        switch (side) {
            case 0:
                return "right";
            case 1:
                return "left";
            case 2:
                return "center";
            default:
                return "";
        }
    }
}
