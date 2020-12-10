package Lab;

import java.util.Scanner;

public class CalculatingRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());

        System.out.println(calculateArea(width,height));

    }

    private static  int calculateArea(int width, int height) {
        return width*height;
    }
}
