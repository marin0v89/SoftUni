import javax.swing.*;
import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int seriesCnt = Integer.parseInt(scan.nextLine());
        double total = 0;
        for (int i = 1; i <= seriesCnt; i++) {
            String name = scan.nextLine();
            double price = Double.parseDouble(scan.nextLine());
            switch (name) {
                case "Thrones":
                    price= price - 0.5 * price;
                    break;
                case "Lucifer":
                    price = price - 0.4 * price;
                    break;
                case "Protector":
                    price = price - 0.3 * price;
                    break;
                case "TotalDrama":
                    price = price - 0.2 * price;
                    break;
                case "Area":
                    price = price - 0.1 * price;
                    break;
                default:
                    break;

            }
            total += price;
        }
        if (budget >= total){
            System.out.printf("You bought all the series and left with %.2f lv.",budget - total);
        }else{
            System.out.printf("You need %.2f lv. more to buy the series!",total - budget);
        }

    }
}
