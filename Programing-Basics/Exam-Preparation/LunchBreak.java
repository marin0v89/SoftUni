import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movieName = scan.nextLine();
        double movieLenght = Double.parseDouble(scan.nextLine());
        double relax = Double.parseDouble(scan.nextLine());
        double lunchTime = relax /8.0;
        double rest = relax /4.0;
        //double wtchTime = relax- lunchTime - rest;
        double watchingTime = Math.abs(relax - lunchTime - rest);
        if (watchingTime >=movieLenght)
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",movieName,watchingTime-movieLenght);
        else if (movieLenght>watchingTime){
            //watchingTime = Math.floor(wtchTime);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",movieName,movieLenght-watchingTime);
        }
    }
}
