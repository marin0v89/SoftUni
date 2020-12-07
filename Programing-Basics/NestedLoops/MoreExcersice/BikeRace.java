import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //•	Първият ред – броят младши велосипедисти. Цяло число в интервала [1…100]
        //•	Вторият ред – броят старши велосипедисти. Цяло число в интервала [1… 100]
        //•	Третият ред – вид трасе – "trail", "cross-country", "downhill" или "road"
        int juniors = Integer.parseInt(scan.nextLine());
        int seniors = Integer.parseInt(scan.nextLine());
        String race = scan.nextLine();
        double juniorPrice = 0;
        double seniourPrice = 0;
        switch (race) {
            case "trail":
                juniorPrice = 5.50;
                seniourPrice = 7;
                break;
            case "cross-country":
                juniorPrice = 8;
                seniourPrice = 9.50;
                break;
            case "downhill":
                juniorPrice = 12.25;
                seniourPrice = 13.75;
                break;
            case "road":
                juniorPrice = 20;
                seniourPrice = 21.50;
                break;
        }
        int bikers = seniors + juniors;
        if (race.equals("cross-country") && bikers >= 50) {
            juniorPrice = juniorPrice - 0.25 * juniorPrice;
            seniourPrice = seniourPrice - 0.25 * seniourPrice;
        }
        double totalJuniorPrice = juniors * juniorPrice;
        double totalSeniorPRice = seniors * seniourPrice;
        double total = totalJuniorPrice + totalSeniorPRice;
        double expences = total - 0.05 * total;
        System.out.printf("%.2f", expences);
    }
}
