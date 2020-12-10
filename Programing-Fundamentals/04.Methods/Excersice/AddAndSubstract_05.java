package Excersice;

import java.util.Scanner;


public class AddAndSubstract_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        int finalResult = subtractMethod(a, b, c);
        System.out.println(finalResult);
    }

    private static int sumMethod(int a, int b) {
        return a + b;
    }

    private static int subtractMethod(int a, int b, int c) {
        return sumMethod(a, b) - c;
    }

}
