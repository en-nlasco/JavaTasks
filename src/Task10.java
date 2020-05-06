package src;

import java.time.*;
import java.util.Scanner;


public class Task10 {
    //Write a program that outputs the next k leap years
    public static void main(String[] args) {
        int k;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Please insert a natural number");
            k = in.nextInt();
        }
        while (k <= 0);

        for (int i = Year.now().getValue() + 1, j = 1; j <= k; i++)
            if (i % 4 == 0) {
                j++;
                System.out.println(i);
            }
    }
}
