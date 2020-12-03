import java.util.Scanner;

public class Histogram_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (num < 200) {
                p1++;
            }
            if (num >= 200 && num <= 399) {
                p2++;
            }
            if (num >= 400 && num <= 599) {
                p3++;
            }
            if (num >= 600 & num <= 799) {
                p4++;
            }
            if (num >= 800) {
                p5++;
            }

        }
        double percentOne = p1 / n * 100.0;
        double percentTwo = p2 / n * 100.0;
        double percentThree = p3 / n * 100.0;
        double percentFour = p4 / n * 100.0;
        double percentFive = p5 / n * 100.0;
        System.out.printf("%.2f%%%n",percentOne);
        System.out.printf("%.2f%%%n",percentTwo);
        System.out.printf("%.2f%%%n",percentThree);
        System.out.printf("%.2f%%%n",percentFour);
        System.out.printf("%.2f%%%n",percentFive);
    }
}
