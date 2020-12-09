package Excirsice;

import java.util.Scanner;

public class ZigZagArray_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String[] arrOne = new String[n];
        String[] arrTwo = new String[n];

        for (int i = 1; i <= n; i++) {
            String[] parts = scan.nextLine().split("\\s+");
            if (i % 2 == 0) {
                arrOne[i - 1] = parts[0];
                arrTwo[i - 1] = parts[1];
            } else {
                arrOne[i - 1] = parts[1];
                arrTwo[i - 1] = parts[0];
            }
        }
        for (String two : arrTwo) {
            System.out.print(two + " ");
        }
        System.out.println();
        for (String one : arrOne) {
            System.out.print(one + " ");
        }
    }
}
