package Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        double power = Double.parseDouble(scan.nextLine());

        double result = mathPower(number,power);
        System.out.println(new DecimalFormat("#.####").format(result));
    }

    private static double mathPower(double number, double power) {
        return Math.pow(number,power);
    }
}
