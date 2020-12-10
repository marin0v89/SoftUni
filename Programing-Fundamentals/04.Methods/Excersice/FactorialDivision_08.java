package Excersice;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = factorial(scan);
        double b = factorial(scan);
        double result = a / b;
        System.out.printf("%.2f",result);
    }

    private static double factorial(Scanner scan) {
        double number = Double.parseDouble(scan.nextLine());
        double result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

}
