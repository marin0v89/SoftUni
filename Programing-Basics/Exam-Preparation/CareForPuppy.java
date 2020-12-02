import java.util.Scanner;

public class CareForPuppy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int foodBought = Integer.parseInt(scan.nextLine());
        int totalFood = 0;

        String input = scan.nextLine();
        while (!input.equals("Adopted")){
            int foodEaten = Integer.parseInt(input);
            totalFood+=foodEaten;

            input= scan.nextLine();
        }
        int foodInGrams = foodBought * 1000;

        if (foodInGrams>=totalFood){
            System.out.printf("Food is enough! Leftovers: %d grams.",foodInGrams-totalFood);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.",totalFood-foodInGrams);
        }
    }
}
