import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a1 = scan.nextDouble();
        double b2 = scan.nextDouble();
        double h = scan.nextDouble();

        double area = (a1+b2) * h / 2.0;
        System.out.printf("%.2f", area);
    }
}

