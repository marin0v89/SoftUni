import java.util.Scanner;

public class MovieRating {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int movies = Integer.parseInt(scan.nextLine());
        double highest = 0;
        double lowest = Double.MAX_VALUE;
        double avarage = 0;
        String nameLow = "";
        String nameHigh = "";

        for (int i = 0; i < movies; i++) {
            String movieName = scan.nextLine();
            double rating = Double.parseDouble(scan.nextLine());
            if (highest < rating) {
                highest = rating;
                nameHigh = movieName;
            }
            if (lowest > rating) {
                lowest = rating;
                nameLow = movieName;
            }
            avarage += rating / movies;


        }
        //"{име на филма с най-висок рейтинг} is with highest rating: {рейтинг на филма}"
        //"{име на филма с най-нисък рейтинг} is with lowest rating: {рейтинг на филма}"
        //"Average rating: {средният рейтинг на всички филми}"
        System.out.printf("%s is with highest rating: %.1f%n",nameHigh ,highest);
        System.out.printf("%s is with lowest rating: %.1f%n",nameLow ,lowest);
        System.out.printf("Average rating: %.1f",avarage);
    }
}
