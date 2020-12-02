import java.util.Scanner;

public class MovieStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());

        String input = scan.nextLine();
       while (!input.equals("ACTION")) {

           if (input.length() > 15) {
               budget -=budget*0.20;
           }else{
               budget -= Double.parseDouble(scan.nextLine());
           }

           if (budget < 0 ) {
               break;
           }
           input= scan.nextLine();

       }
        if (budget >= 0){
            System.out.printf("We are left with %.2f leva.",budget);
        }else{
            System.out.printf("We need %.2f leva for our actors.",Math.abs(budget));

        }
    }
}
