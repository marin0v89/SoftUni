package MoreExcercise;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] data = scan.nextLine().split("\\s+");
            long leftNumber = Long.parseLong(data[0]);
            long rightNumber = Long.parseLong(data[1]);
            int leftSum = 0;
            int rightSUm = 0;

            while (leftNumber > 0) {
                long currentNumber = 0;
                currentNumber = leftNumber % 10;
                leftSum += currentNumber;
                leftNumber = leftNumber / 10;

            }
            while (rightNumber > 0) {
                long currentNumber = 0;
                currentNumber = rightNumber % 10;
                rightSUm += currentNumber;
                rightNumber = rightNumber / 10;
            }
            System.out.println(Math.max(leftSum, rightSUm));

        }
    }
}
