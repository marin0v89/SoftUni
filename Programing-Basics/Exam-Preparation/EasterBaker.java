import java.util.Scanner;

public class EasterBaker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double flourPrice = Double.parseDouble(scan.nextLine()); //вход цена брашно
        double kiloFlour = Double.parseDouble(scan.nextLine()); //вход килограми за брашно
        double kiloSugar = Double.parseDouble(scan.nextLine()); //вход килограми за захар
        int eggCards = Integer.parseInt(scan.nextLine()); //вход кори за яйца
        int east = Integer.parseInt(scan.nextLine()); // вход за мая
        double priceSugar = flourPrice * 0.75;  //цена за захар
        double priceEggs = flourPrice * 1.10;   //цена за яйца
        double priceEast = priceSugar * 0.20;   //цена за мая
        double totalFlourPrice = flourPrice * kiloFlour;
        double totalSugarPrice = kiloSugar * priceSugar;
        double totalEggPrice = eggCards * priceEggs;
        double totalEastPrice = east * priceEast;
        double total = totalFlourPrice + totalSugarPrice + totalEggPrice + totalEastPrice;
        System.out.printf("%.2f", total);

    }
}
