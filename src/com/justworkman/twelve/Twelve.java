package com.justworkman.twelve;

import java.util.Date;
import java.util.Scanner;

public class Twelve {

    private static final Scanner scanner = new Scanner(System.in);

    public static void pupilsBirthday() {
        int winterCounter = 0;
        int springCounter = 0;
        int summerCounter = 0;
        int fallCounter = 0;
        for (int i = 1; i <= 1234; i++) {
            try {
                System.out.println("Give me a " + i + " pupil birthday date");
                String inputDate = scanner.nextLine();
                int date = Integer.parseInt(inputDate.trim());
                System.out.println("Give me a pupil birthday month");
                String inputMonth = scanner.nextLine();
                int month = Integer.parseInt(inputMonth.trim());
                System.out.println("Give me a pupil birthday year");
                String inputYear = scanner.nextLine();
                int year = Integer.parseInt(inputYear.trim());
                Date pupilsBirthdate = new Date(year - 1900, month - 1, date + 1);
                System.out.println(pupilsBirthdate.toGMTString());
                if (pupilsBirthdate.getMonth() <= 2) winterCounter++;
                if (pupilsBirthdate.getMonth() > 2 && pupilsBirthdate.getMonth() < 5) springCounter++;
                if (pupilsBirthdate.getMonth() > 5 && pupilsBirthdate.getMonth() < 8) summerCounter++;
                if (pupilsBirthdate.getMonth() > 8) fallCounter++;
            } catch (NumberFormatException exception) {
                System.out.println("Not a valid date");
                i--;
            }
        }
        System.out.println("Winter pupils " + winterCounter);
        System.out.println("Spring pupils " + springCounter);
        System.out.println("Summer pupils " + summerCounter);
        System.out.println("Autumn pupils " + fallCounter);
    }
}
