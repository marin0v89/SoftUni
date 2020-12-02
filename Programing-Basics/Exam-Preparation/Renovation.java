import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int wallHight = Integer.parseInt(scan.nextLine());
        int wallWidth = Integer.parseInt(scan.nextLine());
        int percent = Integer.parseInt(scan.nextLine());

        int walls = wallHight * wallWidth * 4;
        walls = (int) Math.ceil(walls - (walls / 100.0 * percent));
        String input = scan.nextLine();

        while (!input.equals("Tired!")) {
            walls -= Integer.parseInt(input);
            if (walls <= 0) {
                break;
            }
            input = scan.nextLine();
        }


        if (walls > 0) {
            System.out.printf("%d quadratic m left.", walls);
        } else if (walls == 0) {
            System.out.println("All walls are painted! Great job, Pesho!");
        } else {
            System.out.printf("All walls are painted and you have %d l paint left!", Math.abs(walls));
        }

    }
}

