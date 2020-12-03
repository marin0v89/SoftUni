import java.util.Scanner;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }

        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}
