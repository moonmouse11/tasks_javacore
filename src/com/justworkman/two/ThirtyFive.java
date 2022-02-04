package com.justworkman.two;

import java.util.Scanner;

public class ThirtyFive {

    private static final String YOUR_NAME = "Your name ";

    private static Scanner scanner = new Scanner(System.in);

    public static void yourName() {
        System.out.println("Give me your name");
        String name = scanner.nextLine();
        System.out.println(YOUR_NAME + name);
    }
}
