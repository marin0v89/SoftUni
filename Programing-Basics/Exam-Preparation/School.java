import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pens = Integer.parseInt(scan.nextLine());
        int markers = Integer.parseInt(scan.nextLine());
        Double liter = Double.parseDouble(scan.nextLine());
        int percent = Integer.parseInt(scan.nextLine());
        double pensPrice = pens * 5.80;
        double markersPrice = markers * 7.20;
        double literPrice = liter * 1.20;
        double totalPrice = pensPrice + markersPrice + literPrice;
        double discount = (totalPrice -((totalPrice * percent) /100.0));
        System.out.printf("%.3f",discount);

    }
}
