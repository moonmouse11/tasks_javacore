package com.justworkman.fifteen;

import java.util.Scanner;

public class ThirtyFour {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void sumOfPow() {
        try {
            System.out.println("Give me a number");
            String inputNumber = SCANNER.nextLine();
            int number = Integer.parseInt(inputNumber.trim());
            int sum = 0;
            int numeric = 1;
            StringBuilder answer = new StringBuilder();
            while (sum < number){
                sum += (int) Math.pow(numeric, 2);
                answer.append("+").append(numeric).append((char) 178);
                numeric++;
            }
            answer.deleteCharAt(0);
            System.out.println(answer);
        }catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }
}
