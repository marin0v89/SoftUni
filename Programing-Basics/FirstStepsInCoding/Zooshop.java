import java.util.Scanner;

public class Zooshop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogs = Integer.parseInt(scan.nextLine());
        int otherAnimals = Integer.parseInt(scan.nextLine());
        double ownDog = dogs * 2.50;
        int restAnimals = otherAnimals * 4;
        double total = ownDog + restAnimals;
        System.out.printf("%.2f lv." ,total);
    }
}
