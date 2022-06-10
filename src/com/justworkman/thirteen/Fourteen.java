package com.justworkman.thirteen;

import java.util.Scanner;

public class Fourteen {

    private static final Scanner scanner = new Scanner(System.in);
    private static int allSimpleTickets = 0;
    private static int allFullTickets = 0;
    private static int allFreeTickets = 0;

    public static void schoolShop() {


        for (int i = 1; i <= 200; i++) {
            int simpleTicket = buySimpleTicket();
            if(simpleTicket == -1) i--;
            if(simpleTicket >= 10) allFreeTickets++;
            allSimpleTickets += simpleTicket;
            int fullTicket = buyFullTicket();
            if(fullTicket == -1) i--;
            allFullTickets += fullTicket;
            System.out.println("Next!");
        }

        printAllSellTickets();
    }

    private static void printAllSellTickets() {
        System.out.println("Sold simple tickets " + allSimpleTickets);
        System.out.println("Sold full tickets " + allFullTickets);
        System.out.println("Free tickets " + allFreeTickets);
    }

    private static int buySimpleTicket() {
        try{
            System.out.println("How much you want buy simple tickets");
            String inputTickets = scanner.nextLine();
            int tickets = Integer.parseInt(inputTickets.trim());
            if(tickets < 0) throw new NumberFormatException();
            return tickets;
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number of tickets");
            return - 1;
        }
    }

    private static int buyFullTicket() {
        try{
            System.out.println("How much you want buy full tickets");
            String inputTickets = scanner.nextLine();
            int tickets = Integer.parseInt(inputTickets.trim());
            if(tickets < 0) throw new NumberFormatException();
            return tickets;
        } catch (NumberFormatException exception) {
            System.out.println("Not a valid number of tickets");
            return - 1;
        }
    }
}
