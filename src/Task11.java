package src;

public class Task11 {
    //Given three ascendingly sorted arrays, merge the elements of these three arrays to obtain one ascendingly sorted array
    public static void main(String[] args) {

        int[] array1, array2, array3, finalArray;
        array1 = new int[]{2, 7, 9};
        array2 = new int[]{4, 9, 5};
        array3 = new int[]{1, 4, 7, 8};
        for (int i : merge3Arrays(array1, array2, array3))
            System.out.println(i);
    }

    public static int[] merge3Arrays(int[] array1, int[] array2, int[] array3) {
        return merge2Arrays(merge2Arrays(array1, array2), array3);
    }

    public static int[] merge2Arrays(int[] array1, int[] array2) {
        int[] finalArray = new int[array1.length + array2.length];
        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            finalArray[i] = array1[i];
            counter++;
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < counter; j++)
                if (array2[i] < finalArray[j]) {
                    for (int l = counter; l > j; l--) {
                        finalArray[l] = finalArray[l - 1];
                    }
                    finalArray[j] = array2[i];
                    counter++;
                    break;
                } else if (counter - 1 == j) {
                    finalArray[counter] = array2[i];
                    counter++;
                    break;
                }
        }
        return finalArray;
    }
}

