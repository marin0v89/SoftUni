import java.util.Scanner;

public class ToyShop_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double excursionPrice = Double.parseDouble(scan.nextLine());
        int puzzleCount = Integer.parseInt(scan.nextLine());
        int talkingDoll = Integer.parseInt(scan.nextLine());
        int teddyBears = Integer.parseInt(scan.nextLine());
        int minionsCount = Integer.parseInt(scan.nextLine());
        int truckCount = Integer.parseInt(scan.nextLine());
        double puzzlePrice = puzzleCount * 2.60;
        int talkingDollPrice = talkingDoll * 3;
        double teddyBearPrice = teddyBears * 4.10;
        double minionPrice = minionsCount * 8.20;
        int truckPrice = truckCount * 2;
        double total = puzzlePrice + talkingDollPrice + teddyBearPrice + minionPrice + truckPrice;
        int orderToys = puzzleCount + talkingDoll + teddyBears + minionsCount + truckCount;
        if (orderToys >= 50) {
            total = 0.75 * total;
        }
        double finalPrice = 0.9 * total;
        if (finalPrice >= excursionPrice) {
            double moneyLeft = finalPrice - excursionPrice;
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else {
            double moneyNeed = excursionPrice - finalPrice;
            System.out.printf("Not enough money! %.2f lv needed.", moneyNeed);

        }
    }
}
