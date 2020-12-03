import java.util.Scanner;

public class DevideWithoutRemainder_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        for (int i = 0; i < n; i++) {
            double number = Double.parseDouble(scan.nextLine());
            if (number % 2 == 0) {
                p1 += 1;
            }
            if (number % 3 == 0) {
                p2 += 1;
            }
            if (number % 4 == 0) {
                p3 += 1;
            }

        }
        double percentOne = p1 / n * 100;
        double percentTwo = p2 / n * 100;
        double percentThree = p3 / n * 100;
        System.out.printf("%.2f%%%n",percentOne);
        System.out.printf("%.2f%%%n",percentTwo);
        System.out.printf("%.2f%%%n",percentThree);
    }
}
