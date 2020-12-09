package Lab;

import java.util.Scanner;

public class MultiplicationTableAdvanced_11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int times = Integer.parseInt(scan.nextLine());

        do {
            System.out.printf("%d X %d = %d%n",number,times ,number * times);
            times ++;

        }while (times <=10);

    }
}
