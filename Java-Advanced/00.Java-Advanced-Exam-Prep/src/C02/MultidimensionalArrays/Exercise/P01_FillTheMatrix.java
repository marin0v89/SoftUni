package C02.MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class P01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        String pattern = input[1];
        int[][] matrix = fillTheMatrix(rows, pattern);
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private static int[][] fillTheMatrix(int rows, String pattern) {
        int[][] matrix = new int[rows][rows];
        if (pattern.equals("A")) {
            patternA(matrix);
        } else if (pattern.equals("B")) {
            patternB(matrix);
        }

        return matrix;
    }

    private static void patternB(int[][] matrix) {
        int i = 1;
        for (int r = 0; r < matrix.length; r++) {
            if (r % 2 == 0) {
                for (int c = 0; c < matrix[r].length; c++) {
                    matrix[c][r] = i++;
                }
            } else {
                for (int c = matrix[r].length - 1; c >= 0; c--) {
                    matrix[c][r] = i++;
                }
            }

        }
    }

    private static void patternA(int[][] matrix) {
        int i = 1;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[c][r] = i++;
            }
        }
    }
}
