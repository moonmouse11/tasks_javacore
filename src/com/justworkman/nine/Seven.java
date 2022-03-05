package com.justworkman.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Seven {

    static Scanner scanner = new Scanner(System.in);

    public static void triangleSideProblem() {
        try {
            System.out.println("Give me a first angle");
            int firstCorner = scanner.nextInt();
            System.out.println("Give me a second angle");
            int secondCorner = scanner.nextInt();
            if (firstCorner <= 0 || firstCorner >= 180 || secondCorner <= 0 || secondCorner >= 180) {
                throw new ErrorDataException();
            }
            int thirdCorner = 180 - firstCorner - secondCorner;
            if (thirdCorner <= 0 || thirdCorner > 180) {
                throw new ErrorDataException();
            }
            System.out.println("Type of a next angle - " + nextCorner(thirdCorner));
        } catch (InputMismatchException exception) {
            System.out.println("Not a valid angle");
        } catch (ErrorDataException exception) {
            System.out.println("Not right degrees");
        }
    }

    private static String nextCorner(int corner) {
        if (corner < 90) {
            return "sharp angle";
        } else if (corner == 90) {
            return "right angle";
        } else {
            return "obtuse angle";
        }
    }

    static class ErrorDataException extends RuntimeException {
    }
}
