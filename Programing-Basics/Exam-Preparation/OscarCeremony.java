import java.util.Scanner;

public class OscarCeremony {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rent = Integer.parseInt(scan.nextLine());
        double priceStatues = 0.70 * rent;
        double catering = 0.85*priceStatues;
        double sound = catering / 2;
        double total = rent + priceStatues+catering+sound;
        System.out.printf("%.2f",total);

    }
}
