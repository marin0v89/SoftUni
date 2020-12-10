package Lab;

import java.util.Scanner;

public class MultiplyEvenByOdds_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int result = evenAndOdd(Math.abs(n));
        System.out.println(result);
    }

    private static int evenAndOdd(int n) {
        int evenSum = 0;
        int oddSum = 0;
        while (n > 0) {
            int currentNumber = 0;
            currentNumber = n % 10;
            if (currentNumber % 2 == 0) {
                evenSum += currentNumber;
            }else{
                oddSum+=currentNumber;
            }
            n = n/10;
        }
        return evenSum*oddSum;
    }
}
