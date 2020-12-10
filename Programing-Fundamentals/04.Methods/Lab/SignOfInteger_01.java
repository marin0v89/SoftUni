package Lab;

import java.util.Scanner;

public class SignOfInteger_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        printSign(n);
    }

    private static void printSign(int n) {
        if (n>0){
            System.out.printf("The number %d is positive.%n",n);
        }else if (n<0){
            System.out.printf("The number %d is negative.%n",n);
        }else {
            System.out.printf("The number %d is zero.%n",n);
        }
    }
}
