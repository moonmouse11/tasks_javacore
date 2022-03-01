package com.justworkman.seven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nine {

    static Scanner scanner = new Scanner(System.in);

    public static void triangleProblem() {
        try {
            System.out.println("Give me a first leg");
            int firstLeg = scanner.nextInt();
            System.out.println("Give me a second leg");
            int secondLeg = scanner.nextInt();
            System.out.println("Give me a hypotenuse");
            int hypotenuse = scanner.nextInt();
            if (firstLeg <= 0 || secondLeg <= 0 || hypotenuse <= 0) {
                throw new InputMismatchException();
            }
            if (Math.pow(hypotenuse, 2) == Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2)){
                System.out.println("It's a right triangle");
            } else {
                System.out.println("Not right triangle");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a suit number");
        }
    }
}
