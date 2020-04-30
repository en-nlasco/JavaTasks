package src;

import java.util.Scanner;

// task 1
public class Task2 {
    public static void main(String[] args) {
        int height;
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert height of the piramid");
        height = in.nextInt();
        for (int k = height; k > 0; k--) {
            for (int i = k/2+1; i >0; i--) {
                System.out.print(' ');
            }
            for (int j = height-k+1; j >0; j--) {
                System.out.print('#');
            }
            System.out.println();

        }
        ;

    }
}
