import java.util.Scanner;

public class WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stage = scan.nextLine();
        String ticket = scan.nextLine();
        int ticketCount = Integer.parseInt(scan.nextLine());
        char picture = scan.nextLine().charAt(0);
        double price = 0;
        double picturePrice = 0;
        if (ticket.equals("Standard")) {
            switch (stage) {
                case "Quarter final":
                    price = 55.50;
                    break;
                case "Semi Final":
                    price = 75.88;
                    break;
                case "Final":
                    price = 110.10;
                    break;
            }
        } else if (ticket.equals("Premium")) {
            switch (stage) {
                case "Quarter final":
                    price = 105.20;
                    break;
                case "Semi Final":
                    price = 125.22;
                    break;
                case "Final":
                    price = 160.66;
                    break;
            }
        } else if (ticket.equals("VIP")) {
            switch (stage) {
                case "Quarter final":
                    price = 118.90;
                    break;
                case "Semi Final":
                    price = 300.40;
                    break;
                case "Final":
                    price = 400;
                    break;
            }
        }

        double total = ticketCount * price;
        if (total > 4000) {
            total = total - 0.25 * total;
            System.out.printf("%.2f", total);
        } else if (total > 2500) {
            total = total - 0.10 * total;
            if (picture == 'Y') {
                picturePrice = ticketCount * 40;
                total += picturePrice;
                System.out.printf("%.2f", total);
            } else {
                System.out.printf("%.2f", total);

            }
        } else {
            if (picture == 'Y') {
                picturePrice = ticketCount* 40;
                total += picturePrice;
                System.out.printf("%.2f", total);
            } else {
                System.out.printf("%.2f", total);
            }
        }

    }
}
