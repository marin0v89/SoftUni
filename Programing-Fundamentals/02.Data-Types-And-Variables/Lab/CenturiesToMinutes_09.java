package Lab;

import java.util.Scanner;

public class CenturiesToMinutes_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int years = n * 100;
        long days = (long) (years * 365.2422);
        long hours = days * 24;
        long minutes = hours * 60;

        System.out.printf
                ("%d centuries = %d years = %d days = %d hours = %d minutes", n, years, days, hours, minutes);
    }
}
