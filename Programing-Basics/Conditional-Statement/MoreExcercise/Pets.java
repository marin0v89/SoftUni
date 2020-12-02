import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        //Първи ред – брой дни – цяло число в интервал [1…5000]
        //Втори ред – оставена храна в килограми – цяло число в интервал [0…100000]
        //Трети ред – храна на ден за кучето в килограми – реално число в интервал [0.00…100.00]
        //Четвърти ред – храна на ден за котката в килограми– реално число в интервал [0.00…100.00]
        //Пети ред – храна на ден за костенурката в грамове – реално число в интервал [0.00…10000.00]
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int foodLeft = Integer.parseInt(scan.nextLine());
        double dogFoodKilo = Double.parseDouble(scan.nextLine());
        double catFoodKilo = Double.parseDouble(scan.nextLine());
        double turtleFoodKilo = Double.parseDouble(scan.nextLine());
        double totalDogFood = days * dogFoodKilo;
        double totalCatFood = days * catFoodKilo;
        double totalTurtleFood = days * (turtleFoodKilo / 1000);
        double totalAnimalFood = totalDogFood + totalCatFood + totalTurtleFood;
        if (foodLeft >= totalAnimalFood) {
            double leftFood = Math.floor(foodLeft - totalAnimalFood);
            System.out.printf("%.0f kilos of food left.", leftFood);
        } else if (foodLeft <= totalAnimalFood) {
            double leftFood = Math.ceil(totalAnimalFood - foodLeft);
            System.out.printf("%.0f more kilos of food are needed.", leftFood);
        }
    }
}
