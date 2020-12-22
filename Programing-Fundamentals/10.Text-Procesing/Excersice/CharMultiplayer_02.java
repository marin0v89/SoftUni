package Excersice;

import java.util.Scanner;

public class CharMultiplayer_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");

        int min = Math.min(input[0].length(), input[1].length());
        int max = Math.max(input[0].length(), input[1].length());

        String first = input[0];
        String second = input[1];
        int sum = 0;

        for (int i = 0; i < max; i++) {
            if (i < min) {
                sum += first.charAt(i) * second.charAt(i);
            } else if (first.length() == max) {
                sum += first.charAt(i);
            } else {
                sum += second.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
