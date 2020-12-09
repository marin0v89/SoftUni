package Excercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String numberString = scan.nextLine();

        int totalSum = 0;

        for (int i = 0; i < numberString.length(); i++) {
            int digit = Integer.parseInt("" + numberString.charAt(i));
            int currentSum = 1;
            for (int j = 1; j <= digit; j++) {
                currentSum *= j;

            }
            totalSum += currentSum;
        }
        int number = Integer.parseInt(numberString);
        if (totalSum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
