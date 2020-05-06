package src;

import java.util.Scanner;

public class Task9 {
    //Given an integer n, determine all friendly number pairs smaller than n
    public static void main(String[] args) {
        int n, pairs = 0;
        int primeNumbers = 0;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Please insert a natural number");
            n = in.nextInt();
        }
        while (n <= 0);
        if (n > 28) {

            for (int i = 2; i < n; i++) {
                double iDivisorSum = 0;
                for (int j = 1; j <= i; j++)
                    if (i % j == 0)
                        iDivisorSum = iDivisorSum + j;
                for (int k = n - 1; k > i; k--) {
                    double kDivisorSum = 0;
                    for (int l = 1; l <= k; l++)
                        if (k % l == 0)
                            kDivisorSum = kDivisorSum + l;
                    if (iDivisorSum / i == kDivisorSum / k) {
                        pairs++;
                        if (pairs == 1)
                            System.out.println("Here are pairs of friendly numbers:");
                        System.out.println(i + " and " + k);
                    }
                    /* System.out.println(iDivisorSum + " and " + kDivisorSum); */
                }
            }
        } else System.out.println("There is no any pair of friendly number smaller than " + n);
        if (pairs > 1)
            System.out.println("Total pairs: " + pairs);
    }
}
