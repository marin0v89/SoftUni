package Lab;

import java.util.Scanner;

public class EvenOddSubstraction_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String []nums = scan.nextLine().split("\\s+");

        int []numbers = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numbers[i] = Integer.parseInt(nums[i]);
        }
        int evenSum = 0;
        int oddSum =0;

        for (int number : numbers) {
            if (number%2==0){
                evenSum +=number;
            }else {
                oddSum +=number;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
