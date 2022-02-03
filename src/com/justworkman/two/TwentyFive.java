package com.justworkman.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentyFive {

    static Scanner scanner = new Scanner(System.in);

    public static void problemOf3D() {
        try {
            System.out.println("Give me a length");
            int length = scanner.nextInt();
            System.out.println("Give me a width");
            int width = scanner.nextInt();
            System.out.println("Give me height");
            int height = scanner.nextInt();
            int volume = length * width * height;
            int firstEdge = length * width;
            int secondEdge = length * height;
            int thirdEdge = width * height;
            int totalPerimeter = 4 * height + 4* length + 4 * width;
            int totalSquare = 2 * firstEdge + 2 * secondEdge + 2 * thirdEdge;
            System.out.println("Volume: " + volume);
            System.out.println("Edges: " + firstEdge + " " + secondEdge + " " + thirdEdge);
            System.out.println("Total square: " + totalSquare);
            System.out.println("Total perimeter: " + totalPerimeter);
        }catch (InputMismatchException exception) {
            System.out.println("Wrong type");
        }
    }
}
