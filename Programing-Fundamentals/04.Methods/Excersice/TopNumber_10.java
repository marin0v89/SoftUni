package Excersice;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        if (sumDigitDivision(n) && oddDigit(n)){
            System.out.println(sumDigitDivision(n));
        }
    }

    private static boolean sumDigitDivision(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int currentNumber = i;
            while (currentNumber > 0) {
                sum += currentNumber % 10;
                currentNumber = currentNumber / 10;
            }

            if (sum % 8 == 0) {
                result = i;
                return true;
            }
        }
        return false;
    }

    private static boolean oddDigit(int n) {
        for (int i = 1; i <= n; i++) {
            int oddDigit = 0;
            int currentNumber = i;
            while (currentNumber > 0) {
                currentNumber += currentNumber % 10;
                if (currentNumber % 2 != 0) {
                    oddDigit = i;
                    return true;
                }
                currentNumber = currentNumber / 10;
            }
        }
        return false;
    }

}
