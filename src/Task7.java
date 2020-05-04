package src;

import java.util.Scanner;

public class Task7 {
    //Write a program that will check if a two-dimensional arrays is magical square or not
    public static void main(String[] args) {
        boolean isMagical = true;
        int side;
        Scanner in = new Scanner(System.in);
        System.out.println("Please specify the side length of your square");
        side = in.nextInt();
        int[][] array = new int[side][side];
        System.out.println("Please insert " + side * side + " elements of the square:");
        for (int i = 0; i < side; i++)
            for (int j = 0; j < side; j++)
                array[i][j] = in.nextInt();
        // Verify if the square magical or not
        int[] sum = new int[side * side];
        for (int i = 0; i < side; i++) {
            sum[i] = 0;
            for (int j = 0; j < side; j++)
                sum[i] = sum[i] + array[i][j];
            if (i > 0 && sum[i] != sum[i - 1]) {
                isMagical = false;
                break;
            }
        }
        if (isMagical)
            System.out.println("Square is Magical");
        else
            System.out.println("Square is NOT Magical");
    }
}
