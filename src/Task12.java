package src;


import javax.print.attribute.IntegerSyntax;
import java.util.Scanner;


public class Task12 {
    //Given a matrix of integers with size n*n, sort the lines of the matrix by the sum of the elements on those lines
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[][] matrix;
        System.out.println("Please insert matrix size");
        int n = in.nextInt();
        matrix = new Integer[n][n];
        System.out.println("Now, please insert elements of the matrix");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = in.nextInt();

        System.out.println("Here is your matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + ", ");
            System.out.println();
        }

        sortMatrixLines(matrix);
        System.out.println("Here is result after sorting the lines:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + ", ");
            System.out.println();
        }
    }

    public static void sortMatrixLines(Integer[][] matrix) {
        Integer[] line = new Integer[matrix[0].length];
        boolean changesMade = false;
        do {
            for (int i = 0; i < matrix[0].length - 1; i++) {
                changesMade = false;
                Integer sum1 = sumLine(matrix[i]), sum2 = sumLine(matrix[i + 1]);
                if (sum2 < sum1) {
                    line = matrix[i + 1];
                    matrix[i + 1] = matrix[i];
                    matrix[i] = line;
                    changesMade = true;
                }
            }
        } while (changesMade);
    }

    public static Integer sumLine(Integer[] line) {
        Integer sum = 0;
        for (Integer i : line)
            sum += i;
        return sum;
    }
}
