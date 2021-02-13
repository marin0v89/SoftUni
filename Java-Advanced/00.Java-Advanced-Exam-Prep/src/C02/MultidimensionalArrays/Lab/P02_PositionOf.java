package C02.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P02_PositionOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [][]matrix = fillTheMatrix(scan);
        int indexToFind = Integer.parseInt(scan.nextLine());

        if (!findTheIndex(matrix,indexToFind)){
            System.out.println("not found");
        }
        
    }

    private static boolean findTheIndex(int[][] matrix, int indexToFind) {
            boolean isFound = false;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c]==indexToFind){
                    System.out.println(String.format("%d %d",r,c));
                    isFound=true;
                }
            }
        }
        return isFound;
    }

    private static int[][] fillTheMatrix(Scanner scan) {
        int row = scan.nextInt();
        int col = scan.nextInt();
        scan.nextLine();
        
        int [][]matrix = new int[row][col];
        for (int r = 0; r < row; r++) {
            int []arr = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if (col >= 0) System.arraycopy(arr, 0, matrix[r], 0, col);
        }
        
        return matrix;
    }
}
