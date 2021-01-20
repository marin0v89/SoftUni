package Lab;

import java.util.*;


public class PositionOf_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix = readMatrix(scan);

        int n = Integer.parseInt(scan.nextLine());

        if (!compareElements(matrix, n)) {
            System.out.println("not found");
        }
    }

    private static boolean compareElements(int[][] matrix, int n) {
        boolean isFoud = false;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == n) {
                    System.out.println(r + " " + c);
                    isFoud = true;
                }
            }
        }
        return isFoud;
    }


    private static int[][] readMatrix(Scanner scan) {
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        scan.nextLine();

        int[][] matrix = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            String[] line = scan.nextLine().split("\\s+");
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = Integer.parseInt(line[c]);
            }
        }
        return matrix;
    }
}
