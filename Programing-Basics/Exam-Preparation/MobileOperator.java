import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String duration = scan.nextLine();
        String type = scan.nextLine();
        String mobileInternet = scan.nextLine();
        int months = Integer.parseInt(scan.nextLine());
        double price = 0;
        switch (duration) {
            case "one":
                switch (type) {
                    case "Small":
                        price = 9.98;
                        break;
                    case "Middle":
                        price = 18.99;
                        break;
                    case "Large":
                        price = 25.98;
                        break;
                    case "ExtraLarge":
                        price = 35.99;
                        break;
                }
                break;
            case "two":
                switch (type) {
                    case "Small":
                        price = 8.58;
                        break;
                    case "Middle":
                        price = 17.09;
                        break;
                    case "Large":
                        price = 23.59;
                        break;
                    case "ExtraLarge":
                        price = 31.79;
                        break;
                }
                break;
        }
        //при добавен мобилен интернет, към таксата за един месец се добавя:
        //при такса по-малка или равна на 10.00 лв.  5.50 лв.
        //при такса по-малка или равна на 30.00 лв.  4.35 лв.
        //при такса по-голяма от 30.00 лв.  3.85 лв.
        //ако договорът e за две години, общата сума се намалява с 3.75%
        if (mobileInternet.equals("yes")) {
            if (price <= 10) {
                price = price + 5.50;
            } else if (price <= 30) {
                price = price + 4.35;
            } else if (price > 30) {
                price = price + 3.85;
            }
        }
        double total = months * price;
        if (duration.equals("two")) {
            total = total - 0.0375 * total;
        }

        System.out.printf("%.2f lv.", total);
    }
}
