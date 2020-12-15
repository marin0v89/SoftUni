import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger numberOne = scan.nextBigInteger();
        BigInteger numberTwo = scan.nextBigInteger();

        BigInteger sum = numberOne.add(numberTwo);

        System.out.println(sum);
    }
}
