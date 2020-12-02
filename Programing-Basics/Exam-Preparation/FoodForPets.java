import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        double totalFood = Double.parseDouble(scan.nextLine());

        double dogEaten = 0;
        double catEaten = 0;
        double biscuit = 0;

        for (int i = 1; i <= days; i++) {
            int dogFood = Integer.parseInt(scan.nextLine());
            int catFood = Integer.parseInt(scan.nextLine());

            if (i % 3 == 0) {
                biscuit += (dogFood + catFood) * 0.10;
            }

            dogEaten += dogFood;
            catEaten += catFood;
        }
        System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuit);
        double percentFoodEaten = (dogEaten + catEaten) / totalFood * 100;
        System.out.printf("%.2f%% of the food has been eaten.%n", percentFoodEaten);
        double percentEatenFromTheDog = dogEaten / (dogEaten + catEaten) * 100;
        System.out.printf("%.2f%% eaten from the dog.%n", percentEatenFromTheDog);
        double percentEatenFromTheCat = catEaten / (dogEaten + catEaten) * 100;
        System.out.printf("%.2f%% eaten from the cat.", percentEatenFromTheCat);
    }
}
