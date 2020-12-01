import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
        double length = Math.abs(x1 - x2);
        double width = Math.abs(y1 - y2);
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.printf("%.2f%n", area);
        System.out.printf("%.2f", perimeter);
    }
}
