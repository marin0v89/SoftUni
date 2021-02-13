package C02.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P01_CompareMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrixOne = fillTheMatrix(scan);
        int[][] matrixTwo = fillTheMatrix(scan);

        System.out.println(checkTheMatrix(matrixOne, matrixTwo)
                ? "equal"
                : "not equal");
    }

    private static boolean checkTheMatrix(int[][] matrixOne, int[][] matrixTwo) {
        int rowOne = matrixOne.length;
        int colOne = matrixOne[0].length;

        int rowTwo = matrixTwo.length;
        int colTwo = matrixTwo[0].length;
        if (rowOne != rowTwo || colOne != colTwo) {
            return false;
        }

        for (int r = 0; r < rowOne; r++) {
            for (int c = 0; c < colOne; c++) {
                if (matrixOne[r][c] != matrixTwo[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int[][] fillTheMatrix(Scanner scan) {
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        scan.nextLine();
        int[][] matrix = new int[rows][cols];


        for (int r = 0; r < rows; r++) {
            int[] arr = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if (cols >= 0) System.arraycopy(arr, 0, matrix[r], 0, cols);
        }

        return matrix;
    }
}
