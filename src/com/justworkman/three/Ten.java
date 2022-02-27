package com.justworkman.three;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ten {

    static Scanner scanner = new Scanner(System.in);
    private static final double EURO = 94.53;

    public static void vanyaMoney() {
        try {
            System.out.println("Vanya money");
            int vanyaMoney = scanner.nextInt();
            System.out.println("Parents money");
            int parentsMoney = scanner.nextInt();
            double euro = (vanyaMoney + parentsMoney) / EURO;
            System.out.println("Vanya money = " + euro + " euro");
        } catch (InputMismatchException exception) {
            System.out.println("Wrong input. It's not a money");
        }
    }
}
