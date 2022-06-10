package com.justworkman.thirteen;

import java.util.Scanner;

public class Eighteen {

    private static final Scanner scanner = new Scanner(System.in);

    public static void bankProblem() {
        try {
            System.out.println("Give me a value of your money");
            String inputMoney = scanner.nextLine();
            int money = Integer.parseInt(inputMoney.trim());
            if(money <= 0) throw new NumberFormatException();
            System.out.println("Give me a value of your percent");
            String inputPercent = scanner.nextLine();
            int percent = Integer.parseInt(inputPercent.trim());
            if(percent <= 0) throw new NumberFormatException();
            System.out.println("Give me your time in month");
            String inputMonth = scanner.nextLine();
            int month = Integer.parseInt(inputMonth.trim());
            if(month <= 0) throw new NumberFormatException();
            for(int i = 0; i < month; i++) {
                money = money + (money / 100) * percent;
            }
            System.out.println("Answer: " + money);
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number");
        }
    }
}
