package C02.MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03_DiagonalDifferences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = Integer.parseInt(scan.nextLine());
        int[][] matrix = fillTheMatrix(scan, row);

        int diagonalSum = Math.abs(leftDiagonal(matrix, row) - rightDiagonal(matrix, row));
        System.out.println(diagonalSum);
    }

    private static int rightDiagonal(int[][] matrix, int row) {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += matrix[(row - 1) - i][i];
        }
        return sum;
    }

    private static int leftDiagonal(int[][] matrix, int row) {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    private static int[][] fillTheMatrix(Scanner scan, int row) {

        int[][] matrix = new int[row][row];

        for (int[] ints : matrix) {
            int[] arr = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            System.arraycopy(arr, 0, ints, 0, ints.length);
        }

        return matrix;
    }
}
