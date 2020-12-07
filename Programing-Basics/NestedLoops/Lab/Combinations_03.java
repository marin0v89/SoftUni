import java.util.Scanner;

public class Combinations_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int counter = 0;

        for (int numberOne = 0; numberOne <=n; numberOne++) {
            for (int numberTwo = 0; numberTwo <=n ; numberTwo++) {
                for (int numerThree = 0; numerThree <=n ; numerThree++) {
                 if (numberOne + numberTwo + numerThree == n){
                     counter++;
                 }
                }
            }
        }
        System.out.println(counter);
    }
}
