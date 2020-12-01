import java.util.Scanner;

public class Radians {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radian = Double.parseDouble(scan.nextLine());
        double degree = radian * 180 /Math.PI;
        System.out.printf("%.0f",degree);


    }
}
