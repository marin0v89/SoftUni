import java.util.Scanner;

public class Greening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double squareMeter = Double.parseDouble(scan.nextLine());
        double price = squareMeter * 7.61;
        double discount = price * 0.18;
        double endprice = price - discount;
        System.out.printf("The final price is: %.2f lv." ,endprice);
        System.out.println();
        System.out.printf("The discount is: %.2f lv." ,discount);
    }
}