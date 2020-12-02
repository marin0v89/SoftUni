import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        String setSize = scan.nextLine();
        int setOrder = Integer.parseInt(scan.nextLine());
        double price = 0;
        if (setSize.equals("small")) {
            switch (fruit) {
                case "Watermelon":
                    price = 2 * 56;
                    break;
                case "Mango":
                    price = 2 * 36.66;
                    break;
                case "Pineapple":
                    price = 2 * 42.10;
                    break;
                case "Raspberry":
                    price = 2 * 20;
                    break;
            }
        } else if (setSize.equals("big")) {
            switch (fruit) {
                case "Watermelon":
                    price = 5 * 28.70;
                    break;
                case "Mango":
                    price = 5 * 19.60;
                    break;
                case "Pineapple":
                    price = 5 * 24.80;
                    break;
                case "Raspberry":
                    price = 5 * 15.20;
                    break;
            }
        }
        double total = setOrder * price;
        if (total >= 400 && total <= 1000) {
            total = total - 0.15 * total;
        } else if (total > 1000) {
            total = total - 0.50 * total;
        }
        System.out.printf("%.2f lv.", total);
    }
}
