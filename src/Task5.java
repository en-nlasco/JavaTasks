package src;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //Given an array of integers, determine the sum of odd numbers and the amount of even numbers
        int arrayLength;
        int evenAmount = 0;
        Integer oddSum = 0;
        boolean changesDone = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Please specify the lengths of your array of Integers");
        arrayLength = in.nextInt();
        Integer[] array = new Integer[arrayLength];
        System.out.println("Please insert " + arrayLength + " elements:");
        for (int i = 0; i < arrayLength; i++)
            array[i] = in.nextInt();
        for (Integer i : array)
            if (i % 2 == 0)
                evenAmount++;
            else oddSum += i;
        System.out.println("Sum of the odd numbers is: " + oddSum);
        System.out.println("Amount of the even numbers is: " + evenAmount);
    }
}
