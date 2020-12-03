import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (i % 2 == 0) {
                evenSum += number;
            }else {
                oddSum +=number;
            }
        }
        if (evenSum == oddSum){
            System.out.println("Yes");
            System.out.println("Sum = " + evenSum);
        }else{
            int diff = Math.abs(evenSum-oddSum);
            System.out.println("No");
            System.out.println("Diff = "+diff);
        }
    }
}
