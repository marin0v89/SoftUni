import java.util.Scanner;

public class Cinema_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movie = scan.nextLine();
        int r = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        double price = 0.0;
        switch (movie){
            case "Premiere":
                price = 12;
                break;
            case "Normal":
                price = 7.50;
                break;
            case "Discount":
                price = 5;
                break;
        }
        double total = r * c * price;
        System.out.printf("%.2f",total);
    }
}
