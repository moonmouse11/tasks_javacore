package com.justworkman.twelve;

import java.util.Scanner;

public class Eleven {

    private static final Scanner scanner = new Scanner(System.in);

    public static void pupilsVotes() {
        int countIN = 0;
        int countOUT = 0;

        for (int i = 1; i < 201; i++) {
            try {
                System.out.println(i + " pupil vote");
                String voteInput = scanner.nextLine();
                int vote = Integer.parseInt(String.valueOf(voteInput.trim().charAt(0)));
                if (vote == 1) countIN++;
                if (vote == 0) countOUT++;
            } catch (NumberFormatException exception) {
                System.out.println("Bad voice");
                i--;
            }
        }

        System.out.println("Pupils want " + countIN);
        System.out.println("Pupils don't want " + countOUT);
    }
}
