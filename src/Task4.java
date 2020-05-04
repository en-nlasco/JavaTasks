package src;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int arrayLength;
        boolean changesDone = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Please specify the lengths of your array of Integers");
        arrayLength = in.nextInt();
        Integer[] array = new Integer[arrayLength];
        System.out.println("Please insert " + arrayLength + " elements:");
        for (int i = 0; i < arrayLength; i++)
            array[i] = in.nextInt();

        do {
            changesDone = false;
            for (int i = 1; i < arrayLength; i++)
                if (array[i] < array[i - 1]) {
                    Integer temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    changesDone = true;
                }
        }
        while (changesDone);

        System.out.println("Here is the array sorted ascending:");
        for (Integer i : array)
            System.out.print(i + "/ ");
    }

}

