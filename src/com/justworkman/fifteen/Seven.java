package com.justworkman.fifteen;

import java.util.Scanner;

public class Seven {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void giveMeAPassword() {
        int number = 0;
        while(number != 123){
            try{
                System.out.println("Enter a password");
                String inputPassword = SCANNER.nextLine();
                number = Integer.parseInt(inputPassword.trim());
            } catch (NumberFormatException ignored){}
            if(number != 123) System.out.println("Not a valid password. Try again");
        }
        System.out.println("Valid password");

    }
}
