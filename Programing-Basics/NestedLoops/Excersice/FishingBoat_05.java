import java.util.Scanner;

public class FishingBoat_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fishermans = Integer.parseInt(scan.nextLine());
        double rent = 0;
        switch (season) {
            case "Spring":
                rent = 3000;
                break;
            case "Summer":
            case "Autumn":
                rent = 4200;
                break;
            case "Winter":
                rent = 2600;
                break;
        }
        if (fishermans <= 6) {
            rent = 0.9 * rent;
        } else if (fishermans <= 11) {
            rent = 0.85 * rent;
        } else if (fishermans > 12) {
            rent = 0.75 * rent;
        }
        if (fishermans % 2 == 0 && !season.equals("Autumn")) {
            rent = rent - 0.05 * rent;
        }
        if (budget >= rent) {
            double moneyLeft = budget - rent;
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
        } else if (budget < rent) {
            double moneyNeed = rent - budget;
            System.out.printf("Not enough money! You need %.2f leva.", moneyNeed);
        }
    }
}
