package com.justworkman.two;

public class Twelve {
    public static void sandClock(char symbol, int length) {
        length = Math.max(length, 10);
        char[][] matrix = new char[length][length];
        int count = 0;
        for (int j = 0; j < length; j++) {
            for (int i = 0 + count; i < length - count; i++) {
                matrix[j][i] = symbol;
                matrix[matrix.length - 1 - j][i] = symbol;
            }
            count++;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
