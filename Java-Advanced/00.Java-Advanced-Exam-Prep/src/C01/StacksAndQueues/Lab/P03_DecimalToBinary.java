package C01.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03_DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        ArrayDeque<Integer> number = new ArrayDeque<>();
        if (n == 0) {
            System.out.println(n);
        } else {
            while (n > 0) {
                number.push(n % 2);
                n = n / 2;
            }
        }
        for (Integer integer : number) {
            System.out.print(integer);
        }
    }
}
