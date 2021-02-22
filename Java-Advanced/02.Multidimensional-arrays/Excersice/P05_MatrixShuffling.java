package C02.MultidimensionalArrays.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        scan.nextLine();

        String[][] matrix = new String[rows][];
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scan.nextLine().split("\\s+");
        }

        String pattern = "^swap (\\d+) (\\d+) (\\d+) (\\d+)$";
        Pattern patternCompile = Pattern.compile(pattern);

        String input = scan.nextLine();
        while (!"END".equals(input)) {
            boolean isValid = true;
            Matcher matcher = patternCompile.matcher(input);
            if (matcher.matches()) {
                int rowOne = Integer.parseInt(matcher.group(1));
                int colOne = Integer.parseInt(matcher.group(2));
                int rowTwo = Integer.parseInt(matcher.group(3));
                int colTwo = Integer.parseInt(matcher.group(4));
                boolean isInArray = rowOne >= 0 && rowOne < rows && rowTwo >= 0 && rowTwo < rows
                        && colOne >= 0 && colOne < cols && colTwo >= 0 && colTwo < cols;
                if (isInArray) {
                    String temp = matrix[rowOne][colOne];
                    matrix[rowOne][colOne] = matrix[rowTwo][colTwo];
                    matrix[rowTwo][colTwo] = temp;
                    printMatrix(matrix);
                } else {
                    isValid = false;
                }
            } else {
                isValid = false;
            }
            if (!isValid) {
                System.out.println("Invalid input!");
            }
            input = scan.nextLine();
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.printf("%s ",string);
            }
            System.out.println();
        }
    }
}
