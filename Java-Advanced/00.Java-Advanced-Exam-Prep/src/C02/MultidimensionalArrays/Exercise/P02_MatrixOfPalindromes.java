package C02.MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class P02_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] matrix = fillTheMatrix(scan);
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        StringBuilder sb = new StringBuilder();
        for (String[] strings : matrix) {
            for (String string : strings) {
                sb.append(string).append(" ");
            }
            sb.append(System.lineSeparator());
        }
        System.out.println(sb.toString());
    }

    private static String[][] fillTheMatrix(Scanner scan) {
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        scan.nextLine();
        String[][] matrix = new String[rows][cols];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = String.format("%c%c%c", 97 + r, 97 + r + c, 97 + r);
            }
        }

        return matrix;
    }
}
