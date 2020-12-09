package Lab;

import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String []numbers = scan.nextLine().split("\\s+");

        int []intArray = new int[numbers.length];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(numbers[i]);
        }
        int sum = 0;
        for (int i : intArray) {
            if (i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
