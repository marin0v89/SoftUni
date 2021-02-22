package C02.MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04_MaximalSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        scan.nextLine();

        int[][] matrix = fillTheMatrix(scan, rows, cols);

        int bestSum = Integer.MIN_VALUE;
        int[] bestVector = new int[2];

        for (int r = 0; r < matrix.length - 2; r++) {
            for (int c = 0; c < matrix[r].length - 2; c++) {
                int[] start = new int[]{r, c};
                if (findSum(start, matrix) > bestSum) {
                    bestSum = findSum(start, matrix);
                    bestVector = start;
                }
            }
        }
        System.out.println(String.format("Sum = %d", bestSum));
        printMatrix(bestVector, matrix);
    }

    private static void printMatrix(int[] bestVector, int[][] matrix) {

        for (int r = bestVector[0]; r < bestVector[0] + 3; r++) {
            for (int c = bestVector[1]; c < bestVector[1] + 3; c++) {
                System.out.print(String.format("%d ", matrix[r][c]));
            }
            System.out.println();
        }
    }

    private static int findSum(int[] start, int[][] matrix) {
        int sum = 0;
        for (int r = start[0]; r < start[0] + 3; r++) {
            for (int c = start[1]; c < start[1] + 3; c++) {
                sum += matrix[r][c];
            }
        }
        return sum;
    }

    private static int[][] fillTheMatrix(Scanner scan, int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int[] ints : matrix) {
            int[] arr = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            System.arraycopy(arr, 0, ints, 0, ints.length);
        }
        return matrix;
    }
}
