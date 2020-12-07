import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String location = "";
        String sleep = "";
        double price = 0;
        switch (season) {
            case "Summer":
                location = "Alaska";
                break;
            case "Winter":
                location = "Morocco";
                break;
        }
        if (budget <= 1000) {
            sleep = "Camp";
            if (season.equals("Summer")) {
                price = 0.65 * budget;
            } else {
                price = 0.45 * budget;
            }
        } else if (budget > 1000 && budget <= 3000) {
            sleep = "Hut";
            if (season.equals("Summer")) {
                price = 0.80 * budget;
            } else {
                price = 0.60 * budget;
            }
        } else if (budget > 3000) {
            sleep = "Hotel";
            price = 0.90 * budget;
        }
        System.out.printf("%s - %s - %.2f",location ,sleep , price);
    }
}
