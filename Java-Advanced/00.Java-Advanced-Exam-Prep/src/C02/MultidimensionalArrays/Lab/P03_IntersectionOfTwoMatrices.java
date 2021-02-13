package C02.MultidimensionalArrays.Lab;

import java.util.Scanner;

public class P03_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());

        char[][] matrixOne = fillTheMatrix(scan, rows, cols);
        char[][] matrixTwo = fillTheMatrix(scan, rows, cols);
        char[][] matrixThree = fillTheThirdOne(matrixOne, matrixTwo, rows, cols);
        printMatrix(matrixThree);
    }

    private static void printMatrix(char[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }

    }

    private static char[][] fillTheThirdOne(char[][] matrixOne, char[][] matrixTwo, int rows, int cols) {
        char[][] matrix = new char[rows][cols];
        for (int r = 0; r < matrixOne.length; r++) {
            for (int c = 0; c < matrixOne[r].length; c++) {
                char matrixOneCurrent = matrixOne[r][c];
                char matrixTwoCurrent = matrixTwo[r][c];
                if (matrixOneCurrent == matrixTwoCurrent) {
                    matrix[r][c] = matrixOneCurrent;
                } else {
                    matrix[r][c] = '*';
                }
            }
        }
        return matrix;
    }

    private static char[][] fillTheMatrix(Scanner scan, int rows, int cols) {


        char[][] matrix = new char[rows][cols];

        for (int r = 0; r < rows; r++) {
            String[] arr = scan.nextLine().split("\\s+");

            for (int c = 0; c < cols; c++) {
                matrix[r][c] = arr[c].charAt(0);
            }
        }
        return matrix;
    }
}
