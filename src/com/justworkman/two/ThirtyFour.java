package com.justworkman.two;

import java.util.Scanner;

public class ThirtyFour {
    private static final String HELLO = "Hello, ";

    static Scanner scanner = new Scanner(System.in);

    public static void hello() {
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println(HELLO + name + "!");
    }
}
