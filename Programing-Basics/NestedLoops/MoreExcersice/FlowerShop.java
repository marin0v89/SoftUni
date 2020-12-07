import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        //•	На първия ред е броят на закупените хризантеми – цяло число в интервала [0 ... 200]
        //•	На втория ред е броят на закупените рози – цяло число в интервала [0 ... 200]
        //•	На третия ред е броят на закупените лалета – цяло число в интервала [0 ... 200]
        //•	На четвъртия ред е посочен сезона – [Spring, Summer, Аutumn, Winter]
        //•	На петия ред е посочено дали денят е празник – [Y – да / N - не]
        Scanner scan = new Scanner(System.in);
        int hrizantemaBought = Integer.parseInt(scan.nextLine());
        int rosesBought = Integer.parseInt(scan.nextLine());
        int tulipsBought = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        String holyday = scan.nextLine();
        double hrizantemaPrice = 0;
        double rosesPrice = 0;
        double tulipPrice = 0;
        switch (season) {
            case "Spring":
            case "Summer":
                hrizantemaPrice = 2;
                rosesPrice = 4.10;
                tulipPrice = 2.50;
                break;
            case "Autumn":
            case "Winter":
                hrizantemaPrice = 3.75;
                rosesPrice = 4.50;
                tulipPrice = 4.15;
        }
        //В празнични дни цените на всички цветя се увеличават с 15%. Предлагат се следните отстъпки:
        //•	За закупени повече от 7 лалета през пролетта – 5% от цената на целият букет.
        //•	За закупени 10 или повече рози през зимата – 10% от цената на целият букет.
        //•	За закупени повече от 20 цветя общо през всички сезони – 20% от цената на целият букет.
        if (holyday.equals("Y")) {
            hrizantemaPrice = hrizantemaPrice + 0.15 * hrizantemaPrice;
            rosesPrice = rosesPrice + 0.15 * rosesPrice;
            tulipPrice = tulipPrice + 0.15 * tulipPrice;
        }
        double totalHrizantema = hrizantemaBought * hrizantemaPrice;
        double totalRoses = rosesBought * rosesPrice;
        double totalTulip = tulipsBought * tulipPrice;
        double bouket = totalHrizantema + totalRoses + totalTulip;
        double totalFlowers = hrizantemaBought + rosesBought + tulipsBought;
        if (tulipsBought > 7 && season.equals("Spring")) {
            bouket = bouket - 0.05 * bouket;
        } else if (rosesBought >= 10 && season.equals("Winter")) {
            bouket = bouket - 0.10 * bouket;
        }
        if (totalFlowers > 20) {
            bouket = bouket - 0.20 * bouket;
        }
        double arrangement = bouket + 2;
        System.out.printf("%.2f", arrangement);
    }
}
