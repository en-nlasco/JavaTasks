package src;

import java.util.Scanner;

public class Task6 {
    //Given an integer n, determine the number pi with an error less than n decimal places
    public static void main(String[] args) {
        int decimals;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Please insert number of decimals");
            decimals = in.nextInt();
            if (decimals <= 15 & decimals > 0) {
                String pi = Double.toString(Math.PI);
                for (int i = 0; i < decimals + 2; i++)
                    System.out.print(pi.charAt(i));
            } else
                System.out.println("Inserted value is wrong. Please insert value between 1 and 15");
        }
        while ((decimals > 15) | (decimals <= 0));
    }
}
