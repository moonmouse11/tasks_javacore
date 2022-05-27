package com.justworkman.twelve;

import java.util.Scanner;

public class Thirteen {

    private static final Scanner scanner = new Scanner(System.in);

    public static void coinProblem() {
        coinNote(10);
        coinNote(100);
        coinNote(1000);
    }

    private static void coinNote(int length) {
        int headCount = 0;
        int tailsCount = 0;
        for (int i = 1; i <= length; i++) {
            try {
                System.out.println("What side of coin");
                String inputSide = scanner.nextLine();
                byte side = Byte.parseByte(inputSide.trim());
                if (side != 0 & side != 1) throw new NumberFormatException();
                if (side == 1) headCount++;
                if (side == 0) tailsCount++;
            } catch (NumberFormatException exception) {
                System.out.println("Not a valid side of coin");
                i--;
            }
        }
        System.out.println("Heads count " + headCount);
        System.out.println("Tails count " + tailsCount);
    }
}
