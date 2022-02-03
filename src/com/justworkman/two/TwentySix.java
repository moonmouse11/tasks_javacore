package com.justworkman.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwentySix {
    static Scanner scanner = new Scanner(System.in);

    public static void letMeKnowYourAge() {
        try {
            System.out.println("Give me your birthday year");
            int birthday = scanner.nextInt();
            System.out.println("Give me current year");
            int nowadays = scanner.nextInt();
            if(birthday > nowadays){
                System.out.println("To young man");
            }else {
                System.out.println("Your age: " + (nowadays - birthday));
            }
        } catch (InputMismatchException exception) {
            System.out.println("Think about it.");
        }
    }
}
