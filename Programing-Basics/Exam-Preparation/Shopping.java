import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int videoCards = Integer.parseInt(scan.nextLine());
        int processors = Integer.parseInt(scan.nextLine());
        int ram = Integer.parseInt(scan.nextLine());
        int videocardPrice = videoCards * 250;
        double processorPrice = 0.35 * videocardPrice;
        double ramPrice = 0.10 * videocardPrice;
        double totalprocPrice = processors * processorPrice;
        double totalRam = ram * ramPrice;
        double total = videocardPrice + totalprocPrice + totalRam;
        if (videoCards > processors) {
            total = total - 0.15 * total;
        }
        if (budget >= total) {
            System.out.printf("You have %.2f leva left!", budget - total);
        } else if (budget < total) {
            System.out.printf("Not enough money! You need %.2f leva more!", total - budget);
        }
    }
}
