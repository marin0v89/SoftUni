import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scan.nextLine());
        int fishMenu = Integer.parseInt(scan.nextLine());
        int veganMenu = Integer.parseInt(scan.nextLine());
        double chickenMenuPrice = 10.35;
        double fishMenuPrice = 12.40;
        double veganMenuPrice = 8.15;
        double delivery = 2.50;
        double totalChickenMenu = chickenMenu * chickenMenuPrice;
        double totalFishMenu = fishMenu * fishMenuPrice;
        double totalVeganMenu = veganMenu * veganMenuPrice;
        double total = totalChickenMenu + totalFishMenu + totalVeganMenu;
        double sweet = 0.20 * total;
        double totalTotal = total + sweet + delivery;
        System.out.printf("Total: %.2f", totalTotal);

    }
}
