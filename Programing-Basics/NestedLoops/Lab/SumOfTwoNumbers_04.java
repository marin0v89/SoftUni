import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int macigNumber = Integer.parseInt(scan.nextLine());

        int counter = 0;


        for (int i = start; i <= end; i++) {

            for (int j = start; j <= end; j++) {
                counter++;

                if (i + j == macigNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, macigNumber);
                    return;
                }

            }

        }

        System.out.printf("%d combinations - neither equals %d", counter, macigNumber);
    }


}

