package Lab;

import java.util.Scanner;

public class PrintTriangle_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        printTriangle(n);
    }
    private static void printTriangle(int maxLineNumber){
        printTopHalf(maxLineNumber);
        printBottomHalf(maxLineNumber-1);
    }

    private static void printBottomHalf(int longestLine) {
        for (int i = longestLine; i >=1 ; i--) {
            printRow(1,i);
            System.out.println();
        }
    }

    private static void printTopHalf(int numberOfRows) {
        for (int i = 1; i <= numberOfRows; i++) {
            printRow(1,i);
            System.out.println();
        }
    }

    private static void printRow(int from, int to) {
        for (int i = from; i <=to ; i++) {
            System.out.print(i+" ");
        }
    }
}
