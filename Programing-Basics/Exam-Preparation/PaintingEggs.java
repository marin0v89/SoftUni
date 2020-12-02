import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String size = scan.nextLine();
        String color = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());
        double price = 0;
        if ("Red".equals(color)) {
            switch (size) {
                case "Large":
                    price = 16;
                    break;
                case "Medium":
                    price = 13;
                    break;
                case "Small":
                    price = 9;
                    break;
            }
        } else if (color.equals("Green")) {
            switch (size) {
                case "Large":
                    price = 12;
                    break;
                case "Medium":
                    price = 9;
                    break;
                case "Small":
                    price = 8;
                    break;
            }
        } else if (color.equals("Yellow")) {
            switch (size) {
                case "Large":
                    price = 9;
                    break;
                case "Medium":
                    price = 7;
                    break;
                case "Small":
                    price = 5;
                    break;
            }
        }
        double total = count * price;
        double expences = total - 0.35 * total;
        System.out.printf("%.2f leva.", expences);
    }
}
