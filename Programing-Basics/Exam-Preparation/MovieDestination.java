import java.util.Scanner;

public class MovieDestination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1.	Бюджет на филма – реално число в диапазона [100 000.0… 2 000 000.0]
        //2.	Дестинация – текст, с възможности "Dubai", "Sofia" и "London"
        //3.	Сезон – текст, с възможности "Summer" и "Winter"
        //4.	Брой дни  – цяло число в диапазона [1… 40]
        double budget = Double.parseDouble(scan.nextLine());
        String destination = scan.nextLine();
        String season = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());
        double price = 0;
        if (season.equals("Winter")) {
            switch (destination) {
                case "Dubai":
                    price = 45000;
                    break;
                case "Sofia":
                    price = 17000;
                    break;
                case "London":
                    price = 24000;
                    break;
            }
        } else if (season.equals("Summer")) {
            switch (destination) {
                case "Dubai":
                    price = 40000;
                    break;
                case "Sofia":
                    price = 12500;
                    break;
                case "London":
                    price = 20250;
                    break;
            }
        }
        double total = days * price;
        if (destination.equals("Dubai")) {
            total = total - 0.30 * total;
        }
        if (destination.equals("Sofia")) {
            total = total + 0.25 * total;
        }
        if (budget >= total) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - total);
        } else {
            System.out.printf("The director needs %.2f leva more!", total - budget);
        }
    }
}
