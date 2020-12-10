package Excersice;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int one = Integer.parseInt(scan.nextLine());
        int two = Integer.parseInt(scan.nextLine());
        int three = Integer.parseInt(scan.nextLine());
        int result = smallestOne(one, two, three);
        System.out.println(result);
    }

    private static int smallestOne(int one, int two, int three) {
        if (one < two) {
            return one;
        } else if (two < three) {
            return two;
        }
        return three;
    }
}
