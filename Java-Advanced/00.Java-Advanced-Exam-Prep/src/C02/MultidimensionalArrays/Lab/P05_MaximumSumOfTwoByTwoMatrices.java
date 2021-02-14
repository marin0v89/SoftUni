package C02.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P05_MaximumSumOfTwoByTwoMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine()
                .split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = arr[0];
        int cols = arr[1];

        int[][] matrix = fillTheMatrix(scan, rows, cols);

        int[][] bestMatrix = new int[2][2];
        System.out.println();
        int maxValue = Integer.MIN_VALUE;

        for (int r = 0; r < rows - 1; r++) {
            for (int c = 0; c < cols - 1; c++) {
                int currentSum =
                        matrix[r][c] + matrix[r][c + 1]
                                + matrix[r + 1][c] + matrix[r + 1][c + 1];
                if (currentSum > maxValue) {
                    maxValue = currentSum;
                    bestMatrix[0][0] = matrix[r][c];
                    bestMatrix[0][1] = matrix[r][c + 1];
                    bestMatrix[1][0] = matrix[r + 1][c];
                    bestMatrix[1][1] = matrix[r + 1][c + 1];
                }
            }
        }

        printMatrix(bestMatrix, maxValue);
    }

    private static void printMatrix(int[][] bestMatrix, int maxValue) {
        for (int[] matrix : bestMatrix) {
            for (int c = 0; c < matrix.length; c++) {
                System.out.print(matrix[c] + " ");
            }
            System.out.println();
        }
        System.out.println(maxValue);
    }

    private static int[][] fillTheMatrix(Scanner scan, int rows, int cols) {


        int[][] matrix = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            int[] input = Arrays.stream(scan.nextLine()
                    .split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if (cols >= 0) System.arraycopy(input, 0, matrix[r], 0, cols);
        }

        return matrix;
    }
}
