import java.util.Scanner;

public class FuleTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fuelType = scan.nextLine();
        int liters = Integer.parseInt(scan.nextLine());
        if (fuelType.equals("Diesel")) {
            if (liters >= 25)
                System.out.println("You have enough diesel.");
            else System.out.println("Fill your tank with diesel!");
        }
        if (fuelType.equals("Gasoline")) {
            if (liters >= 25)
                System.out.println("You have enough gasoline.");
            else System.out.println("Fill your tank with gasoline!");
        }
        if (fuelType.equals("Gas")) {
            if (liters >= 25)
                System.out.println("You have enough gas.");
            else System.out.println("Fill you tank with gas!");
        }
        if (!fuelType.equals("Diesel") && (!fuelType.equals("Gasoline") && (!fuelType.equals("Gas")))) {
            System.out.println("Invalid fuel!");
        }
    }
}
