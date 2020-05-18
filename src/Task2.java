package src;

import java.util.Scanner;

public class Task2 {
    // Drawing a staircase structure - given the required height, output a staircase as shown in the example
    public static void main(String[] args) {
        int height;
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert height of the pyramid");
        height = in.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print('#');
            System.out.println();
        }
    }
}
