package com.justworkman.ten;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Twelve {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void twentyOneGameWithPlayer() {
        try {
            boolean playerWin = true;
            int firstCard = randomCard();
            int secondCard = randomCard();
            int playerResult = firstCard + secondCard;
            System.out.println("Player score " + playerResult);
            System.out.println("Next card? If no - print no");
            while (!scanner.nextLine().equalsIgnoreCase("no")) {
                int nextCard = randomCard();
                System.out.println("Next card " + nextCard);
                playerResult += nextCard;
                System.out.println("Your score " + playerResult);
                if (playerResult > 21) {
                    playerWin = false;
                    System.out.println("Player lose");
                    break;
                }
            }
            int computerResult = randomCard() + randomCard() + randomCard();
            if (computerResult < 21) {
                if (playerWin) {
                    System.out.println("Computer score " + computerResult);
                    String answer = (playerResult < computerResult) ? "Computer win" : "Player win";
                    System.out.println(answer);
                } else {
                    System.out.println("Computer win");
                }
            } else {
                System.out.println("Computer lose");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Something wrong");
        }
    }

    private static int randomCard() {
        return random.nextInt(9) + 2;
    }
}
