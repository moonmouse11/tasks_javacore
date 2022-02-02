package com.justworkman.two;

public class Eleven {
    public static void nameInStars(String name, String number) {
        for(int i = 0; i < name.length() + number.length(); i++){
            System.out.print("*");
        }
        System.out.println("*");
        System.out.println("* " + name + " *");
        System.out.println("* " + number + " *");
        for(int i = 0; i < name.length() + number.length(); i++){
            System.out.print("*");
        }

    }
}
