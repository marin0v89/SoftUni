import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String season = scan.nextLine();
        double km = Double.parseDouble(scan.nextLine());
        double price = 0;
        if (km <= 5000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    price = 0.75;
                    break;
                case "Summer":
                    price = 0.90;
                    break;
                case "Winter":
                    price = 1.05;
                    break;
            }
        } else if (km > 5000 && km <= 10000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    price = 0.95;
                    break;
                case "Summer":
                    price = 1.10;
                    break;
                case "Winter":
                    price = 1.25;
                    break;
            }
        } else if (km > 10000 && km <= 20000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                case "Summer":
                case "Winter":
                    price = 1.45;
                    break;
            }
        }
        double priceKM = km * price;
        double seasonPrice = priceKM * 4;
        double salary = 0.90 * seasonPrice;
        System.out.printf("%.2f", salary);

    }
}
