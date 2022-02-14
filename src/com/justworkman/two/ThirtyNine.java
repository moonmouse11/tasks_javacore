package com.justworkman.two;

import com.justworkman.otherres.ColorConsole;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ThirtyNine {

    private static Scanner scanner = new Scanner(System.in);

    public static void forDocuments() {
        try{
            System.out.println("Give me a whole name");
            String wholeName = scanner.nextLine();
            String [] operator = wholeName.split(" ");
            String answer = operator[1].toUpperCase(Locale.ROOT).charAt(0) + "." +
                    operator[2].toUpperCase(Locale.ROOT).charAt(0) + "." +
                    operator[0];
            System.out.println(ColorConsole.ANSI_RESET + answer);
        } catch (InputMismatchException exception) {
            System.out.println("Trouble");
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Not a whole name");
        }
    }
}
