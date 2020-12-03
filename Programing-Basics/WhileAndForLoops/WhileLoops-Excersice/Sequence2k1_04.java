import java.util.Scanner;

public class Sequence2k1_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 1;
        while (sum<=n) {
            System.out.println(sum);
            sum = sum * 2 + 1;

        }

    }
}
