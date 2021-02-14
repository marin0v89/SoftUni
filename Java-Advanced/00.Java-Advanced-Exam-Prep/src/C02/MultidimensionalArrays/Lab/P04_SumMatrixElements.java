package C02.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P04_SumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] inputData = Arrays.stream(scan.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = inputData[0];
        int cols = inputData[1];

        int[][] matrix = fillTheMatrix(scan, rows, cols);
        int sum = sumTheMatrix(matrix);
        StringBuilder sb = new StringBuilder();
        sb
                .append(rows)
                .append(System.lineSeparator())
                .append(cols)
                .append(System.lineSeparator())
                .append(sum);

        System.out.println(sb.toString());

    }

    private static int sumTheMatrix(int[][] matrix) {
        int sum = 0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                sum += matrix[r][c];
            }
        }


        return sum;
    }

    private static int[][] fillTheMatrix(Scanner scan, int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            int[] input = Arrays.stream(scan.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if (cols >= 0) System.arraycopy(input, 0, matrix[r], 0, cols);
        }
        return matrix;
    }
}
