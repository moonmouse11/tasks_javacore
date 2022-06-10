package com.justworkman.thirteen;

import java.util.Scanner;

public class Eleven {

    private static final Scanner scanner = new Scanner(System.in);

    public static void riverDisaster() {
        for (int i = 1; i <= 50; i++) {
            try {
                System.out.println("Give me a day of a week");
                String inputWeekday = scanner.nextLine();
                int weekday = Integer.parseInt(inputWeekday.trim());
                if (weekday <= 0 || weekday > 7) throw new NumberFormatException();
                System.out.println("Give me a grade of pollution");
                String inputPollution = scanner.nextLine();
                int pollution = Integer.parseInt(inputPollution.trim());
                if (pollution < 0 || pollution > 10) throw new NumberFormatException();
                if (pollution > 6) System.out.println("Danger!");
                if (weekday == 2 && pollution < 5) System.out.println("Calm Tuesday");
            } catch (NumberFormatException exception) {
                System.out.println("Not a valid number");
                i--;
            }
        }
    }
}
