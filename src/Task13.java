package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task13 {
    //Write a function that rotates a list by k elements.
    //For example [1,2,3,4,5,6] rotated by two becomes [3,4,5,6,1,2].
    //Try solving this without creating a copy of the list
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert elements of the list");
        for (int i = in.nextInt(); i > 0; i--) {
            System.out.println("Please insert element to be added to the list");
            list.add(in.nextInt());
        }
        int k;
        System.out.println("Please insert amount of elements you wish to rotate");
        k = in.nextInt();
        System.out.println(rotateElements(list,k));
    }

    public static List<Integer> rotateElements(List<Integer> list, int k) {
        for (int i = 0; i < k; k--) {
            list.add(list.get(i));
            list.remove(i);
        }
        return list;
    }
}
