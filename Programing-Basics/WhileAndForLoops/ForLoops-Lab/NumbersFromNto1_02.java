import java.util.Scanner;

public class NumbersFromNto1_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = n; i >=1 ; i--) {
            System.out.println(i);

        }
    }
}
