package Excersice;

import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int row = 0; row <n ; row++) {
            for (int i = 0; i <n ; i++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
