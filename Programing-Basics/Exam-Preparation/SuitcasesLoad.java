import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double trunkCapacity = Double.parseDouble(scan.nextLine());

        int counter = 1;

        String comand = scan.nextLine();
        while (!comand.equals("End")) {
            double load = Double.parseDouble(comand);
            if (counter % 3 == 0) {
                load = load + 0.10 * load;
            }
            trunkCapacity = trunkCapacity - load;

            if (trunkCapacity < 0) {
                System.out.println("No more space!");
                break;
            }
            counter++;
            comand = scan.nextLine();
        }
        if (comand.equals("End")) {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", counter-1);
    }
}
