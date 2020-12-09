package Lab;

import java.util.Scanner;

public class SpecialNumbers_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <=n ; i++) {
            int currentNum = i;
            int sum = 0;
            while (currentNum>0){
                sum += currentNum %10;
                currentNum /=10;
            }
            boolean isSpecial = (sum ==5) || (sum == 7) || (sum == 11);
            if (isSpecial) {
                System.out.println(i + " -> " + "True");
            } else {
                System.out.println(i + " -> " + "False");
            }
        }
    }
}
