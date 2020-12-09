package Excersice;

import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int one = Integer.parseInt(scan.nextLine());
        int two = Integer.parseInt(scan.nextLine());
        int three = Integer.parseInt(scan.nextLine());
        int four = Integer.parseInt(scan.nextLine());

        int sum = (one + two) / three * four;

        System.out.println(sum);
    }
}
