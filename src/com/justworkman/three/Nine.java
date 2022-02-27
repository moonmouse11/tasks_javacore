package com.justworkman.three;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nine {

    static Scanner scanner = new Scanner(System.in);

    public static void tickets() {
        try {
            System.out.println("Number of tens tickets");
            int tens = scanner.nextInt() * 10;
            System.out.println("Number of hundreds tickets");
            int hundred = scanner.nextInt() * 100;
            System.out.println("Number of thousands tickets");
            int thousand = scanner.nextInt() * 1000;
            int totalCount = tens + hundred + thousand;
            System.out.println("Result = " + totalCount);
        } catch (InputMismatchException exception) {
            System.out.println("You miss");
        }
    }

}
