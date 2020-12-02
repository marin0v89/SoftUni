import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int magnolies = Integer.parseInt(scan.nextLine());
        int ziumbiul = Integer.parseInt(scan.nextLine());
        int roses = Integer.parseInt(scan.nextLine());
        int cactus = Integer.parseInt(scan.nextLine());
        double priceOrder = Double.parseDouble(scan.nextLine());
        double magnoliesPrice = magnolies * 3.25;
        double ziumbiulPrice = ziumbiul * 4.0;
        double rosesPrice = roses * 3.50;
        double cactusPrice = cactus * 8.0;
        double total = magnoliesPrice + ziumbiulPrice + rosesPrice + cactusPrice;
        double taxFee = 0.05 * total;
        double totalPRice = total - taxFee;
        if (totalPRice >= priceOrder) {
            double moneyLeft = Math.floor(totalPRice - priceOrder);
            System.out.printf("She is left with %.0f leva.", moneyLeft);
        } else if (totalPRice <= priceOrder) {
            double moneyLeft = Math.ceil(priceOrder - totalPRice);
            System.out.printf("She will have to borrow %.0f leva.", moneyLeft);
        }
    }
}
