package com.justworkman.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Seventeen {

    static Scanner scanner = new Scanner(System.in);

    public static void powOnScreen() {
        try {
            System.out.println("Give me integer to pow_");
            int number = scanner.nextInt();
            System.out.println("Answer: " + number * number);
        }catch (InputMismatchException exception){
            System.out.println("Answer: wrong.");
        }
    }
}
