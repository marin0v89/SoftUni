package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] size = scan.nextLine().split(", ");

        int rows = Integer.parseInt(size[0]);
        int cols = Integer.parseInt(size[1]);

        int[][] matrix = readMatrix(scan,rows,cols);

        int sum =0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                sum+=matrix[row][col];
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);

    }

    private static int[][] readMatrix(Scanner scan,int rows ,int cols) {


        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int[] arr = Arrays.stream(scan.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = arr;
        }
        return matrix;
    }
}
