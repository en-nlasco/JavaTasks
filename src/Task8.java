package src;

import java.util.Scanner;

public class Task8 {
    //Given an integer n, determine all prime numbers smaller than n
    public static void main(String[] args) {
        int n;
        int primeNumbers = 0;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Please insert a natural number");
            n = in.nextInt();
        }
        while (n <= 0);
        if (n > 2) {
            primeNumbers = 1;
            for (int i = 3; i < n; i++) {
                boolean isPrime = false;
                for (int j = 2; j < i; j++)
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    } else isPrime = true;
                if (isPrime)
                    primeNumbers++;
            }
        } else System.out.println("There no prime numbers smaller than " + n);
        System.out.println("There are " + primeNumbers + " prime numbers, smaller than " + n);
    }
}
