import java.util.Scanner;

public class ClassHall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double w = Double.parseDouble(scan.nextLine());
        Double h = Double.parseDouble(scan.nextLine());
        double height = (h * 100.0) - 100;
        double width = w * 100.0;
        double deskHeight = height / 70;
        double downHeight = Math.floor(deskHeight);
        double deskWidht = width / 120.0;
        double downWidht = Math.floor(deskWidht);
        double total = (downWidht * downHeight) - 3 ;
        System.out.println(total);
    }
}
