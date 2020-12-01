import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ExamChange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bitcoin = Integer.parseInt(scan.nextLine());
        Double chYn = Double.parseDouble(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());
        int bitcoinPrice = bitcoin * 1168;
        double ynDollar = chYn * 0.15;
        double dollarLev = ynDollar * 1.76;
        double bitLev = (bitcoinPrice + dollarLev) / 1.95;
        double discount = bitLev * percent /100.0;
        double result = bitLev - discount;
        System.out.printf("%.2f",result);

    }
}
