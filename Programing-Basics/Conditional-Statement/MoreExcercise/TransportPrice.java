import javax.swing.*;
import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String dayNight = scan.nextLine();
        double taxiDayPrice = 0.70 + (n * 0.79);
        double taxiNightPRice = 0.70 + (n * 0.90);
        double bussPrice = n * 0.09;
        double trainPrice = n * 0.06;
        if (n <= 20 && dayNight.equals("day"))
            System.out.printf("%.2f", taxiDayPrice);

        else if (n <= 20 && dayNight.equals("night"))
            System.out.printf("%.2f", taxiNightPRice);

        if (n >= 20 && n <= 100 && dayNight.equals("day"))
            System.out.printf("%.2f", bussPrice);
        else if (n >= 20 && n <= 100 && dayNight.equals("night"))
            System.out.printf("%.2f", bussPrice);
        if (n >= 100 && dayNight.equals("day"))

            System.out.printf("%.2f", trainPrice);
        else if (n >= 100 && dayNight.equals("night"))
            System.out.printf("%.2f", trainPrice);
    }
}
