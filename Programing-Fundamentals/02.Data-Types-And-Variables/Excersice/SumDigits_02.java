package Excersice;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;

        while (n > 0) {
            int currentNum = 0;
            currentNum = n % 10;
            sum += currentNum;
            n /= 10;
        }
        System.out.println(sum);
    }
}
