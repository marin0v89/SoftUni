import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int min = Integer.MAX_VALUE;
        int start = 1;
        while (start<=n){
            int number = Integer.parseInt(scan.nextLine());
            if (number < min){
                min = number;
            }
            start++;
        }
        System.out.println(min);
    }
}
