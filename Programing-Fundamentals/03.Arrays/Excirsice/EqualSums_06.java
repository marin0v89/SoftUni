package Excirsice;

import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");

        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int index = 0;
        boolean flag = false;

        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }
            int rightSum = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                rightSum += numbers[j];
            }
            if (leftSum == rightSum) {
                flag = true;
                index = i;
                break;
            }
        }
        if (flag) {
            System.out.println(index);
        } else {
            System.out.println("no");
        }
    }
}
