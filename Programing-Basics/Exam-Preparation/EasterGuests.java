import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guests = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
        double sweetBreads = Math.ceil(guests / 3.0); //броя козунаци
        int eggs = guests * 2;  //броя яйца
        double swtBreadsPrice = sweetBreads * 4;
        double eggPrice = eggs * 0.45;
        double total = swtBreadsPrice + eggPrice;
        if (budget >= total) {
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.%n", sweetBreads, eggs);
            System.out.printf("He has %.2f lv. left.", budget - total);
        } else if (total > budget) {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", total - budget);
        }
    }
}
