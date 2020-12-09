package Lab;

import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pounds = Double.parseDouble(scan.nextLine());

        double toDollars = pounds*1.0*1.31;

        System.out.printf("%.3f",toDollars);
    }
}
