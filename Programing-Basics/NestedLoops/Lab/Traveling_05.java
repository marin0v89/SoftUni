import java.util.Scanner;

public class Traveling_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        while (!input.equals("End")){
            double budget = Double.parseDouble(scan.nextLine());
            int sum =0;

            while (sum < budget){
                double savedMoney = Double.parseDouble(scan.nextLine());
                sum += savedMoney;
            }
            if (sum >= budget){
                System.out.printf("Going to %s!%n",input);
            }
            input =scan.nextLine();
        }
    }
}
