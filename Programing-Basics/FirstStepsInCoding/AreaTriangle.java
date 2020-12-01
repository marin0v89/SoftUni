import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double h = scan.nextDouble();

        double area = (a*h) / 2.0;
        System.out.printf("%.2f",area);
    }
}
