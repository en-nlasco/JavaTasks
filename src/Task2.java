package src;

import java.util.Scanner;

public class Task2 {
    // Drawing a staircase structure - given the required height, output a staircase as shown in the example
    public static void main(String[] args) {
        int height;
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert height of the pyramid");
        height = in.nextInt();
        for (int k = height; k > 0; k--) {
            for (int i = k / 2 + 1; i > 0; i--)
                System.out.print(' ');
            for (int j = height - k + 1; j > 0; j--)
                System.out.print('#');
            System.out.println();
        }
    }
}
