import java.util.Scanner;

public class OddEvenePosition_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = Double.parseDouble(scan.nextLine());
        double oddSum = 0;
        double evenSum = 0;
        double oddMax = Double.MIN_VALUE;
        double evenMax = Double.MIN_VALUE;
        double oddMin = Double.MAX_VALUE;
        double evenMin = Double.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scan.nextLine());
            if (i % 2 == 0) {
                if (num > evenMax) {
                    evenMax = num;
                }
                if (num < evenMin) {
                    evenMin = num;
                }
                evenSum += num;
            } else {
                if (num > oddMax) {
                    oddMax = num;
                }
                if (num < oddMin) {
                    oddMin = num;
                }
                oddSum += num;
            }

        }
        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (oddMin == Double.MAX_VALUE) {
            System.out.println("OddMin=No");
        } else {
            System.out.printf("OddMin=%.2f,%n", oddMin);
        }
        if (oddMax == Double.MIN_VALUE) {
            System.out.println("OddMax=No");
        } else {
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (evenMin == Double.MAX_VALUE) {
            System.out.println("EvenMin=No");
        } else {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
        }
        if (evenMax == Double.MIN_VALUE) {
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=%.2f%n", evenMax);
        }
    }
}
