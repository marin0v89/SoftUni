import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = Double.parseDouble(scan.nextLine());
        double area = r * r * Math.PI;
        double perimeter = 2 * Math.PI * r;
        System.out.printf("%.2f",area);
        System.out.println();
        System.out.printf("%.2f",perimeter);
    }
}
