package src;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        int arraySize;

        Scanner in = new Scanner(System.in);
        System.out.println("Please insert size of the array");
        arraySize = in.nextInt();
        float[] array = new float[arraySize];

        System.out.println("Please insert " + arraySize + " elements of the array");
        for (int i = 0; i < arraySize; i++) {
            array[i] = in.nextFloat();
        }
        float[] temp = new float[arraySize];
        for (int i = 0; i < arraySize; i++)
            temp[i] = array[arraySize - 1 - i];
        array = temp;
        System.out.println("Inverted array: ");
        for (float f : array) {
            System.out.print(f + "/ ");
        }
    }
}
