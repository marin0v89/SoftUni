import java.util.Scanner;

public class NewHome_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String flowerType = scan.nextLine();
        int flowerCount = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
        double flowerPrice = 0.0;
        switch (flowerType) {
            case "Roses":
                flowerPrice = 5;
                break;
            case "Dahlias":
                flowerPrice = 3.80;
                break;
            case "Tulips":
                flowerPrice = 2.80;
                break;
            case "Narcissus":
                flowerPrice = 3;
                break;
            case "Gladiolus":
                flowerPrice = 2.50;
                break;
        }
        double total = flowerCount * flowerPrice;
        if (flowerType.equals("Roses") && flowerCount > 80) {
            total = total - 0.10 * total;
        } else if (flowerType.equals("Dahlias") && flowerCount > 90) {
            total = total - 0.15 * total;
        } else if (flowerType.equals("Tulips") && flowerCount > 80) {
            total = total - 0.15 * total;
        } else if (flowerType.equals("Narcissus") && flowerCount < 120) {
            total = total + 0.15 * total;
        } else if (flowerType.equals("Gladiolus") && flowerCount < 80) {
            total = total + 0.20 * total;
        }
        if (budget < total) {
            double moneyNeed = total - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", moneyNeed);
        } else if (budget >= total) {
            double moneyLeft = budget - total;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, moneyLeft);
        }
    }
}
