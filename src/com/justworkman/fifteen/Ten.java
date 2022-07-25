package com.justworkman.fifteen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ten {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static int X;

    public static void decrementX() {
        try {
            System.out.println("Give me X");
            String XInput = SCANNER.nextLine();
            X = Integer.parseInt(XInput.trim());
        } catch (NumberFormatException | InputMismatchException exception) {
            System.out.println("Not a valid X");
        }

        while(X > 0) {
            try{
                System.out.println("Give me next number");
                String nextInput = SCANNER.nextLine();
                int next = Integer.parseInt(nextInput.trim());
                X = X - next;
            } catch (NumberFormatException exception) {
                System.out.println("Not a valid number");
            }
        }
    }
}
