import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int p1Counter = 0;
        int p2Counter = 0;
        int p3Counter = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number % 2 == 0) {
                p1Counter++;
            }
            if (number % 3 == 0) {
                p2Counter++;
            }
            if (number % 4 == 0) {
                p3Counter++;
            }

        }
        double percentOne = p1Counter * 100.0 / n;
        double percentTwo = p2Counter * 100.0 / n;
        double percentThree = p3Counter * 100.0 / n;
        System.out.printf("%.2f%%%n", percentOne);
        System.out.printf("%.2f%%%n", percentTwo);
        System.out.printf("%.2f%%", percentThree);
    }
}
