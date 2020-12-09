package Lab;

import java.util.Scanner;

public class MeteresToKm_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int meters = Integer.parseInt(scan.nextLine());

        double mToKm = meters * 1.0 / 1000;

        System.out.printf("%.2f",mToKm);
    }
}
