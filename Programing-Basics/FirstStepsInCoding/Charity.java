import java.util.Scanner;

public class Charity {
    public static void main(String[] args) {
        //Броят на дните, в които тече кампанията – цяло число в интервала [0 … 365]
        //Броят на сладкарите – цяло число в интервала [0 … 1000]
        //Броят на тортите – цяло число в интервала [0… 2000]
        //Броят на гофретите – цяло число в интервала [0 … 2000]
        //Броят на палачинките – цяло число в интервала [0 … 2000]
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int bakers = Integer.parseInt(scan.nextLine());
        int amountCakes = Integer.parseInt(scan.nextLine());
        int amountWaffles = Integer.parseInt(scan.nextLine());//
        int amountPancakes = Integer.parseInt(scan.nextLine());
        int cake = 45;
        double waffle = 5.80;
        double pancake = 3.20;
        int priceCake = amountCakes * cake;
        double priceWaffle = amountWaffles * waffle;
        double pricePancake = amountPancakes * pancake;
        double priceForDay = (priceCake + priceWaffle + pricePancake) * bakers;
        double priceTotal = priceForDay * days;
        double price = priceTotal - (priceTotal / 8);
        System.out.printf("%.2f",price);
    }
}
