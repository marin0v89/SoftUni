import java.util.Scanner;

public class SideSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int side = Integer.parseInt(scan.nextLine());
        int square = side*side;
        System.out.println(square);
    }
}
