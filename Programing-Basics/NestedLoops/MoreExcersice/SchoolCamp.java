import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        //1.	Сезонът – текст - “Winter”, “Spring” или “Summer”;
        //2.	Видът на групата – текст - “boys”, “girls” или “mixed”;
        //3.	Брой на учениците – цяло число в интервала [1 … 10000];
        //4.	Брой на нощувките – цяло число в интервала [1 … 100].
        Scanner scan = new Scanner(System.in);
        String season = scan.nextLine();
        String kids = scan.nextLine();
        int students = Integer.parseInt(scan.nextLine());
        int sleeps = Integer.parseInt(scan.nextLine());
        double pricePerNight = 0;
        String sport = "";
        if (kids.equals("boys") || kids.equals("girls")) {
            switch (season) {
                case "Winter":
                    pricePerNight = 9.60;
                    break;
                case "Spring":
                    pricePerNight = 7.20;
                    break;
                case "Summer":
                    pricePerNight = 15;
                    break;
            }
        } else if (kids.equals("mixed")) {
            switch (season) {
                case "Winter":
                    pricePerNight = 10;
                    break;
                case "Spring":
                    pricePerNight = 9.50;
                    break;
                case "Summer":
                    pricePerNight = 20;
                    break;
            }
        }
        double totalPrice = students * sleeps * pricePerNight;
        if (students >= 50) {
            totalPrice = totalPrice - 0.50 * totalPrice;
        } else if (students >= 20 && students < 50) {
            totalPrice = totalPrice - 0.15 * totalPrice;
        } else if (students >= 10 && students < 20) {
            totalPrice = totalPrice - 0.05 * totalPrice;
        }
        switch (kids) {
            case "girls":
                switch (season) {
                    case "Winter":
                        sport = "Gymnastics";
                        break;
                    case "Spring":
                        sport = "Athletics";
                        break;
                    case "Summer":
                        sport = "Volleyball";
                        break;
                }
                break;
            case "boys":
                switch (season) {
                    case "Winter":
                        sport = "Judo";
                        break;
                    case "Spring":
                        sport = "Tennis";
                        break;
                    case "Summer":
                        sport = "Football";
                        break;
                }
                break;
            case "mixed":
                switch (season) {
                    case "Winter":
                        sport = "Ski";
                        break;
                    case "Spring":
                        sport = "Cycling";
                        break;
                    case "Summer":
                        sport = "Swimming";
                        break;
                }
                break;

        }
        System.out.printf("%s %.2f lv.", sport, totalPrice);
    }
}
