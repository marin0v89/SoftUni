package Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        String operator = scan.nextLine();
        double b = Double.parseDouble(scan.nextLine());

        double result = mathOperation(a, operator, b);
        System.out.println(new DecimalFormat("#.####").format(result));
    }

    private static double mathOperation(double a, String operator, double b) {
        double result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }
        return result;
    }
}
