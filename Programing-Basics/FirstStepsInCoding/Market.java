import java.util.Scanner;

public class Market {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double veggiePricekilo = Double.parseDouble(scan.nextLine());
        double fruitPricekilo = Double.parseDouble(scan.nextLine());
        int veggieKilo = Integer.parseInt(scan.nextLine());
        int fruitKilo = Integer.parseInt(scan.nextLine());
        double totalVeggie = veggiePricekilo * veggieKilo;
        double totalFruit = fruitPricekilo * fruitKilo;
        double total = totalFruit + totalVeggie;
        double euroPrice = total / 1.94;
        System.out.printf("%.2f",euroPrice);

    }
}
