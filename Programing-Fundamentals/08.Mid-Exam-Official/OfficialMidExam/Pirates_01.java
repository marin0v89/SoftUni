package OfficialMidExam;

import java.util.Scanner;

public class Pirates_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int dailyPlunder = Integer.parseInt(scan.nextLine());
        int expectedPlunder = Integer.parseInt(scan.nextLine());

        double sum = 0;
        for (int i = 1; i <= days; i++) {
            sum += dailyPlunder;
            if (i % 3 == 0) {
                sum += dailyPlunder * 1.0 / 2;
            }
            if (i % 5 == 0) {
                sum -= sum * 0.30;
            }
        }
        if (sum >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", sum);
        } else {
            double percentage = sum / expectedPlunder * 100;
            System.out.printf("Collected only %.2f%% of the plunder.",percentage);
        }
    }
}
