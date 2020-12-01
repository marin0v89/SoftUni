import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());
        double liters = length * width * height / 1000.0;
        double stuff = liters * percent / 100;
        double total = liters - stuff;
        System.out.printf("%.3f",total);


    }
}
