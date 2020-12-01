import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = Double.parseDouble(scan.nextLine());; //6
        double y = Double.parseDouble(scan.nextLine());; //10
        double h = Double.parseDouble(scan.nextLine());; //5.2
        double sideArea = x * y;
        double window = 1.5 * 1.5;
        double twoSides = 2 * sideArea - 2 * window;
        double backWall = x * x;
        double entrance = 1.2 * 2;
        double backFront = 2 * backWall - entrance;
        double totalFlat = (twoSides + backFront)/3.4;
        double roofRectangle = 2*(x * y);
        double twoTriangle = 2 * (x * h /2);
        double totalRed = (roofRectangle + twoTriangle) / 4.3;
        System.out.printf("%.2f",totalFlat);
        System.out.println();
        System.out.printf("%.2f",totalRed);
    }
}
