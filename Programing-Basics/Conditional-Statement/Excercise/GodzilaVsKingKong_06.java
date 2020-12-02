import java.util.Scanner;

public class GodzilaVsKingKong_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double filmBudget = Double.parseDouble(scan.nextLine());
        int statist = Integer.parseInt(scan.nextLine());
        double clothPrice = Double.parseDouble(scan.nextLine());
        double decour = 0.10 * filmBudget;
        if (statist > 150)
            clothPrice = 0.90 * clothPrice;
        double clothingPrice = statist * clothPrice;
        double total = decour + clothingPrice;
        if (total > filmBudget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", total - filmBudget);
        } else if (filmBudget >= total) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", filmBudget - total);
        }
    }
}
