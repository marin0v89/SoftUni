package Lab;

import java.util.Scanner;

public class Calculation_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String function = scan.nextLine();
        int numOne = Integer.parseInt(scan.nextLine());
        int numTwo = Integer.parseInt(scan.nextLine());

        printAdd(function, numOne, numTwo);
        printSubstract(function, numOne, numTwo);
        printMultiply(function, numOne, numTwo);
        printDivide(function, numOne, numTwo);
    }

    private static void printDivide(String function, int numOne, int numTwo) {
        if ("divide".equals(function)) {
            System.out.println(numOne / numTwo);
        }
    }

    private static void printMultiply(String function, int numOne, int numTwo) {
        if ("multiply".equals(function)) {
            System.out.println(numOne * numTwo);
        }
    }

    private static void printSubstract(String function, int numOne, int numTwo) {
        if ("subtract".equals(function)) {
            System.out.println(numOne - numTwo);
        }
    }

    private static void printAdd(String function, int numOne, int numTwo) {
        if (function.equals("add")) {
            System.out.println(numOne + numTwo);
        }
    }
}
