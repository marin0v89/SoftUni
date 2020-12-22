import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger number = new BigInteger(scan.nextLine());
        BigInteger power = new BigInteger(scan.nextLine());

        BigInteger bigNum = new BigInteger("1");
        bigNum = number.multiply(power);

        System.out.println(bigNum);
    }
}
