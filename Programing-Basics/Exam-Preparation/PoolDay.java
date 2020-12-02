import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int visitors = Integer.parseInt(scan.nextLine());
        double tax = Double.parseDouble(scan.nextLine());
        double chairPrice = Double.parseDouble(scan.nextLine());
        double umbrelaPrice = Double.parseDouble(scan.nextLine());
        double totalTaxAll = visitors * tax;
        double peopleWithountChairs = Math.ceil(0.75 * (visitors * 1.0));
        double totalChairPrice = peopleWithountChairs * chairPrice;
        double umbrelas = Math.ceil((visitors * 1.0) / 2);
        double totalUmbrelaPRice = umbrelas * umbrelaPrice;
        double total = (totalTaxAll + totalChairPrice + totalUmbrelaPRice);
        System.out.printf("%.2f lv.", total);
    }
}
