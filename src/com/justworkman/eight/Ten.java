package com.justworkman.eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ten {

    static Scanner scanner = new Scanner(System.in);

    public static void powPower() {
        try {
            System.out.println("Give me a number");
            int number = scanner.nextInt();
            if (number >= 0) {
                throw new MyException();
            }
            double answer = Math.pow(number, 2);
            System.out.println("Your answer is " + answer);
        } catch (InputMismatchException exception ) {
            System.out.println("Not a valid number");
        } catch (MyException exception) {
            System.out.println("Not a suit number");
        }
    }

}

class MyException extends RuntimeException {
}
