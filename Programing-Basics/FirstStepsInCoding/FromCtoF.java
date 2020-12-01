import java.util.Scanner;

public class FromCtoF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double celsius = Double.parseDouble(scan.nextLine());
        double farenheit = ((celsius) *  1.8) + 32;
        System.out.printf("%.2f" ,farenheit);
    }
}
