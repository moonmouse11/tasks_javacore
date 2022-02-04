package com.justworkman.two;

import java.util.Scanner;

public class ThirtySix {

    private static final String ARRIVE = "Passenger ";
    private static final String TO_CITY = " go to ";

    private static Scanner scanner = new Scanner(System.in);

    public static void goAway() {
        System.out.println("Give me your name");
        String name = scanner.nextLine();
        System.out.println("Where you go?");
        String nextPoint = scanner.nextLine();
        System.out.println(ARRIVE + name + TO_CITY + nextPoint);
    }
}
