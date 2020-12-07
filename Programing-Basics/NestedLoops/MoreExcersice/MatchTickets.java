import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        //•	На първия ред е бюджетът – реално число в интервала [1 000.00 ... 1 000 000.00]
        //•	На втория ред е категорията – "VIP" или "Normal"
        //•	На третия ред е броят на хората в групата – цяло число в интервала [1 ... 200]
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String ticketCategory = scan.nextLine();
        int peopleCount = Integer.parseInt(scan.nextLine());
        double ticketPrice = 0;
        double travel = 0;
        //•	VIP – 499.99 лева.
        //•	Normal – 249.99 лева.
        switch (ticketCategory) {
            case "VIP":
                ticketPrice = 499.99;
                break;
            case "Normal":
                ticketPrice = 249.99;
                break;
        }
        double tickets = peopleCount * ticketPrice;
        //•	От 1 до 4 – 75% от бюджета.
        //•	От 5 до 9 – 60% от бюджета.
        //•	От 10 до 24 – 50% от бюджета.
        //•	От 25 до 49 – 40% от бюджета.
        //•	50 или повече – 25% от бюджета.
        if (peopleCount <= 4) {
            travel = budget - 0.75 * budget;
        } else if (peopleCount <= 9) {
            travel = budget - 0.60 * budget;
        } else if (peopleCount <= 24) {
            travel = budget - 0.50 * budget;
        } else if (peopleCount <= 49) {
            travel = budget - 0.40 * budget;
        } else if (peopleCount > 50) {
            travel = budget - 0.25 * budget;
        }
        if (travel > tickets){
            System.out.printf("Yes! You have %.2f leva left.",travel - tickets);
        }else if (travel < tickets){
            System.out.printf("Not enough money! You need %.2f leva.",tickets-travel);
        }
    }
}
