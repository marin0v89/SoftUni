import java.util.Scanner;

public class OperationsBetweenNumbers_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        char symbol = scan.nextLine().charAt(0);
        double result = 0;
        //„+“, „-“, „*“, „/“, „%“
        switch (symbol) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                result = 1.0 * n1 / n2;
                break;
            case '%':
                result = 1.0 * n1 % n2;
                break;
        }
        switch (symbol) {
            case '+':
            case '-':
            case '*':
                if (1.0 * result % 2 == 0) {
                    System.out.printf("%d %c %d = %.0f - even", n1, symbol, n2, result);
                } else {
                    System.out.printf("%d %c %d = %.0f - odd", n1, symbol, n2, result);
                }
                break;
            case '/':
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    System.out.printf("%d %c %d = %.2f", n1, symbol, n2, result);
                }
                break;
            case '%':
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    System.out.printf("%d %c %d = %.0f", n1, symbol, n2, result);
                }
        }
    }
}
