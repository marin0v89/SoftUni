import java.util.Scanner;

public class BoozeStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceWhiskey = Double.parseDouble(scan.nextLine());
        double amountBeer = Double.parseDouble(scan.nextLine());
        double amountWhine = Double.parseDouble(scan.nextLine());
        double amountRakia = Double.parseDouble(scan.nextLine());
        double amountWhiskey = Double.parseDouble(scan.nextLine());
        double priceRakia = priceWhiskey / 2;
        double priceWhine = 0.6 * priceRakia;
        double priceBeer = 0.2 * priceRakia;
        double totalWhiskey = priceWhiskey * amountWhiskey;
        double totalBeer = amountBeer * priceBeer;
        double totalWhine = amountWhine * priceWhine;
        double totalRakia = amountRakia * priceRakia;
        double total = totalWhiskey + totalBeer + totalWhine + totalRakia;
        System.out.printf("%.2f",total);

    }
}
