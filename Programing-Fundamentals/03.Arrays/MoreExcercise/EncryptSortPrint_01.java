package MoreExcercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortPrint_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n = Integer.parseInt(scan.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            String sequence = scan.nextLine();
            for (int j = 0; j < sequence.length(); j++) {
                char ch = sequence.charAt(j);
                char consonant = sequence.charAt(j);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    sum += (int) ch * sequence.length();
                } else  {
                    sum += (int) consonant / sequence.length();
                }
                numbers[i] = sum;

            }
        }
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
