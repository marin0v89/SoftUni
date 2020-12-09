package Excirsice;

import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String []input = scan.nextLine().split("\\s+");
        int sumRequired = Integer.parseInt(scan.nextLine());

        int []numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            int []magicSum = new int[2];
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]+numbers[j]==sumRequired){
                    magicSum[0] = numbers[i];
                    magicSum[1] = numbers[j];
                    for (int i1 : magicSum) {
                        System.out.print(i1+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
