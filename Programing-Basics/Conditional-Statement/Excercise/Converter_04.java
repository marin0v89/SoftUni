import java.util.Scanner;

public class Converter_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        String enter = scan.nextLine();
        String exit = scan.nextLine();
        if (enter.equals("mm") && exit.equals("m")) {
            a = a / 1000;
            System.out.printf("%.3f", a);
        }
        if (enter.equals("m") && exit.equals("cm")) {
            a = a * 100;
            System.out.printf("%.3f", a);
        }
        if (enter.equals("cm") && exit.equals("mm")) {
            a = a * 10;
            System.out.printf("%.3f", a);
        }
        if (enter.equals("mm") & exit.equals("cm")) {
            a = a / 10;
            System.out.printf("%.3f", a);
        }
        if (enter.equals("cm") & exit.equals("m")) {
            a = a / 100;
            System.out.printf("%.3f", a);
        }
        if (enter.equals("m") && exit.equals("mm")) {
            a = a * 1000;
            System.out.printf("%.3f", a);
        }
    }
}
