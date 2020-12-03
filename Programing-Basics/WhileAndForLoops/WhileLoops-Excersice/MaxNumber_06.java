import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int max = Integer.MIN_VALUE;
        int start = 1;
        while (start <=n){
            int number = Integer.parseInt(scan.nextLine());
            if (number > max){
                max = number;
            }
            start ++;
        }
        System.out.println(max);
    }
}
